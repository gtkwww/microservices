package com.microservices.accountsservice.backend;

import com.microservices.accountsservice.backend.command.AccountCommand;
import com.microservices.accountsservice.backend.domain.AccountAggregate;
import io.kero.eventuate.AggregateRepository;
import io.kero.eventuate.EventuateAggregateStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gtkwww on 2017/5/23.
 */
@Configuration
public class AccountConfiguration {

    @Bean
    public AccountService accountService(AggregateRepository<AccountAggregate, AccountCommand> accountRepository) {
        return new AccountServiceImpl(accountRepository);
    }

    @Bean
    public AggregateRepository<AccountAggregate, AccountCommand> accountRepository(EventuateAggregateStore eventStore) {
        return new AggregateRepository<>(AccountAggregate.class, eventStore);
    }
}
