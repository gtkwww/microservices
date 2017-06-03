package com.microservices.accountsviewservice;

import com.microservices.accountsviewservice.web.AccountsViewWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by gtkwww on 2017/5/30.
 */
@Configuration
@Import({ AccountsViewWebConfiguration.class })
@EnableAutoConfiguration
public class AccountsViewServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(AccountsViewServiceMain.class, args);
    }

}
