import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date(26,04,2002);
		System.out.println("display date");
		date.display();
		
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		
		date.setDay(d);
		date.setMonth(m);;
		date.setYear(y);;
		date.display();
		sc.close();
	}

}
