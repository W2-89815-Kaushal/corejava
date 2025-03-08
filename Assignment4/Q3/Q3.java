package demo03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How many items add to first arr :");
		int size=sc.nextInt();
		String arr[]=new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter Elements :");
			arr[i]=sc.next();
		}
		for(String ele : arr)
			System.out.println("Array1 :"+ele);
		
		System.out.println("Enter How many items add to Secound arr :");
		int size1=sc.nextInt();
		String arr1[]=new String[size1];
		for(int i=0;i<size1;i++) {
			System.out.println("Enter Elements :");
			arr[i]=sc.next();
		}
		for(String ele : arr1)
			System.out.println("Array1:"+ele);
		
		


	}

}
