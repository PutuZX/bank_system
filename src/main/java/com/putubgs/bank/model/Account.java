package com.putubgs.bank.model;

public class Account {
    private String accountId;
    private String customerId;
    private String accountOwner;
    private int balance;
    private int accountNumber;
    private String accountType;

    Account(String accountId, String customerId, String accountOwner, int balance, int accountNumber, String accountType){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
    }

    public String getAccountOwner(){
        return this.accountOwner;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public String getAccountId(){
        return this.accountId;
    }

    public String getCustomerId(){
        return this.customerId;
    }

    public int getBalace(){
        return this.balance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountOwner(String accountOwner){
        this.accountOwner = accountOwner;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public void setAccountId(String accountId){
        this.accountId = accountId;
    }

    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
}
