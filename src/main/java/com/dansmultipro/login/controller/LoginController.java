package com.dansmultipro.login.controller;

import com.dansmultipro.login.controller.entity.AuthRequest;
import com.dansmultipro.login.controller.entity.AuthResponse;
import com.dansmultipro.login.controller.entity.CommonResponse;
import com.dansmultipro.login.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Base64;

@EnableWebMvc
@CrossOrigin
@RestController
@RequestMapping(path = "/login")
public class LoginController extends CommonController{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AuthService authService;

    @PostMapping(path = "/submit", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponse login(@RequestBody AuthRequest authReq) throws Exception {
        AuthRequest authRequest = new AuthRequest();
        authRequest.setUsername(authReq.getUsername());
        authRequest.setPassword(Base64.getEncoder().encodeToString(authReq.getPassword().getBytes()));
        AuthResponse response = authService.doLogin(authRequest);
        return generateCommonResponse(response);
    }
}
