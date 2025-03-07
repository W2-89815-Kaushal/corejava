package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Points to plot");
		int a=sc.nextInt();
//		Point2D[] arr= new Point2D(a);
		Point2D[] arr = new Point2D[a];
		if (a<2) {
			System.out.println("Enter atleast 2 Points");
		}else {
		for (int i=0;i<a;i++) {
			
			System.out.println("Enter Coordinate Point "+(i+1)+"  X:");
			int x1=sc.nextInt();
			System.out.println("Enter Coordinate Point "+(i+1)+" Y:");
			int y1=sc.nextInt();
			arr [i]=new Point2D(x1,y1);
		}
		}
		if (a>2){
			System.out.println("Enter first point to find distance between them :");
			int b =sc.nextInt();
			System.out.println("Enter secound point to find distance between them :");
			int c=sc.nextInt();
			double dist=arr[b-1].calDistance(arr[c-1]);
			System.out.println("Distance is "+dist+" Unit");
			
		}
		else {
			double dist=arr[0].calDistance(arr[1]);
			System.out.println("Distance is "+dist);
			}
		
		sc.close();
		

	}

}
