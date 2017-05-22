package com.microservices.account;

import com.microservices.common.account.events.AccountCreatedEvent;
import io.kero.eventuate.Event;
import io.kero.eventuate.EventUtil;
import io.kero.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.List;

/**
 * Created by gtkwww on 2017/5/22.
 */
public class Account extends ReflectiveMutableCommandProcessingAggregate<Account, AccountCommand> {

    public List<Event> process(CreateAccountCommand cmd) {
        return EventUtil.events(new AccountCreatedEvent());
    }

}
