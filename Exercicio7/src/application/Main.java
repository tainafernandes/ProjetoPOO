package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>(); //instanciamento da lista

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine(); // se não coloca esse nextLine, consome o enter
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idSalary = sc.nextInt();

        // Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null)
        // Busca feita usando o list.strem - para usar a funcao lambda

        Integer pos = position(list, idSalary);
        if(pos == null){
            System.out.print("This is does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    //funcao auxiliar para procurar o id na lista
    public static Integer position(List<Employee> list, int id) {   //Public nesse exemplo é opcional.
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
