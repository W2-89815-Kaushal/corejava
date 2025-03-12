import java.util.Scanner;
public class Program {
	enum traffic{
		red(30),
		yellow(10),
		green(45);
		private int value;
		int a,b,c;

	private traffic(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Choose : Red Yellow Green ");
		String s =sc.nextLine().toLowerCase();
        try{
        	traffic light = traffic.valueOf(s);
        	System.out.println(light +" :"+light.getValue()+"sec");
        }catch(IllegalArgumentException e) {
        	System.out.println("Invalid traffic light color. Please enter red, green, or yellow.");
        }

		
	}

}
