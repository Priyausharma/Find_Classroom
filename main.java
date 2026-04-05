import my_project.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose:\n1. Student\n2. Staff\n3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.vacancy(stuff);
                    break;

                case 2:
                    Stuff stuff = new Stuff();
                    stuff.info();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}