package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");

        System.out.print("Enter account holder: ");

        System.out.print("Is there na initial deposit (y/n)? ");
        //vai ter um if?
        System.out.println("Enter initial deposit value: ");



        sc.close();
    }
}
