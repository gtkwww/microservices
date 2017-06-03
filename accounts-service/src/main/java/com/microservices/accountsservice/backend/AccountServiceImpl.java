package com.microservices.accountsservice.backend;

import com.microservices.accountsservice.backend.command.AccountCommand;
import com.microservices.accountsservice.backend.command.CreateAccountCommand;
import com.microservices.accountsservice.backend.domain.AccountAggregate;
import com.microservices.common.account.AccountInfo;
import io.kero.eventuate.AggregateRepository;
import io.kero.eventuate.EntityWithIdAndVersion;

import java.util.concurrent.CompletableFuture;

/**
 * Created by gtkwww on 2017/5/23.
 */
public class AccountServiceImpl implements AccountService {

    private final AggregateRepository<AccountAggregate, AccountCommand> accountRepository;

    public AccountServiceImpl(AggregateRepository<AccountAggregate, AccountCommand> accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public CompletableFuture<EntityWithIdAndVersion<AccountAggregate>> createCustomer(AccountInfo accountInfo) {
        return accountRepository.save(new CreateAccountCommand(accountInfo));
    }
}
