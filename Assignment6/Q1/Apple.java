package demo02;

public class Apple extends Fruit{

	public Apple() {
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}
	
	public String taste() {
		return "sweet n sour" ;
	}
	
	 public String toString() {
	        return "Apple [Name: " + name + ", Color: " + color + ", Weight: " + weight + ", Fresh: " + (isFresh ? "Yes" : "No") + "]";
	    }

}
