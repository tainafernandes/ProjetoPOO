package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();  //como são vários contratos eu represento com uma lista
    //atributo lista não entra no construtor. Preciso instanciar;

    public Worker (){
        //empty constructor
    }

    public Worker (String name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    /*public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
        NAO PODE TER SET CONTRACTS, POIS EU NÃO POSSO TROCAR A LISTA
        ELA JÁ VAI SER ADICIONADA OU REMOVIDA COM OS MÉTODOS.
        NAO PODE TROCAR COM O SET, POIS ELA RECEBE UMA NOVA LISTA.
    } */

    public void addContract(HourContract contract){ //metodo que faz ou desfaz associação entre trabalhador e contrato
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance(); //mexemos com data com o calender
        for (HourContract c : contracts){ //faz o for para percorrer a lista e testar se o contrato é daquele mes e ano
            cal.setTime(c.getDate()); //pego a data do contrato e defino a data do calendario
            int c_year = cal.get(Calendar.YEAR); //pego ano
            int c_month = 1 + cal.get(Calendar.MONTH); //pego o mes - somo 1 pq o mes do calendar começa em 0
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
