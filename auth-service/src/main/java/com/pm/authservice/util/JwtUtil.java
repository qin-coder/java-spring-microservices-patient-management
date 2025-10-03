package com.pm.authservice.util;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class JwtUtil {
    private final Key sercretKey;

    public JwtUtil(@Value("${jwt.secret}") String sercret) {
        byte[] keyBytes = Base64.getDecoder().decode(sercret.getBytes(
                StandardCharsets.UTF_8));
        this.sercretKey = Keys.hmacShaKeyFor(keyBytes);
    }

    public String generateToken(String email, String role) {
        return Jwts.builder()
                .subject(email)
                .claim("role", role)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(sercretKey)
                .compact();
    }

}
