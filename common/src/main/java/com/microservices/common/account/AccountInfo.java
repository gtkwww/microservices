package com.microservices.common.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

/**
 * Created by gtkwww on 2017/5/23.
 */
@Getter
@Builder
@AllArgsConstructor
public class AccountInfo {

    private final Integer id;
    private final String userName;
    private final String userPassword;
    private final String email;
    private final String phone;
    private final Date loginTime;
}
