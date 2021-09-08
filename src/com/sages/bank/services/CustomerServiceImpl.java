package com.sages.bank.services;

import com.sages.bank.entity.Account;
import com.sages.bank.entity.Customer;
import com.sages.bank.exceptions.BankException;
import com.sages.bank.repository.Customerdb;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer findCustomer(long bvn) throws BankException {
        Customer foundCustomer = Customerdb.getCustomers().get(bvn);
        if (foundCustomer == null){
           throw new BankException("Customer not found");
        }

        return foundCustomer;
    }

    @Override
    public Customer openAccount(Customer customer, Account account) throws BankException {
        if (customer == null || account == null){
            throw new BankException("You need a customer and account details to open a new account");
        }
        return null;
    }
}