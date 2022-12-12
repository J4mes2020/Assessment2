package dev.joeyfoxo;

import dev.joeyfoxo.accounts.CurrentAccount;
import dev.joeyfoxo.accounts.LoanAccount;
import dev.joeyfoxo.accounts.SavingsAccount;

public class Application {
    public static void main(String[] args) {
        LoanAccount johnsLoanAccount = new LoanAccount(220000);
        CurrentAccount johnsCurrentAccount = new CurrentAccount();
        johnsCurrentAccount.makeDeposit(1300);
        johnsLoanAccount.makePayment(johnsCurrentAccount, 500);


        System.out.println(johnsLoanAccount.getBalance());
        System.out.println(johnsCurrentAccount.getBalance());
    }
}