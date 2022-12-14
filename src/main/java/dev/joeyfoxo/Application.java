package dev.joeyfoxo;

import dev.joeyfoxo.accounts.Account;
import dev.joeyfoxo.accounts.CurrentAccount;
import dev.joeyfoxo.accounts.LoanAccount;
import dev.joeyfoxo.accounts.SavingsAccount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Application {
    public static void main(String[] args) {
        LoanAccount johnsLoanAccount = new LoanAccount(22000); //Instantiating johns loan account with 22000
        CurrentAccount johnsCurrentAccount = new CurrentAccount(); //Instantiating johns current account
        LoanAccount maryLoanAccount = new LoanAccount(18000); //Instantiating mary's  loan account with 18000
        SavingsAccount marySavingsAccount = new SavingsAccount(200);//Instantiating marys savings account

        payDebt(johnsLoanAccount, johnsCurrentAccount, 1300, 500, "John");
        payDebt(maryLoanAccount, marySavingsAccount, 1400, 350, "Mary");

    }

    private static <T extends Account> void payDebt(LoanAccount loanAccount, T account, int depositAmmount, int paymentAmount, String name) {
        if (!(account instanceof LoanAccount)) { //If the provided account isn't a loan account
            int monthCounter = 0;
            while (loanAccount.getBalance() > 0) { //While the debt hasn't been paid off
                account.makeDeposit(depositAmmount); //Add the deposit amount to mary or johns account
                loanAccount.makePayment(account, paymentAmount); //Make a transfer and pay off a set amount of debt
                account.addInterest(); //Add intrest to their account
                loanAccount.addInterest(); //Add intrest to the loan account
                monthCounter++; //Increase the month by one
            }

            account.makeDeposit(Math.abs(loanAccount.getBalance())); //If the balance is below 0 add the extra back to their account
            loanAccount.setBalance(0); //And a loan cannot be negative so set it to 0
            System.out.println("It'll take " + name + " " + monthCounter + " months to repay their loan");
            System.out.println("and they have £" + round(account.getBalance(), 2) + " in their account\n");
        } else {
            System.out.println("Sorry you cannot pay debt out of a loan account");
        }
    }

    private static double round(double value, int places) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}