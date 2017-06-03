package com.microservices.accountsviewservice.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by gtkwww on 2017/6/3.
 */
@Getter
@Builder
@AllArgsConstructor
public class GetAccountResponse {

    private final Integer id;
    private final String userName;
    private final String userPassword;
    private final String email;
    private final String phone;

}
