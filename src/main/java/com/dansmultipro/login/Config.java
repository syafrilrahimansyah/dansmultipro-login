package com.dansmultipro.login;

import com.dansmultipro.login.persistence.AccountDaoService;
import com.dansmultipro.login.persistence.AccountDaoServiceImpl;
import com.dansmultipro.login.persistence.TokenDaoService;
import com.dansmultipro.login.persistence.TokenDaoServiceImpl;
import com.dansmultipro.login.rest.DansmultiproRestService;
import com.dansmultipro.login.rest.DansmultiproRestServiceImpl;
import com.dansmultipro.login.rest.entity.DansmultiproPosition;
import com.dansmultipro.login.service.AuthService;
import com.dansmultipro.login.service.AuthServiceImpl;
import com.dansmultipro.login.service.PositionService;
import com.dansmultipro.login.service.PositionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public AccountDaoService accountDaoService(){return new AccountDaoServiceImpl();
    }
    @Bean
    public TokenDaoService tokenDaoService(){return new TokenDaoServiceImpl();
    }
    @Bean
    public AuthService authService(){return new AuthServiceImpl();
    }
    @Bean
    public DansmultiproRestService dansmultiproRestService(){return new DansmultiproRestServiceImpl();
    }
    @Bean
    public PositionService positionService(){return new PositionServiceImpl();
    }
}
