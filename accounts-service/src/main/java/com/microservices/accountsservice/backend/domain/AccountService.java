package com.microservices.accountsservice.backend.domain;

import com.microservices.accountsservice.backend.command.AccountCommand;
import com.microservices.accountsservice.backend.command.CreateAccountCommand;
import com.microservices.common.account.AccountInfo;
import io.kero.eventuate.AggregateRepository;
import io.kero.eventuate.EntityWithIdAndVersion;

import java.util.concurrent.CompletableFuture;

/**
 * Created by gtkwww on 2017/5/23.
 */
public class AccountService {

    private final AggregateRepository<AccountAggregate, AccountCommand> accountRepository;

    public AccountService(AggregateRepository<AccountAggregate, AccountCommand> accountRepository) {
        this.accountRepository = accountRepository;
    }

    public CompletableFuture<EntityWithIdAndVersion<AccountAggregate>> createAccount(AccountInfo accountInfo) {
        return accountRepository.save(new CreateAccountCommand(accountInfo));
    }
}
