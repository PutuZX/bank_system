package com.putubgs.bank.model;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phoneNum;

    public Customer(String customerId, String name, String email, String phoneNum){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    } 

    public String getCustomerId(){
        return this.customerId;
    }

    public String getPhoneNum(){
        return this.phoneNum;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    
}  
