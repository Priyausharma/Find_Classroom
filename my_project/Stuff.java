package my_project;

import java.util.*;

public class Stuff {

    ArrayList<Classroom> al = new ArrayList<>();

    public void info() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of classrooms:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Classroom:");
            String room = sc.nextLine();

            System.out.println("Enter floor:");
            int floor = sc.nextInt();
            sc.nextLine();

            al.add(new Classroom(floor, room));
        }

        System.out.println("Updated Successfully!");
    }

    public void display() {
        System.out.println("Classroom Information:");
        for (Classroom c : al) {
            System.out.println("Room: " + c.room + ", Floor: " + c.floor);
        }
    }
}