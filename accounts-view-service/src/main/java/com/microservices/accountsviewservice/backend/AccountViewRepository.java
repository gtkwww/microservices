package com.microservices.accountsviewservice.backend;

import com.microservices.common.account.AccountInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by gtkwww on 2017/5/30.
 */
public class AccountViewRepository  {

    private JdbcTemplate jdbcTemplate;

    private static final RowMapper<AccountInfo> ROW_MAPPER = (rs, rowNum) ->
            AccountInfo.builder()
                    .id(rs.getInt("id"))
                    .userName(rs.getString("user_name"))
                    .userPassword(rs.getString("user_password"))
                    .email(rs.getString("email"))
                    .phone(rs.getString("phone"))
                    .build();

    public AccountViewRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public AccountInfo findByAccountId(String accountId) {
        List<AccountInfo> accounts = jdbcTemplate.query("SELECT * FROM accounts WHERE id = ?", ROW_MAPPER, accountId);
        return CollectionUtils.isEmpty(accounts) ? null : accounts.get(0);
    }
}
