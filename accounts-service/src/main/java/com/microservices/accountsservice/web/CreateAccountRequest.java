package com.microservices.accountsservice.web;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gtkwww on 2017/6/4.
 */
@Setter
@Getter
public class CreateAccountRequest {

    private String userName;
    private String userPassword;
    private String email;
    private String phone;

}
