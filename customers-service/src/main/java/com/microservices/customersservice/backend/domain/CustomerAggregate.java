package com.microservices.customersservice.backend.domain;

import com.microservices.customersservice.backend.command.CustomerCommand;
import io.kero.eventuate.ReflectiveMutableCommandProcessingAggregate;

public class CustomerAggregate extends ReflectiveMutableCommandProcessingAggregate<CustomerAggregate, CustomerCommand> {



}
