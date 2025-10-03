package com.pm.authservice.service;

import com.pm.authservice.dto.LoginRequsetDTO;
import com.pm.authservice.model.User;
import com.pm.authservice.util.JwtUtil;
import io.jsonwebtoken.JwtException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(UserService userService,
                       PasswordEncoder passwordEncoder,
                       JwtUtil jwtUtil) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public Optional<String> authenticate(LoginRequsetDTO loginRequsetDTO) {
        Optional<String> token = userService
                .findByEmail(loginRequsetDTO.getEmail())
                .filter(user -> passwordEncoder.matches(loginRequsetDTO.getPassword(), user.getPassword()))
                .map(user -> jwtUtil.generateToken(user.getEmail(),
                        user.getRole()));
        return token;

    }

    public boolean validateToken(String token) {
        try {
            jwtUtil.validateToken(token);
            return true;

        } catch (JwtException e) {
            return false;
        }
    }
}
