package entities;

public class Employee {
    //dados funcionario: nome, salarioBruto e imposto
    //mostrar os dados nome e salarioliquido
    //receber uma porcentagem e dar um aumento de acordo com essa % - so salariobruto é afetado
    //mostrar novamente os dados
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    };

    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() { //sobreponho a versão de string
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
