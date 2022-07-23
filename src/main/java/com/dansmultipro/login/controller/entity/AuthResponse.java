package com.dansmultipro.login.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class AuthResponse {
    private final String access_token;
    private final String username;
    private final String token_type;
}
