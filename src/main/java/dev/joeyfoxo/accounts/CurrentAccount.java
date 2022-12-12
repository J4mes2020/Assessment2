package dev.joeyfoxo.accounts;

public class CurrentAccount extends Account {

    static double intrestRate = 0.0006;

    public CurrentAccount(int balance) {
        super(balance);
    }

    public CurrentAccount() {
    }

    public void addInterest() {

        double balanceToBeAdded = balance * intrestRate;
        balance += balanceToBeAdded;
        System.out.println("Your new interest is " + balanceToBeAdded);

    }
}
