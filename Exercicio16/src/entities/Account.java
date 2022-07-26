package entities;

import exceptions.BusinessException;

public class Account {
    protected Integer number;
    protected  String holder;
    protected Double balance;
    protected Double withdrawLimit;

    public Account(){
        //empty constructor
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        validadeWithdraw(amount);
        balance -= amount;
    }

    private void validadeWithdraw(double amount){ //exceções personalizadas é bom para caprturar exceções específicas
        if(amount > getWithdrawLimit()){
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
        }
        if(amount > getBalance()){
            throw new BusinessException("Withdraw error: Not enough balance");
        }
    }
}
