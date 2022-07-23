package com.dansmultipro.login.service;

import com.dansmultipro.login.controller.entity.AuthRequest;
import com.dansmultipro.login.controller.entity.AuthResponse;

public interface AuthService {
    AuthResponse doLogin(AuthRequest authReq) throws Exception;
}
