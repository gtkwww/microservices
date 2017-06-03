package com.microservices.backend.common.account;

import com.microservices.common.account.AccountInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by gtkwww on 2017/5/23.
 */
@Getter
@AllArgsConstructor
public class AccountCreatedEvent implements AccountEvent {

    private AccountInfo accountInfo;

    private AccountCreatedEvent(){}
}
