package com.microservices.common.account;

import lombok.*;

import java.util.Date;

/**
 * Created by gtkwww on 2017/5/23.
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfo {

    private Integer id;
    private String userName;
    private String userPassword;
    private String email;
    private String phone;
    private Date loginTime;


}
