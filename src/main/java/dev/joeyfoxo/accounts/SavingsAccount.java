package dev.joeyfoxo.accounts;

public class SavingsAccount extends Account {

    static double intrestRate = 0.008;


    public SavingsAccount(int balance) {
        super(balance);
    }

    public SavingsAccount() {
        super();
    }

    @Override
    public void addInterest() {

        double balanceToBeAdded = balance * intrestRate;
        balance += balanceToBeAdded;

    }

}
