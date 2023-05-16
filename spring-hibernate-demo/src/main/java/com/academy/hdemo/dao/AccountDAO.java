package com.academy.hdemo.dao;

import java.util.List;

import com.academy.hdemo.dto.Account;
import com.academy.hdemo.dto.Transfer;

public interface AccountDAO {

    void save(Account account);

    Account findByAccountId(long id);

    void delete(Account account);

    void update(Account account);

    void transfer(Account fromAcc, Account toAcc, Transfer transfer);

    List<Account> accountList();

}
