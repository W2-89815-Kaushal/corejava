package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Coordinate Point 1 X:");
		int x1=sc.nextInt();
		System.out.println("Enter Coordinate Point 1 Y:");
		int y1=sc.nextInt();
		System.out.println("Enter Coordinate Point 2 X:");
		int x2=sc.nextInt();
		System.out.println("Enter Coordinate Point 2 Y:");
		int y2=sc.nextInt();
		Point2D p=new Point2D(x1,y1);
		Point2D p1=new Point2D(x2,y2);
		
		if (p.isEqual(p1)){
			System.out.println("Same Point");
		}
		else {
			double dist=p.calDistance(p1);
			System.out.println("Distance is "+dist);
		}
		
		sc.close();
	}

}
