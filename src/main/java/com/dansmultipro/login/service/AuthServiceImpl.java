package com.dansmultipro.login.service;

import com.dansmultipro.login.controller.entity.AuthRequest;
import com.dansmultipro.login.controller.entity.AuthResponse;
import com.dansmultipro.login.persistence.AccountDaoService;
import com.dansmultipro.login.persistence.entity.Account;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.mapper.Mapper;
import org.apache.tomcat.util.json.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MyUserDetailService myUserDetailService;
    @Autowired
    private AccountDaoService userDaoService;
    @Autowired
    private JwtUtil jwtUtil;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public AuthResponse doLogin(AuthRequest authReq) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authReq.getUsername(), authReq.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username and password", e);
        }
        final UserDetails userDetails = myUserDetailService.loadUserByUsername(authReq.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        Account user = userDaoService.getUser(authReq.getUsername());
        return new AuthResponse(jwt, user.getUsername(), "Bearer");
    }
}
