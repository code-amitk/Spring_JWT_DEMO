package com.jwt.example.models;

import lombok.*;
import org.springframework.web.service.annotation.GetExchange;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest {
    private String email;
    private String password;
}
