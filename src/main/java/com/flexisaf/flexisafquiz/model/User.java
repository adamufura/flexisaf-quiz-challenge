package com.flexisaf.flexisafquiz.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank(message = "Firstname cannot be blank")
    @Size(max = 20, message = "Firstname cannot be greater than 20 characters")
    private String firstname;

    @NotBlank(message = "Lastname cannot be blank")
    @Size(max = 20, message = "Lastname cannot be greater than 20 characters")
    private String lastname;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    @Size(min = 10, max = 15, message = "Phonenumber must be between 10 to 15 characters")
    private String phonenumber;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
