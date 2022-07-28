package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    //Vamos ter composição de serviços - Classe fechada para alteração e aberta para inclusão
    //Inversão de controle é NÃO deixar a classe responsavel em instanciar. Outro que vai dar o NEW (instanciar)
    //De forma manual é um constructor, get

    private OnlinePaymentService onlinePaymentService; //declara com o tipo da interface

    public ContractService(OnlinePaymentService onlinePaymentService){ //INJETANDO
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months; //pego valor basico
        for(int i = 1; i <= months; i++){
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            //Pego o juros passados + os meses -> 200 + 1% + 1
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            //Pega o 20+ 2%
            Date dueDate = addMonths(contract.getDate(), i);
            contract.getInstallments().add(new Installment(dueDate, fullQuota));
        }
    }

    //FUNÇÃO PARA ACRESCENTA MESES A UMA DATA
    private Date addMonths(Date date, int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, n);
        return calendar.getTime();
    }
}
