package com.neoteric.jpa.exception;

public class AccountCreationFailedException extends  Exception{

      public String message;

    public AccountCreationFailedException(String msg) {

        this.message = msg;
    }
}