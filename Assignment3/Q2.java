
import java.util.Scanner;
public class Program {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Count of Customers :");
		int CustomerCount=sc.nextInt();
		for(int i=1;i<CustomerCount+1;i++) {
			System.out.print("Customer:"+i);
			
			System.out.print("\n Enter Account Number :");
			int accountNo=sc.nextInt();
			
			System.out.print(" Enter Beginnings balance:");
			int bbalance=sc.nextInt();
			
			System.out.print(" Enter Charges:");
			int charge=sc.nextInt();
			
			System.out.print(" Enter Credits:");
			int credits=sc.nextInt();
			
			System.out.print(" Enter Credit Limit:");
			int creditlimit=sc.nextInt();
			
			int newbalance=bbalance +charge-credits;
			
		//	 then System.out.println(): System.out.println();
			System.out.println(newbalance>creditlimit ? "Credit limit Exceeds" : "New Balance :"+newbalance);
			
			

		}
				
		sc.close();

	}

}
