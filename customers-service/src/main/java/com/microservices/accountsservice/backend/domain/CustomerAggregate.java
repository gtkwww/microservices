package com.microservices.accountsservice.backend.domain;

import com.microservices.accountsservice.backend.command.CustomerCommand;
import io.kero.eventuate.ReflectiveMutableCommandProcessingAggregate;

public class CustomerAggregate extends ReflectiveMutableCommandProcessingAggregate<CustomerAggregate, CustomerCommand> {



}
