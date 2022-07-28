package model.services;

public interface OnlinePaymentService {

    Double paymentFee(double amount); //FAZeNDO A IMPLEMENTAÇÃO
    Double interest(double amount, int months);

}
