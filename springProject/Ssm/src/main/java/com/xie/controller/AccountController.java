package com.xie.controller;

import com.xie.domain.Account;
import com.xie.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/account")
public class AccountController {
    /*@Autowired
    private AccountService accountService;
    @RequestMapping("/testFindAll")
    public String  findAll(){
        List<Account> accountList = accountService.findAll();
        return "list";
    }*/
    @Autowired
    private AccountService accountService;
    @RequestMapping("/testFind/{id}")
    public String  findAll(@PathVariable("id") Integer id){
        List<Account> accountList = accountService.findAll();
        return "list";
    }
}
