package demo03;
import java.util.Scanner;

public class Program {

    public static void checkStringLength() throws ExceptionLineTooLong {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String userInput = scanner.nextLine();
        
        if (userInput.length() > 80) {
            throw new ExceptionLineTooLong("The string is too long");
        }
        
        System.out.println("The length of your string is: " + userInput.length());
    }

    public static void main(String[] args) {
        try {
            checkStringLength();
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }
    }
}
