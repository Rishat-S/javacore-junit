package ru.netology;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckingAccountTest {

    long amount = 10L;
    private final CheckingAccount checkingAccount = new CheckingAccount(amount);
    private final SavingsAccount savingsAccount = new SavingsAccount(0);

    @Test
    @DisplayName("Pay from checking account")
    void pay() {

        checkingAccount.pay(amount);

        assertEquals(0, checkingAccount.getBalance());
        // hamcrest
        assertThat(0L, Matchers.equalTo(checkingAccount.getBalance()));
    }

    @Test
    @DisplayName("Transfer from checking account to savings account")
    void transfer() {

        checkingAccount.transfer(savingsAccount, amount);

        assertEquals(amount, savingsAccount.getBalance());
        assertEquals(0, checkingAccount.getBalance());
        // hamcrest
        assertThat(amount, Matchers.equalTo(savingsAccount.getBalance()));
        assertThat(0L, Matchers.equalTo(checkingAccount.getBalance()));

    }

    @Test
    @DisplayName("Add money to checking account")
    void addMoney() {

        checkingAccount.addMoney(amount);

        assertEquals(amount * 2L, checkingAccount.getBalance());
        // hamcrest
        assertThat(amount * 2L, Matchers.equalTo(checkingAccount.getBalance()));

    }
}