package demo02;

public class Mango extends Fruit {
	
	public Mango() {
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	public String taste() {
		return "sweet" ;
		
	}
	
	public String toString() {
        return "Mango [Name: " + name + ", Color: " + color + ", Weight: " + weight + ", Fresh: " + (isFresh ? "Yes" : "No") + "]";
    }

}
