package com.microservices.accountsviewservice.backend;

import com.microservices.common.account.AccountInfo;

/**
 * Created by gtkwww on 2017/5/30.
 */
public class AccountQueryService {

    private AccountViewRepository accountViewRepository;

    public AccountQueryService(AccountViewRepository accountViewRepository){
        this.accountViewRepository = accountViewRepository;
    }

    public AccountInfo findById(String accountId) {
        AccountInfo accountInfo = accountViewRepository.findById(accountId);

        if (accountInfo == null)
            throw new AccountNotFoundException(accountId);

        return accountInfo;
    }
}
