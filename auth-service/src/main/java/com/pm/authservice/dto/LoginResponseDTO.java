package com.pm.authservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class LoginResponseDTO {
    private final String token;
    public LoginResponseDTO(String token) {
        this.token = token;
    }

}
