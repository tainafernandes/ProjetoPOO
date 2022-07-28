package application;

import model.services.OnlinePaymentService;
import model.services.PaypalService;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Programa principal que vai ficar responsável em injetar e não mais a classe
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



        sc.close();
    }
}
