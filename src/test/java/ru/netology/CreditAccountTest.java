package ru.netology;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditAccountTest {

    long amount = 10L;
    private final CreditAccount creditAccount = new CreditAccount(0);
    private final CheckingAccount checkingAccount = new CheckingAccount(amount);

    @Test
    @DisplayName("Pay from credit account")
    void pay() {

        creditAccount.pay(amount);

        assertEquals(-10, creditAccount.getBalance());
        // hamcrest
        assertThat(-10L, Matchers.equalTo(creditAccount.getBalance()));

    }

    @Test
    @DisplayName("Transfer from credit account to checking account")
    void transfer() {

        creditAccount.transfer(checkingAccount, amount);

        assertEquals(-10, creditAccount.getBalance());
        assertEquals(20, checkingAccount.getBalance());
        // hamcrest
        assertThat(-10L, Matchers.equalTo(creditAccount.getBalance()));
        assertThat(20L, Matchers.equalTo(checkingAccount.getBalance()));

    }

    @Test
    @DisplayName("Add Money to credit account")
    void addMoney() {

        creditAccount.addMoney(amount);

        assertEquals(0, creditAccount.getBalance());
        // hamcrest
        assertThat(0L, Matchers.equalTo(creditAccount.getBalance()));

    }
}