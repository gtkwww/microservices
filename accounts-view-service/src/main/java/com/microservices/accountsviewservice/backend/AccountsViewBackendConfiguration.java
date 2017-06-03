package com.microservices.accountsviewservice.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by gtkwww on 2017/6/2.
 */
@Configuration
public class AccountsViewBackendConfiguration {

    @Bean
    public  AccountQueryService accountQueryService(AccountViewRepository accountRepository){
        return new AccountQueryService(accountRepository);
    }

    @Bean
    public AccountViewRepository accountRepository(JdbcTemplate jdbcTemplate){
        return new AccountViewRepository(jdbcTemplate);
    }

}
