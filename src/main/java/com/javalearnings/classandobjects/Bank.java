package com.javalearnings.classandobjects;

import java.util.*;
public class Bank {
    private final Integer bankId;
    private final String bankName;
    private final String ifscCode;
    private final List<Account> bankAccounts;

    public Bank(final Integer bankId, final String bankName, final String ifscCode) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.bankAccounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.bankAccounts.add(account);
    }

    public Integer getBankId() {
        return bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public List<Account> getBankAccounts() {
        return bankAccounts;
    }

    public static void main(String[] args) {
        // Create Banks
        Bank abcBankOfIndia = new Bank(1001, "ABC Bank of India", "ABC12345");
        Bank xyzBankOfIndia = new Bank(1002, "xyz Bank of India", "XYZ12345");

        //Create Address
        Address jagadeeshPrimaryAddress = new Address("street a", "veeraganur", "salem",
                "tamil nadu", "India", 636116);
        Address sasiPrimaryAddress = new Address("street a", "veeraganur", "salem",
                "tamil nadu", "India", 636116);
        Address vickyPrimaryAddress = new Address("street a", "veeraganur", "salem",
                "tamil nadu", "India", 636116);

        //Create Accounts
        Account jagadeeshAccount = new Account("Jagadeesh", 7397, "22395701",
                1000.0, jagadeeshPrimaryAddress);
        Account vickyAccount = new Account("vicky", 7397, "22395701",
                1000.0, vickyPrimaryAddress);
        Account sasiAccount = new Account("Sasi Prakash", 7398, "29395701",
                1000.0, sasiPrimaryAddress);

        //Link accounts to bank
        abcBankOfIndia.addAccount(jagadeeshAccount);
        abcBankOfIndia.addAccount(vickyAccount);
        xyzBankOfIndia.addAccount(sasiAccount);
        System.out.println("Before Withdraw: " + jagadeeshAccount.getAccountBalance());
        jagadeeshAccount.withdraw(100);
        System.out.println("After Withdraw: " + jagadeeshAccount.getAccountBalance());

        //Print All Bank,Account,AddressDetails
        System.out.println(abcBankOfIndia.getBankId());
        System.out.println(abcBankOfIndia.getBankName());
        System.out.println(abcBankOfIndia.getIfscCode());

        System.out.println("----------------- Accounts ---------------");
        for (Account account: abcBankOfIndia.getBankAccounts()) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getName());
            System.out.println("Aadhar Number: " + account.getAadharNumber());
            System.out.println("Account balance: " + account.getAccountBalance());


            Address primaryAddress = account.getPrimaryAddress();
            System.out.println("-----------Address------------------");
            System.out.println("Line1: " + primaryAddress.getAddressLine1());
            System.out.println("Line2: " + primaryAddress.getAddressLine2());
            System.out.println("City: " + primaryAddress.getCity());
            System.out.println("State: " + primaryAddress.getState());
            System.out.println("Pin code: " + primaryAddress.getPinCode());

            Address secondaryAddress = account.getSecondaryAddress();
            if (secondaryAddress != null) {
                System.out.println(secondaryAddress.getAddressLine1());
                System.out.println(secondaryAddress.getAddressLine2());
                System.out.println(secondaryAddress.getCity());
                System.out.println(secondaryAddress.getState());
                System.out.println(secondaryAddress.getPinCode());
                System.out.println("--------------------------------");
            }
            System.out.println("-------------------------------------");
        }

        }
    }
