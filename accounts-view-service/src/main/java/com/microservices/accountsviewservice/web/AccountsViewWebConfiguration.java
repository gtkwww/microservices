package com.microservices.accountsviewservice.web;

import com.microservices.accountsviewservice.backend.AccountsViewBackendConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * Created by gtkwww on 2017/6/3.
 */
@Configuration
@Import({ AccountsViewBackendConfiguration.class })
@ComponentScan
public class AccountsViewWebConfiguration {

    @Bean
    public HttpMessageConverters accountsConverters() {
        HttpMessageConverter<?> additional = new MappingJackson2HttpMessageConverter();
        return new HttpMessageConverters(additional);
    }

}
