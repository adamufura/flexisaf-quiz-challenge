package com.flexisaf.flexisafquiz;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

public class Index {


    public static void main(String[] args) {
        String userId = "bc980f1a-a19c-484b-a39b-7525bd3ff5cf";
        String username = "exampleuser";

        String token = generateToken(userId, username);
        System.out.println("Generated Token: " + token);
    }

    private static final long jwtExpirationInMs = 86400000; // 1 day
    private static final Key jwtKey = Keys.secretKeyFor(SignatureAlgorithm.HS512); // Generate a key

    public static String generateToken(String userId, String username) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

        JwtBuilder jwtBuilder = Jwts.builder();
        jwtBuilder.setSubject(userId);
        jwtBuilder.setIssuedAt(now);
        jwtBuilder.setExpiration(expiryDate);
        jwtBuilder.claim("username", username);
        jwtBuilder.signWith(jwtKey);

        // generate a key for my app properties secured key
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
        String base64Key = Base64.getEncoder().encodeToString(key.getEncoded());
        System.out.println("Generated Key: " + base64Key);

        return jwtBuilder.compact();
    }
}

