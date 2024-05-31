package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.model.User;
import com.flexisaf.flexisafquiz.security.JwtAuthenticationResponse;
import com.flexisaf.flexisafquiz.security.JwtTokenProvider;
import com.flexisaf.flexisafquiz.security.TokenBlacklist;
import com.flexisaf.flexisafquiz.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenProvider tokenProvider;

    @Autowired
    private TokenBlacklist tokenBlacklist;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> loginUser(@RequestBody User user) {
        JwtAuthenticationResponse response = userService.authenticateUser(user.getEmail(), user.getPassword());
        return ResponseEntity.ok(response);
    }

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
