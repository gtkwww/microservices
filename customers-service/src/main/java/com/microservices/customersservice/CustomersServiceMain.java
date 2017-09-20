package com.microservices.customersservice;

import io.kero.eventuate.javaclient.driver.EventuateDriverConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by gtkwww on 2017/6/3.
 */
@Configuration
@Import({ CustomersServiceMain.class, EventuateDriverConfiguration.class })
@EnableAutoConfiguration
@ComponentScan
public class CustomersServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(CustomersServiceMain.class, args);
    }

}
