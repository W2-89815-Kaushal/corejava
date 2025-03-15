package demo04;

import java.util.Scanner;

class InvalidDiameterException extends Exception {
    public InvalidDiameterException(String message) {
        super(message);
    }
}

public class Circle {
    private double x;
    private double y;
    private double diameter;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.diameter = 100;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double d) throws InvalidDiameterException {
        if (d < 0) {
            throw new InvalidDiameterException("Diameter cannot be negative.");
        }
        this.diameter = d;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printInfo() {
        System.out.println("Center: (" + x + ", " + y + ")");
        System.out.println("Diameter: " + diameter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Circle c = new Circle();
            
            System.out.print("Enter X coordinate of center: ");
            double x = sc.nextDouble();
            
            System.out.print("Enter Y coordinate of center: ");
            double y = sc.nextDouble();
            
            c.setCenter(x, y);
            
            System.out.print("Enter diameter of the circle: ");
            double diameter = sc.nextDouble();
            
            c.setDiameter(diameter);
            
            c.printInfo();

        } catch (InvalidDiameterException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
