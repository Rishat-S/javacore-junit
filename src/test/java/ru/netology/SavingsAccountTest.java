package ru.netology;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SavingsAccountTest {

    long amount = 10L;
    private final SavingsAccount savingsAccount = new SavingsAccount(amount);
    private final CheckingAccount checkingAccount = new CheckingAccount(amount);


    @Test
    @DisplayName("Pay from savings account")
    void pay() {

        savingsAccount.pay(amount);

        assertEquals(10, savingsAccount.getBalance());
        // hamcrest
        assertThat(10L, Matchers.equalTo(savingsAccount.getBalance()));

    }

    @Test
    @DisplayName("Transfer from savings account to checking account")
    void transfer() {

        savingsAccount.transfer(checkingAccount, amount);

        assertEquals(0, savingsAccount.getBalance());
        assertEquals(amount * 2L, checkingAccount.getBalance());
        // hamcrest
        assertThat(0L, Matchers.equalTo(savingsAccount.getBalance()));
        assertThat(amount * 2L, Matchers.equalTo(checkingAccount.getBalance()));

    }

    @Test
    @DisplayName("Add money to saving account")
    void addMoney() {

        savingsAccount.addMoney(amount);

        assertEquals(amount * 2L, savingsAccount.getBalance());
        // hamcrest
        assertThat(amount * 2L, Matchers.equalTo(savingsAccount.getBalance()));

    }
}