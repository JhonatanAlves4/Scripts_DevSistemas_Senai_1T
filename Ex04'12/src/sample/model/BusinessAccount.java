package sample.model;

public class BusinessAccount extends Account {
    //atribute
    private double loanLimit;

    //constructor
    public BusinessAccount(int number) {
        super(number);
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
