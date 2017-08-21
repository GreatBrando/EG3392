
import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Program will calculate the distance between two points");
		
		System.out.println("Enter x value for point 1");
		int x1 = input.nextInt();
		
		System.out.println("Enter y value for point 1");
		int y1 = input.nextInt();
		
		System.out.println("Enter x value for point 2");
		int x2 = input.nextInt();
		
		System.out.println("Enter y value for point 2");
		int y2 = input.nextInt();
		
		ThePoint p = new ThePoint(x1 , y1);
		ThePoint a = new ThePoint(x2, y2);
		
		System.out.println("The coordinates are " +p.toString()+ " and " +a.toString());
		System.out.println("The distance between these points is " +p.getDistance(a));
		
	}
}

