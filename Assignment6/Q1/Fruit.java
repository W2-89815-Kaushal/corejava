package demo02;

import java.util.Scanner;

public abstract class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit() {
		
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	public abstract String taste();
	
    public abstract String toString();

	
	public void acceptData(Scanner sc){
		System.out.println("Color :");
		color=sc.nextLine();
		System.out.println("Weight :");
		weight=sc.nextDouble();
		System.out.println("name :");
		name=sc.nextLine();
		System.out.println("Enter fresheness 1/0");
		isFresh=sc.hasNextBoolean();
	}
	
	public void displayData() {
		System.out.println("Color :"+color);
		System.out.println("Color :"+weight);
		System.out.println("Color :"+name);
		System.out.println("Color :"+isFresh);
	}
	public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

}
