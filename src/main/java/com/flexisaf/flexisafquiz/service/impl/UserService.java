package com.flexisaf.flexisafquiz.service.impl;

import com.blazebit.persistence.view.EntityViewManager;
import com.flexisaf.flexisafquiz.dto.Response;
import com.flexisaf.flexisafquiz.model.User;
import com.flexisaf.flexisafquiz.repository.UserRepository;
import com.flexisaf.flexisafquiz.security.JwtTokenProvider;
import com.flexisaf.flexisafquiz.util.FlexiException;
import com.flexisaf.flexisafquiz.views.UserView;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @Autowired
    private EntityViewManager viewManager;

    @Autowired
    private EntityManager entityManager;

    public Response registerUser(User user) {
        Response response = new Response();
        try {
            // Check if the email is already taken
            if (userRepository.existsByEmail(user.getEmail())) {
                throw new FlexiException("User with email " + user.getEmail() + " already exists");
            }
            // Encode the password and save the user
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            User savedUser = userRepository.save(user);

            // Get the UserView for the saved user
            UserView userView = viewManager.find(entityManager, UserView.class, savedUser.getId());

            // Success response
            response.setStatusCode(201);
            response.setMessage("User created successfully");
            response.setUserView(userView);

        } catch (FlexiException e) {
            response.setStatusCode(409);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error registering user: " + e.getMessage());
        }
        return response;
    }


    public Response authenticateUser(String usernameOrEmail, String password) {
        Response response = new Response();
        try {
            // Authenticate user with the provided credentials
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(usernameOrEmail, password)
            );

            // Set authentication context
            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

            UserView userView = viewManager.find(entityManager, UserView.class, userPrincipal.getId());

            // Generate JWT token
            String jwt = tokenProvider.generateToken(userPrincipal);

            // Set up response with UserView data and token
            response.setStatusCode(200);
            response.setMessage("User authenticated successfully");
            response.setToken(jwt);
            response.setRole(userView.getRole());

        } catch (BadCredentialsException ex) {
            response.setStatusCode(401); //401 Unauthorized
            response.setMessage("Invalid username or password");
        } catch (Exception e) {
            // Handle any other unexpected errors
            response.setStatusCode(500);
            response.setMessage("An error occurred during authentication: " + e.getMessage());
        }

        return response;
    }

}
