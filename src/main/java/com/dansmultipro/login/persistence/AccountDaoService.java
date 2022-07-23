package com.dansmultipro.login.persistence;

import com.dansmultipro.login.persistence.entity.Account;

public interface AccountDaoService {
    String getPassword(String username);
    public Account getUser(String username);
}
