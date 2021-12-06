package com.difera.springsecurity.models;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private final String jwt;
}
