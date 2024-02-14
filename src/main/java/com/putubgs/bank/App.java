package com.putubgs.bank;

/**
 * Hello world!
 *
 */

import java.util.UUID;

import com.putubgs.bank.controller.BankController;

public class App 
{
    public static void main( String[] args )
    {
        BankController bank = new BankController();
        bank.createAccount();
    }
}
