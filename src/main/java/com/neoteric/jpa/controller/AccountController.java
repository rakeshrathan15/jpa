package com.neoteric.jpa.controller;


import com.neoteric.jpa.exception.AccountCreationFailedException;
import com.neoteric.jpa.model.Account;
import com.neoteric.jpa.service.AccountService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AccountController {

   //  @PostMapping(value = )


    @PostMapping(value="/api/createAccount/hibernate",
            consumes = "application/json",
            produces = "application/json")
    public Account getAccountNumberfromHibernate(@RequestBody Account account)
            throws AccountCreationFailedException {

        AccountService accountService = new AccountService();
        String accountNumber =accountService.oneToManyUsingHibernate(account);
        account.setAccountNumber(accountNumber);
        return  account;

    }


}
