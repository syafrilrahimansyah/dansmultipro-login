package com.dansmultipro.login.persistence;

import com.dansmultipro.login.persistence.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AccountDaoServiceImpl implements AccountDaoService{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public String getPassword(String username) {
        return accountRepository.getPassword(username);
    }

    @Override
    public Account getUser(String username) {
        return accountRepository.getUserByUsername(username);
    }
}
