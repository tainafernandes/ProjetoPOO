package application;

import entities.Quiz;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quiz quiz = new Quiz();

        System.out.println("Bem vindo ao Quiz!");
        System.out.println("Esse quiz é composto por " + String.format("%.0f", quiz.question())+ " Questoes");

        sc.close();
    }
}
