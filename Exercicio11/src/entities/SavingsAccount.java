package entities;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(){
        super();
        //empty constructor
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override //usado para sobrepor, pois numa conta poupança não tem cobrança de taxa
    public void withdraw(double amount){
        balance -= amount;
    }
}
