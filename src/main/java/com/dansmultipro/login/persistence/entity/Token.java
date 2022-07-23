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
@Table(name = "token")
public class Token {
    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "token")
    private String token;
    @Column(name = "is_actived")
    private boolean actived;
}
