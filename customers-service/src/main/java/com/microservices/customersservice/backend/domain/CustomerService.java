package com.microservices.customersservice.backend.domain;

import com.microservices.customersservice.backend.command.CustomerCommand;
import io.kero.eventuate.AggregateRepository;

public class CustomerService {

    private final AggregateRepository<CustomerAggregate, CustomerCommand> accountRepository;

    public CustomerService(AggregateRepository<CustomerAggregate, CustomerCommand> accountRepository) {
        this.accountRepository = accountRepository;
    }

}
