package model.services;

public class ContractService {

    //Vamos ter composição de serviços - Classe fechada para alteração e aberta para inclusão
    //Inversão de controle é NÃO deixar a classe responsavel em instanciar. Outro que vai dar o NEW (instanciar)
    //De forma manual é um constructor, get

    private OnlinePaymentService onlinePaymentService; //declara com o tipo da interface

    public ContractService(OnlinePaymentService onlinePaymentService){ //INJETANDO
        this.onlinePaymentService = onlinePaymentService;
    }


}
