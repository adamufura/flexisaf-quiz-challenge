package com.flexisaf.flexisafquiz.controller;

import com.flexisaf.flexisafquiz.model.User;
import com.flexisaf.flexisafquiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User loginRequest) {
        return userService.authenticateUser(loginRequest.getEmail(), loginRequest.getPassword())
                .map(user -> {
                    return ResponseEntity.ok("Login successful");
                })
                .orElseGet(() -> {
                    return ResponseEntity.status(401).body("Invalid login credentials");
                });
    }
}