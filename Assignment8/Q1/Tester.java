package demo05;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = null;
        boolean stackSelected = false;

        while (true) {
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push Data");
            System.out.println("4. Pop Data");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (!stackSelected) {
                        stack = new FixedStack();
                        stackSelected = true;
                        System.out.println("Fixed Stack selected.");
                    } else {
                        System.out.println("Stack already selected.");
                    }
                    break;

                case 2:
                    if (!stackSelected) {
                        stack = new GrowableStack();
                        stackSelected = true;
                        System.out.println("Growable Stack selected.");
                    } else {
                        System.out.println("Stack already selected.");
                    }
                    break;

                case 3:
                    if (stack == null) {
                        System.out.println("No stack selected.");
                    } else {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter salary: ");
                        double salary = sc.nextDouble();
                        Employee emp = new Employee(id, name, salary);
                        stack.push(emp);
                    }
                    break;

                case 4:
                    if (stack == null) {
                        System.out.println("No stack selected.");
                    } else {
                        stack.pop();
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
