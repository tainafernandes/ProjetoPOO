package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students students = new Students();

        System.out.println("Name: ");
        students.name = sc.nextLine();
        System.out.println("Note 1: ");
        students.note1 = sc.nextDouble();
        System.out.println("Note 2: ");
        students.note2 = sc.nextDouble();
        System.out.println("Note 3: ");
        students.note3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %2.f%n", students.finalGrade());

        if(students.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f%n", students.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
