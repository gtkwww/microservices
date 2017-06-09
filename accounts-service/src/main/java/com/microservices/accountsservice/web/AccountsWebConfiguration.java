package com.microservices.accountsservice.web;

import com.microservices.accountsservice.backend.AccountsBackendConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by gtkwww on 2017/6/3.
 */
@Configuration
@Import({ AccountsBackendConfiguration.class })
@ComponentScan
public class AccountsWebConfiguration {
}
