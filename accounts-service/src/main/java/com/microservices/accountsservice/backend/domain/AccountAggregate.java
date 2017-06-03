package com.microservices.accountsservice.backend.domain;

import com.microservices.accountsservice.backend.command.AccountCommand;
import com.microservices.accountsservice.backend.command.CreateAccountCommand;
import com.microservices.backend.common.account.AccountCreatedEvent;
import io.kero.eventuate.Event;
import io.kero.eventuate.EventUtil;
import io.kero.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.List;

/**
 * Created by gtkwww on 2017/5/22.
 */
public class AccountAggregate extends ReflectiveMutableCommandProcessingAggregate<AccountAggregate, AccountCommand> {

    public List<Event> process(CreateAccountCommand cmd) {
        return EventUtil.events(new AccountCreatedEvent(cmd.getAccountInfo()));
    }

}
