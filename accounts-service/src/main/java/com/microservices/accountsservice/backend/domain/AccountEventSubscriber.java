package com.microservices.accountsservice.backend.domain;

import com.microservices.accountsservice.backend.command.CreateAccountCommand;
import com.microservices.backend.common.account.AccountCreatedEvent;
import com.microservices.common.account.AccountInfo;
import io.kero.eventuate.EntityWithIdAndVersion;
import io.kero.eventuate.EventHandlerContext;
import io.kero.eventuate.EventHandlerMethod;
import io.kero.eventuate.EventSubscriber;

import java.util.concurrent.CompletableFuture;

/**
 * Created by gtkwww on 2017/6/22.
 */
@EventSubscriber(id = "accountCommandSideEventHandlers")
public class AccountEventSubscriber {



}