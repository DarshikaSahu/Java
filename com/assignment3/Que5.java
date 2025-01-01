package com.assignment3;

import java.util.Scanner;

class BankAccount {

    Scanner s = new Scanner(System.in);
    String name;
    int accountNumber;
    String typeOfAccount;
    float balanceAmount;

    void assignValue() {
        System.out.println("Enter name of account holder: ");
        name = s.next();
        System.out.println("Enter Account number of account holder: ");
        accountNumber = s.nextInt();
        System.out.println("Enter account type of account holder: (SA or CA) ");
        typeOfAccount = s.next();
    }

    void depositAmount() {
        int choice = 0;
        System.out.println("Do you want to deposit(Enter 1 to deposit amount or other than 1 to exit): ");
        choice = s.nextInt();
        if (choice == 1) {
            System.out.println("Enter Amount to be deposited: ");
            balanceAmount = s.nextFloat();
            System.out.println("Balance Amount after deposit: " + balanceAmount);
        }
    }

    void withdrawAmount() {
        int choice = 0;
        System.out.println("Do you want to withdraw (Enter 1 to withdraw amount or other than 1 to exit): ");
        choice = s.nextInt();
        if (choice == 1) {
            System.out.println("Enter  Amount to be withdrawn: ");
            float withdraw = s.nextFloat();
            if (withdraw <= balanceAmount) {
                balanceAmount -= withdraw;
                System.out.println("Balance Amount after withdrawal: " + balanceAmount);
            } else {
                System.out.println("You can not withdraw more than Balance Amount. ");
            }

        }
    }

    void accountDetailsDisplay() {
        System.out.println("\nname of account holder: " + name);
        System.out.println("Account number of account holder: " + accountNumber);
        System.out.println("Account type of account holder:" + typeOfAccount);
        System.out.println("Balance Amount: " + balanceAmount);
    }
}

public class Que5 {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.assignValue();
        b1.depositAmount();
        b1.withdrawAmount();
        b1.accountDetailsDisplay();
    }

}
