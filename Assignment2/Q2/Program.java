import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String Name = sc.next();
        System.out.println("Enter Last Name: ");
        String LastName = sc.next();
        System.out.println("Enter Salary: ");
        double Salary = sc.nextDouble();
        Employee e1 = new Employee(Name, LastName, Salary);
        
        System.out.println("Yearly Salary before raise: " + e1.getYsalary());
        
        e1.raise(10);
        System.out.println("Yearly Salary after 10% raise: " + e1.getYsalary());
        
        sc.close();
    }
}
