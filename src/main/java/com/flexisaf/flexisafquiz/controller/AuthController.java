package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.dto.UserLoginDTO;
import com.flexisaf.flexisafquiz.model.User;
import com.flexisaf.flexisafquiz.security.JwtAuthenticationResponse;
import com.flexisaf.flexisafquiz.security.JwtTokenProvider;
import com.flexisaf.flexisafquiz.security.TokenBlacklist;
import com.flexisaf.flexisafquiz.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Auth Controller", description = "Authentication and Authorization")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @Autowired
    private TokenBlacklist tokenBlacklist;

    @Operation(summary = "Register a new user",
            description = "This endpoint registers a new user in the system. Provide user details in the request body.")
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @Operation(summary = "Authenticate a user",
            description = "This endpoint authenticates a user and returns a JWT token if the credentials are valid.")
    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> loginUser(@RequestBody UserLoginDTO loginDTO) {
        JwtAuthenticationResponse response = userService.authenticateUser(loginDTO.getEmail(), loginDTO.getPassword());
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Logout a user",
            description = "This endpoint logs out a user by invalidating their JWT token.")
    @SecurityRequirement(name = "bearer-jwt")
    @PostMapping("/logout")
    public ResponseEntity<String> logoutUser(HttpServletRequest request) {
        String token = tokenProvider.getJwtFromRequest(request);
        if (token != null) {
            tokenBlacklist.addToken(token);
            return ResponseEntity.ok("Successfully logged out");
        }
        return ResponseEntity.badRequest().body("No token found in request");
    }
}
