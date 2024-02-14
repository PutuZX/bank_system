package com.putubgs.bank.controller;

import java.util.ArrayList;
import java.util.List;
import com.putubgs.bank.model.*;
import java.util.UUID;

public class BankController {
    ArrayList<Customer> customers = new ArrayList<>();

    public void createAccount(){
        customers.add(new Customer(UUID.randomUUID().toString(), "I Putu Bagus Widia Predana", "putubaguswidia@gmail.com", "082236883438"));
        System.out.println(customers);
    }

}
