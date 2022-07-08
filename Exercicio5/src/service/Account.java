package service;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double initialDeposit;  //opcional

    public Account (int accountNumber, String accountHolder, double initialDeposit){ //Construtor caso opte por fazer o depósito inicial
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        deposit(initialDeposit); //construtor serve para uma inicialização do objeto. Oobjeto existir de fato.
    }

    public Account (int accountNumber, String accountHolder) { //Construtor caso a pessoa não queria fazer o depósito inicial
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
    }

    private void setAccountNumber(int accountNumber){ //modificador de acesso - tipo de retorno - nome função - (tipo de entrada - parametros)
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){ //get retorna valores para quem chamou.
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder){ //void - não tem retorno.
         this.accountHolder = accountHolder; //se refere ao parametro privado, passa para o parametro privado o que está sendo alterado
    }
    public String getAccountHolder(){
        return accountHolder;
    }

    public double getInitialDeposit(){
        return initialDeposit;
    }

    public void deposit(double amount){
        initialDeposit += amount;
    };

    public void withdraw(double amount){
        initialDeposit -= amount + 5.00;
    };


    public String toString(){
        return "Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + String.format("%.2f", initialDeposit);
    }
}
