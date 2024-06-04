package edu.miutest.demo.security.service;


import edu.miutest.demo.dto.LoginRequest;
import edu.miutest.demo.dto.LoginResponse;
import edu.miutest.demo.dto.RefreshTokenRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
