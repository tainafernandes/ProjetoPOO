package entities;

public class BusinessAccount extends Account{ //herança

    private Double loanLimit;

    public BusinessAccount(){
        super(); //coloca caso o construtor padrao do Account modificar, ele modifica o do business
        //empty constructor
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //o super serve para mostrar que pega informações da superclasse
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
}
