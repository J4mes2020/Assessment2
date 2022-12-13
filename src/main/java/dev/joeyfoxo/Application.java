package dev.joeyfoxo;

import dev.joeyfoxo.accounts.Account;
import dev.joeyfoxo.accounts.CurrentAccount;
import dev.joeyfoxo.accounts.LoanAccount;
import dev.joeyfoxo.accounts.SavingsAccount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Application {
    public static void main(String[] args) {
        LoanAccount johnsLoanAccount = new LoanAccount(22000);
        CurrentAccount johnsCurrentAccount = new CurrentAccount();
        LoanAccount maryLoanAccount = new LoanAccount(18000);
        SavingsAccount marySavingsAccount = new SavingsAccount(200);

        payDebt(johnsLoanAccount, johnsCurrentAccount, 1300, 500, "John");
        payDebt(maryLoanAccount, marySavingsAccount, 1400, 350, "Mary");

    }

    private static <T extends Account> void payDebt(LoanAccount loanAccount, T account, int depositAmmount, int paymentAmount, String name) {
        if (!(account instanceof LoanAccount)) {
            int counter = 0;
            while (loanAccount.getBalance() > 0) {
                account.makeDeposit(depositAmmount);
                loanAccount.makePayment(account, paymentAmount);
                account.addInterest();
                counter++;
            }

            account.makeDeposit(Math.abs(loanAccount.getBalance()));
            loanAccount.setBalance(0);
            System.out.println("It'll take " + name + " " + counter + " months to repay their loan");
            System.out.println("and they have £" + round(account.getBalance(), 2) + " in their account\n");
        }
        else {
            System.out.println("Sorry you cannot pay debt out of a loan account");
        }
    }

    private static double round(double value, int places) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}