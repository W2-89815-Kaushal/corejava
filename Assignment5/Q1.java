import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String to reverse :");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			r=ch+r;
			
		}
		System.out.println(r);		

	}

}

