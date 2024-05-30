package com.flexisaf.flexisafquiz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers(
                                "/api/users/register",
                                "/api/users/login",
                                "/api/subjects/**",
                                "/api/questions/**",
                                "/api/quizzes/**",
                                "/api/exams/**"
                        )
                )
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(
                                        "/api/users/register",
                                        "/api/users/login"
                                ).permitAll()
                                .requestMatchers(HttpMethod.GET, "/api/subjects/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/subjects/**").permitAll()

                                .requestMatchers(HttpMethod.GET, "/api/questions/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/questions/**").permitAll()
                                .requestMatchers(HttpMethod.PUT, "/api/questions/**").permitAll()
                                .requestMatchers(HttpMethod.DELETE, "/api/questions/**").permitAll()

                                .requestMatchers(HttpMethod.GET, "/api/quizzes/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/quizzes/**").permitAll()
                                .requestMatchers(HttpMethod.DELETE, "/api/quizzes/**").permitAll()

                                .requestMatchers(HttpMethod.GET, "/api/exams/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/exams/**").permitAll()
                                .anyRequest().authenticated()
                );

        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}