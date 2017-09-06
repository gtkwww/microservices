package com.microservices.accountsviewservice.backend;

import com.microservices.common.account.AccountInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.CollectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

/**
 * Created by gtkwww on 2017/5/30.
 */
public class AccountViewRepository {

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

    public AccountInfo findById(String accountId) {
        List<AccountInfo> accounts = jdbcTemplate.query("SELECT * FROM accounts WHERE id = ?", ROW_MAPPER, accountId);
        return CollectionUtils.isEmpty(accounts) ? null : accounts.get(0);
    }

    public void create(final AccountInfo info) {
        final String sql = "INSERT INTO `accounts`" +
                "(`user_name`," +
                "`user_password`," +
                "`email`," +
                "`phone`)" +
                "VALUES" +
                "(?, ?, ?, ?)";

        jdbcTemplate.update((Connection con) -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, info.getUserName());
            ps.setString(2, info.getUserPassword());
            ps.setString(3, info.getEmail());
            ps.setString(4, info.getPhone());
            return ps;
        });

    }

}
