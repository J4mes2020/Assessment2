package dev.joeyfoxo.accounts;

public class LoanAccount extends Account {

    static double intrestRate = 0.012;

    public LoanAccount(int balance) {
        super(balance);
    }

    public void makePayment(Account account, double depositAmount) {

        balance -= depositAmount;
        account.balance -= depositAmount;
    }


}
