package com.microservices.backend.common.account;

import com.microservices.common.account.AccountInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by gtkwww on 2017/5/23.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreatedEvent implements AccountEvent {

    private AccountInfo accountInfo;

}
