
//Display food menu to user. User will select items from menu along with the 
//quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
//prices to food items(hard code the prices)  When user enters 'Generate Bill' 
//option , display total bill & exit.
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int D=60;
		int S=20;
		int I=30;
		int P=25;
		int U=25;
		int W=15;
		int u=40;
		int d=50;
		int C=10;
		int B=10;
		
		System.out.println("1.Dosa : Rs60");
		System.out.println("2.Samosa : Rs20");
		System.out.println("3.Idli :Rs30 ");
		System.out.println("4.Pohe :Rs25");
		System.out.println("5.Upit :Rs25");
		System.out.println("6.WadaPav :Rs15");
		System.out.println("7.UdidWada :Rs40");
		System.out.println("8.Dhokal :Rs50");
		System.out.println("9.Chai :Rs10");
		System.out.println("10.Biscuit :Rs10");
		System.out.println("0.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("/n Enter How many items to order :");
		int count=sc.nextInt();
		System.out.println("Total items to order are "+count);
		int a=0;
		int bill=0;
		while(a<count) {
				System.out.println("Enter Choice : ");
				int b=sc.nextInt();
				switch(b){
					case 1:
						System.out.println("Dosa added");
						bill=bill+D;
						break;
					case 2:
						System.out.println("Samosa added");
						bill=bill+S;
						break;
					case 3:
						System.out.println("Idli added");
						bill=bill+I;
						break;
					case 4:
						System.out.println("Pohe added");
						bill=bill+P;
					case 5:
						System.out.println("Upit added");
						bill=bill+U;
						break;
					case 6:
						System.out.println("WadaPav added");
						bill=bill+W;
						break;
					case 7:
						System.out.println("UdidWada added");
						bill=bill+u;
						break;
					case 8:
						System.out.println("Dhokala added");
						bill=bill+d;
						break;
					case 9:
						System.out.println("Chai added");
						bill=bill+C;
						break;
					case 10:
						System.out.println("Biscuit added");
						bill=bill+B;
						break;
					
					default:
						System.out.println("Wron Choice");
				}
				a=a+1;
		
			}
		System.out.println("Bill :"+bill);
		sc.close();
		}
	
		
	}


	


