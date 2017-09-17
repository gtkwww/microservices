package com.microservices.accountsservice.backend;

import com.microservices.accountsservice.backend.command.CustomerCommand;
import com.microservices.accountsservice.backend.domain.CustomerAggregate;
import com.microservices.accountsservice.backend.domain.CustomerService;
import io.kero.eventuate.AggregateRepository;
import io.kero.eventuate.EventuateAggregateStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerBackendConfiguration {

    @Bean
    public CustomerService accountService(AggregateRepository<CustomerAggregate, CustomerCommand> customerRepository) {
        return new CustomerService(customerRepository);
    }

    @Bean
    public AggregateRepository<CustomerAggregate, CustomerCommand> customerRepository(EventuateAggregateStore eventStore) {
        return new AggregateRepository<>(CustomerAggregate.class, eventStore);
    }

}
