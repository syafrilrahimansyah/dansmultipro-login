package com.dansmultipro.login.service;

import com.dansmultipro.login.persistence.AccountDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private AccountDaoService userDaoService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        String pass = userDaoService.getPassword(username);
        return new User(username, pass, new ArrayList<>());
    }
}
