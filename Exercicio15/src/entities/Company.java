package entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployess;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployess) {
        super(name, anualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }

    public Integer getNumberOfEmployess() {
        return numberOfEmployess;
    }

    public void setNumberOfEmployess(Integer numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public Double tax() {
        if(numberOfEmployess > 10){
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
}
