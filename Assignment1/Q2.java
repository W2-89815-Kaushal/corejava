import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Value1 :");
		boolean isFirstDouble = sc.hasNextDouble();
		String a =sc.nextLine();
		System.out.println("Enter Value1 :");
		boolean isSecoundDouble = sc.hasNextDouble();
		String b=sc.nextLine();
		
		if (isFirstDouble && isSecoundDouble)
		{
			double c=Double.parseDouble(a);
			double d=Double.parseDouble(b);
			double avg=(c+d)/2;
			System.out.println("avg :"+avg);
		}
		else {
			System.out.println("Invalid");		
		}
			sc.close();
		}
	
	
//	public static boolean isDouble(String Value) {
//		try {
//		Double.parseDouble(Value);
//			return true;
//		}
//		catch(NumberFormatException e)
//		{
//			return false;
//		}
//			
//	}

}
