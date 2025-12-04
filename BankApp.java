package com.codegnan.oopexamples;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        ba.setter(accountHolder, accountNumber, balance);
        System.out.println(" Account Created Successfully!");
        ba.create_account();
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = sc.nextDouble();
        ba.deposit(depositAmount);
        System.out.print("\nEnter withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        ba.withdraw(withdrawAmount);
        System.out.println("\n Final Account Details:");
        ba.create_account();

        sc.close();
    }
}
