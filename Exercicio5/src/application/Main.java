package application;

import service.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); // para consumir o "espaço" do enter
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();
            account = new Account(number, name, value); //envia esses valores para o contrutor. Construtor é "contruido" com esse valores passados.
        } else {
            account = new Account(number, name);
        }

        System.out.println("Account data: ");
        System.out.print(account);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposite = sc.nextDouble();
        account.deposit(deposite); //passando o valor que a pessoa deseja depositar.
        System.out.print("Updated account data: ");
        System.out.print(account);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.print("Updated account data: ");
        System.out.print(account);

        sc.close();
    }
}
