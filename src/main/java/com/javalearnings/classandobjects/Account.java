package com.javalearnings.classandobjects;

public class Account {
    private final String name;
    private final Integer accountNumber;
    private final String aadharNumber;
    private final Address primaryAddress;
    private Address secondaryAddress;
    private Double accountBalance;
    
    public Account(final String name, final Integer accountNumber, final String aadharNumber,
                   Double accountBalance, Address primaryAddress) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.aadharNumber = aadharNumber;
        this.accountBalance = accountBalance;
        this.primaryAddress = primaryAddress;
    }

    public String getName() {
        return name;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public Address getSecondaryAddress() {
        return secondaryAddress;
    }

    public Double getAccountBalance() {
        return this.accountBalance;
    }
    
    public void setSecondaryAddress(Address secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }
    
    
    public void withdraw(Integer withdrawAmount) {
        this.accountBalance -= withdrawAmount;
    }
    
    public void deposit(Integer depositAmount) {
        this.accountBalance += depositAmount;
    }         

}

