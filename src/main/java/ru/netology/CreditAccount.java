package ru.netology;

public class CreditAccount extends Account {
    public CreditAccount(long balance) {
        super(balance);
        if (balance > 0) {
            System.out.println("Баланс не может быть положительным.");
            this.setBalance(0);
        }
    }

    @Override
    public void pay(long amount) {
        this.setBalance(this.getBalance() - amount);
        System.out.println("Платёж проведён.");
    }

    @Override
    public void transfer(Account account, long amount) {
        this.setBalance(this.getBalance() - amount);
        account.setBalance(account.getBalance() + amount);
        System.out.println("Перевод осуществлён.");
    }

    @Override
    public void addMoney(long amount) {
        if (getBalance() + amount > 0) {
            System.out.println("Баланс не может быть положительным.");
        } else {
            this.setBalance(this.getBalance() + amount);
            System.out.println("Счёт пополнен.");
        }

    }

}
