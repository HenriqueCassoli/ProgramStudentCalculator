package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("Name:");
        stu.name = sc.nextLine();
        System.out.println("Primeira nota");
        stu.fistNota = sc.nextDouble();
        System.out.println("Segunda nota");
        stu.secondNota = sc.nextDouble();
        System.out.println("Terceira nota");
        stu.thirdNota = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n",   stu.finalNota());
        if (  stu.finalNota() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", stu.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}