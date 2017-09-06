package com.microservices.accountsviewservice.backend;

import com.microservices.backend.common.account.AccountCreatedEvent;
import com.microservices.common.account.AccountInfo;
import io.kero.eventuate.DispatchedEvent;
import io.kero.eventuate.EventHandlerMethod;
import io.kero.eventuate.EventSubscriber;

/**
 * Created by gtkwww on 2017/7/12.
 */
@EventSubscriber(id = "accountQuerySideEventHandlers")
public class AccountViewEventSubscriber {

    private AccountInfoUpdateService accountInfoUpdateService;

    public AccountViewEventSubscriber(AccountInfoUpdateService accountInfoUpdateService) {
        this.accountInfoUpdateService = accountInfoUpdateService;
    }

    @EventHandlerMethod
    public void create(DispatchedEvent<AccountCreatedEvent> de) {
        AccountInfo accountInfo = de.getEvent().getAccountInfo();
        accountInfoUpdateService.create(accountInfo);
    }

}
