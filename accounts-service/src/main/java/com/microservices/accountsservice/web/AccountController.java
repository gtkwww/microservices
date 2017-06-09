package com.microservices.accountsservice.web;

import com.microservices.accountsservice.backend.domain.AccountService;
import com.microservices.common.account.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

/**
 * Created by gtkwww on 2017/6/3.
 */
@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;


    //@RequestMapping(method = RequestMethod.POST)
    //public CompletableFuture<CreateAccountResponse> createAccount(@Validated @RequestBody CreateAccountRequest createAccountRequest) {
    @RequestMapping(method = RequestMethod.GET)
    public CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest createAccountRequest) {
        AccountInfo accountInfo = AccountInfo.builder()
                .userName(createAccountRequest.getUserName())
                .userPassword(createAccountRequest.getUserPassword())
                .email(createAccountRequest.getEmail())
                .phone(createAccountRequest.getPhone())
                .build();

        return accountService.createAccount(accountInfo)
                .thenApply(entityAndEventInfo -> new CreateAccountResponse(entityAndEventInfo.getEntityId()));
    }
}
