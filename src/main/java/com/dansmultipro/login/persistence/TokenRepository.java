package com.dansmultipro.login.persistence;

import com.dansmultipro.login.persistence.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, String> {
}
