package ru.netology;

public class CheckingAccount extends Account {
    public CheckingAccount(long balance) {
        super(balance);
        if (balance < 0) {
            System.out.println("Баланс не может быть меньше 0.");
            this.setBalance(0);
        }
    }

    @Override
    public void pay(long amount) {
        if (this.getBalance() - amount < 0) {
            System.out.println("Не достаточно средств.");
        } else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Платёж проведён.");
        }
    }

    @Override
    public void transfer(Account account, long amount) {
        if (this.getBalance() - amount < 0) {
            System.out.println("Не достаточно средств.");
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
