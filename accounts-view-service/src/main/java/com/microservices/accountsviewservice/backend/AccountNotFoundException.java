package com.microservices.accountsviewservice.backend;

/**
 * Created by gtkwww on 2017/6/3.
 */
public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(String accountId) {
        super("Account not found " + accountId);
    }

}
