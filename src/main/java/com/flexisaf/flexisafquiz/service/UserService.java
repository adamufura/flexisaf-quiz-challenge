package com.flexisaf.flexisafquiz.service;

import com.flexisaf.flexisafquiz.model.User;
import com.flexisaf.flexisafquiz.repository.UserRepository;
import com.flexisaf.flexisafquiz.security.JwtAuthenticationResponse;
import com.flexisaf.flexisafquiz.security.JwtTokenProvider;
import com.flexisaf.flexisafquiz.util.AuthenticationException;
import com.flexisaf.flexisafquiz.util.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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

    public User registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new UserAlreadyExistsException("User with email " + user.getEmail() + " already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public JwtAuthenticationResponse authenticateUser(String usernameOrEmail, String password) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(usernameOrEmail, password)
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

            String jwt = tokenProvider.generateToken(userPrincipal);
            return new JwtAuthenticationResponse(userPrincipal.getUsername(), jwt);
        } catch (BadCredentialsException ex) {
            throw new AuthenticationException("Invalid username or password");
        }
    }
}
