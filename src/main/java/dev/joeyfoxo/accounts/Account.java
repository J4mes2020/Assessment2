package dev.joeyfoxo.accounts;

public abstract class Account {
     double balance;

     public Account() {
          balance = 0;
     }

     public Account(double balance) {
          this.balance = balance;
     }

     public double getBalance() {
          return balance;
     }

     public void makeDeposit(double amount) {
          balance = balance + amount;
          System.out.println("The new balance is " + balance);

     }

     public void makePayment(LoanAccount account, double depositAmount) {

          account.balance += depositAmount;
          balance -= depositAmount;

     }







}
