package com.microservices.accountsviewservice.backend;

import com.microservices.common.account.AccountInfo;

/**
 * Created by gtkwww on 2017/5/30.
 */
public class AccountInfoUpdateService {

    private AccountViewRepository accountViewRepository;

    public AccountInfoUpdateService(AccountViewRepository accountViewRepository) {
        this.accountViewRepository = accountViewRepository;
    }

    public void create(AccountInfo accountInfo) {
        accountViewRepository.create(accountInfo);
    }

}
