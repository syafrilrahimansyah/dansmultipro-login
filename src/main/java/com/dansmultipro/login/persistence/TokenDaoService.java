package com.dansmultipro.login.persistence;

public interface TokenDaoService {
    boolean getStatus(String token);
    void setStatus(String username, String token, boolean status);
}
