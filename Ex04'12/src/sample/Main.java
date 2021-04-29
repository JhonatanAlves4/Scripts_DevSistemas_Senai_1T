package sample;

import sample.model.Account;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(876);
        account.setHolder("Jhonatan Alves Pereira");
        System.out.println(account);

        account.deposit(6000);
        System.out.println(account);

        account.withdraw(4000);
        System.out.println(account);
    }
}
