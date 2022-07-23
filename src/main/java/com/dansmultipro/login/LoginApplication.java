package com.dansmultipro.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.dansmultipro.login.controller","com.dansmultipro.login.service","com.dansmultipro.login"})
@Import({Config.class,Security.class})
@EnableJpaRepositories
public class LoginApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}
}
