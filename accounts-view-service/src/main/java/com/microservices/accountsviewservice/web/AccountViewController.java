package com.microservices.accountsviewservice.web;

import com.microservices.accountsviewservice.backend.AccountNotFoundException;
import com.microservices.accountsviewservice.backend.AccountQueryService;
import com.microservices.common.account.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gtkwww on 2017/5/30.
 */
@RestController
@RequestMapping("/api/accounts")
public class AccountViewController {

    @Autowired
    private AccountQueryService accountQueryService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<GetAccountResponse> get(@PathVariable("id") String accountId) {
        AccountInfo accountInfo = accountQueryService.findById(accountId);

        GetAccountResponse getAccountResponse = GetAccountResponse.builder()
                .id(accountInfo.getId())
                .userName(accountInfo.getUserName())
                .userPassword(accountInfo.getUserPassword())
                .email(accountInfo.getEmail())
                .phone(accountInfo.getPhone())
                .build();

        return ResponseEntity.ok().body(getAccountResponse);
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "account not found")
    @ExceptionHandler(AccountNotFoundException.class)
    public void accountNotFound() {
    }

}
