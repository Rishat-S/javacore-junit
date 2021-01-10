package ru.netology;

public abstract class Account {
    private long balance = 0;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    protected abstract void pay(long amount);

    protected abstract void transfer(Account account, long amount);

    protected abstract void addMoney(long amount);
}
