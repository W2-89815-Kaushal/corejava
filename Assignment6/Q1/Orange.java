package demo02;

public class Orange extends Fruit {
	
	
	
	public Orange() {
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	public String taste() {
		return "sour" ;
	}
	
	public String toString() {
        return "Orange [Name: " + name + ", Color: " + color + ", Weight: " + weight + ", Fresh: " + (isFresh ? "Yes" : "No") + "]";
    }

}
