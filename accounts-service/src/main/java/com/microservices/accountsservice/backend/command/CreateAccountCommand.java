package com.microservices.accountsservice.backend.command;

import com.microservices.common.account.AccountInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by gtkwww on 2017/5/22.
 */
@Getter
@AllArgsConstructor
public class CreateAccountCommand implements AccountCommand {

    private AccountInfo accountInfo;
}
