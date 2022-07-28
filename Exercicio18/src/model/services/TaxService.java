package model.services;

public interface TaxService {

    double tax(double amount);

    //Essa interface obriga que todos que a implementarem deverão ter essa TaxService
}
