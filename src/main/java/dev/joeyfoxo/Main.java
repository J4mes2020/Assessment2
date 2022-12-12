package dev.joeyfoxo;

import dev.joeyfoxo.accounts.CurrentAccount;
import dev.joeyfoxo.accounts.LoanAccount;
import dev.joeyfoxo.accounts.SavingsAccount;

import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        savingsAccount.addIntrest();

    }
}