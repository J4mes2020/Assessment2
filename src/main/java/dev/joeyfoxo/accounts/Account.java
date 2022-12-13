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

     }

     public void setBalance(int newBalance) {
          balance = newBalance;
     }

     public void addInterest() {
     }
}
