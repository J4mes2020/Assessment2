package dev.joeyfoxo.accounts;

public class SavingsAccount extends Account {

    static double intrestRate = 0.008;


    public SavingsAccount(int balance) {
        super(balance);
    }

    public SavingsAccount() {
        super();
    }

    public void addIntrest() {

        double balanceToBeAdded = balance * intrestRate;
        balance += balanceToBeAdded;
        System.out.println(balance);

    }

}
