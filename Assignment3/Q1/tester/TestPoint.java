package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter X coordinate of point 1 :");
		double x1=sc.nextDouble();
		System.out.println("Enter Y coordinate of point 1 :");
		double y1=sc.nextDouble();
		
		System.out.println("Enter X coordinate of point 2 :");
		double x2=sc.nextDouble();
		System.out.println("Enter Y coordinate of point 2 :");
		double y2=sc.nextDouble();
		
		Point2D p=new Point2D(x1,y1);
		Point2D p1=new Point2D(x2,y2);
		
		System.out.println("Point 1 :"+p.getDetails());
		System.out.println("Point 2 :"+p1.getDetails());
		
		if(p.isEqual(p1)) {
			System.out.println("Same");
		}else {
			Double dist=p.caldist(p1);
			System.out.println("Distance is :"+dist+" Unit");
		}


		sc.close();
		
		
		
	}

}
