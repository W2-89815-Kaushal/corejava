import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String1 :");
		String s1=sc.nextLine();
		System.out.println("Enter String2 :");
		String s2=sc.nextLine();
		
		for(int i=0; i<s1.length();i++) {
			char c =s1.charAt(i);
			r=c+r;
			
		}
		if(r.equals(s2)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not Pallindrome");
		}

	}

}
