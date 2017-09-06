package com.microservices.backend.common.account;

import io.kero.eventuate.Event;
import io.kero.eventuate.EventEntity;

/**
 * Created by gtkwww on 2017/5/23.
 */
@EventEntity(entity = "com.microservices.accountsservice.backend.domain.AccountAggregate")
public interface AccountEvent extends Event {
}
