package com.microservices.customersservice.backend;

import com.microservices.customersservice.backend.command.CustomerCommand;
import com.microservices.customersservice.backend.domain.CustomerAggregate;
import com.microservices.customersservice.backend.domain.CustomerService;
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
