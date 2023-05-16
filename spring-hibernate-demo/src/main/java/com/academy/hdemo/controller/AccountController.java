package com.academy.hdemo.controller;

import com.academy.hdemo.dto.Account;
import com.academy.hdemo.dto.Transfer;
import com.academy.hdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;
    Transfer transfer;

    @GetMapping("/detail")
    public Account detail(@RequestParam long accountId) {
        return accountService.findById(accountId);
    }

    @PostMapping("/new")
    public void newAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    @PutMapping
    void updateAccount(@RequestBody Account account) {
        accountService.update(account);
    }

    @PutMapping("/transfer")
    public String transaction(@RequestBody Transfer transfer){

        Account fromAcc = accountService.findById(transfer.getFrom());
        Account toAcc = accountService.findById(transfer.getTo());

        if(transfer.getBalance()<fromAcc.getBalance()) {
            accountService.transferMoney(fromAcc, toAcc, transfer);
            return "Money has been transfered";
        }
        else{
            return "Not enough money";
        }

    }

    @DeleteMapping("/delete")
    void delete(@RequestBody Account account) {
        accountService.deleteAccount(account);
    }

    @GetMapping("/all")
    public List allAccount() {
        return accountService.getAllAccounts();
    }


}
