package com.microservices.accountsviewservice.backend;

import io.kero.eventuate.javaclient.spring.EnableEventHandlers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by gtkwww on 2017/6/2.
 */
@Configuration
@EnableEventHandlers
public class AccountsViewBackendConfiguration {

    @Bean
    public AccountViewEventSubscriber accountViewEventSubscriber(AccountInfoUpdateService accountInfoUpdateService) {
        return new AccountViewEventSubscriber(accountInfoUpdateService);
    }

    @Bean
    public AccountInfoUpdateService accountInfoUpdateService(AccountViewRepository accountRepository) {
        return new AccountInfoUpdateService(accountRepository);
    }

    @Bean
    public  AccountQueryService accountQueryService(AccountViewRepository accountRepository){
        return new AccountQueryService(accountRepository);
    }

    @Bean
    public AccountViewRepository accountRepository(JdbcTemplate jdbcTemplate){
        return new AccountViewRepository(jdbcTemplate);
    }

}
