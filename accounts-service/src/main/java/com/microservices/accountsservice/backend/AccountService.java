package com.microservices.accountsservice.backend;

import com.microservices.accountsservice.backend.domain.AccountAggregate;
import com.microservices.common.account.AccountInfo;
import io.kero.eventuate.EntityWithIdAndVersion;

import java.util.concurrent.CompletableFuture;

/**
 * Created by gtkwww on 2017/5/23.
 */
public interface AccountService {

    CompletableFuture<EntityWithIdAndVersion<AccountAggregate>> createCustomer(AccountInfo accountInfo);
}
