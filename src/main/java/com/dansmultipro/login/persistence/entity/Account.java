package com.dansmultipro.login.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
}
