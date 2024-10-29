package com.flexisaf.flexisafquiz.security;

import com.flexisaf.flexisafquiz.service.impl.UserPrincipal;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.Date;

@Component
public class JwtTokenProvider {

    @Value("${jwtSecret}")
    private String jwtSecret;

    @Value("${jwtExpirationInMs}")
    private long jwtExpirationInMs;

    private Key jwtKey;

    @Autowired
    private TokenBlacklist tokenBlacklist;

    @PostConstruct
    public void init() {
        // Initialize the key after the properties have been injected
        this.jwtKey = Keys.hmacShaKeyFor(jwtSecret.getBytes());
    }

    public String generateToken(UserPrincipal userPrincipal) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        Date expiryDate = new Date(nowMillis + jwtExpirationInMs);

        JwtBuilder jwtBuilder = Jwts.builder();
        jwtBuilder.setSubject(userPrincipal.getId().toString());
        jwtBuilder.setIssuedAt(now);
        jwtBuilder.setExpiration(expiryDate);
        jwtBuilder.claim("email", userPrincipal.getUsername());
        jwtBuilder.signWith(jwtKey, SignatureAlgorithm.HS512);

        return jwtBuilder.compact();
    }

    public String getUserEmailFromJWT(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(jwtKey)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return (String) claims.get("email");
    }

    public boolean validateToken(String authToken) {
        try {
            if (tokenBlacklist.isTokenBlacklisted(authToken)) {
                return false;
            }
            Jwts.parserBuilder().setSigningKey(jwtKey).build().parseClaimsJws(authToken);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getJwtFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }
}
