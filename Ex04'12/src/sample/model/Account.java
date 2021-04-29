package sample.model;

public class Account {
    //Atributes
    private int number;
    private String holder;
    private double balance;

    //constructor
    public Account(int number){
        this.number = number;
    }

    //getter and setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account\n" +
                "number: " + number +
                "\nholder: " + holder + '\'' +
                "\nbalance: " + balance + "\n";
    }
}
