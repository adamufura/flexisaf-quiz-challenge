package com.flexisaf.flexisafquiz.security;

public class JwtAuthenticationResponse {
    private String email;
    private String accessToken;

    public JwtAuthenticationResponse(String email, String accessToken) {
        this.email = email;
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
