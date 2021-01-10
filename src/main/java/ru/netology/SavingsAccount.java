package ru.netology;

public class SavingsAccount extends Account {
    public SavingsAccount(long balance) {
        super(balance);
        if (balance < 0) {
            System.out.println("Баланс не может быть меньше 0.");
            this.setBalance(0);
        }
    }

    @Override
    public void pay(long amount) {
        System.out.println("Операция не возможна.");// нельзя платить
    }

    @Override
    public void transfer(Account account, long amount) {
        if (getBalance() - amount < 0) { // не может уходить в минус
            System.out.println("Не достаточно средств на счёте.");
        } else {
            this.setBalance(this.getBalance() - amount);
            account.setBalance(account.getBalance() + amount);
            System.out.println("Перевод осуществлён.");
        }

    }

    @Override
    public void addMoney(long amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("Счёт пополнен.");
    }


}
