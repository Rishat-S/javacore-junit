package ru.netology;

public class Main {

    public static void main(String[] args) {

        Account checkingAccount = new CheckingAccount(20);
        Account creditAccount = new CreditAccount(0);
        Account savingsAccount = new SavingsAccount(10);

        checkBalance(checkingAccount, creditAccount, savingsAccount);

        operation(checkingAccount, creditAccount);
        operation(checkingAccount, savingsAccount);
        operation(creditAccount, savingsAccount);
        operation(creditAccount, checkingAccount);
        operation(savingsAccount, checkingAccount);
        operation(savingsAccount, creditAccount);

        checkBalance(checkingAccount, creditAccount, savingsAccount);

    }

    private static void operation(Account account1, Account account2) {
        account1.pay(10);
        account1.transfer(account2, 10);
        account1.addMoney(10);
    }

    private static void checkBalance(Account checkingAccount, Account creditAccount, Account savingsAccount) {
        System.out.println(checkingAccount.getBalance());
        System.out.println(creditAccount.getBalance());
        System.out.println(savingsAccount.getBalance());
    }

}
