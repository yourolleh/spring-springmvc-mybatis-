package com.xie.service.impl;

import com.xie.dao.AccountDao;
import com.xie.domain.Account;
import com.xie.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
       List<Account> accountList = accountDao.findAll();
       return accountList;

    }

    @Override
    public void saveAccount(Account account) {
        //accountDao.saveAccount(account);
    }
}
