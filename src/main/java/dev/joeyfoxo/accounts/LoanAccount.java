package dev.joeyfoxo.accounts;

public class LoanAccount extends Account {

    static double intrestRate = 0.012;

    public LoanAccount(int balance) {
        super(balance);
    }

    public void addInterest() {

        double balanceToBeAdded = balance * intrestRate;
        balance += balanceToBeAdded;
        System.out.println(balance);

    }

    public void makePayment(CurrentAccount account, double depositAmount) {

        balance -= depositAmount;
        account.balance -= depositAmount;

    }


}
