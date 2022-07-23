package com.dansmultipro.login.persistence;

import com.dansmultipro.login.persistence.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, String> {
    @Query(value = "SELECT * FROM public.account WHERE username = ?1",nativeQuery = true)
    Account getUserByUsername(String username);

    @Query(value = "SELECT password FROM public.account WHERE username = ?1",nativeQuery = true)
    String getPassword(String username);
}
