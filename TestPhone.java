import java.util.Scanner;

public class TestPhone {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will calculate your phone bill for you");
		
		System.out.println("What is your call rate?");
		double x = input.nextDouble();
		
		System.out.println("What is your monthly rate?");
		double y = input.nextDouble();
		
		System.out.println("How many minutes did you talk?");
		int time = input.nextInt();
		
		PhoneBill a = new LongDistanceBill(y,x);
		
		System.out.println("Your monthly bill is $" +a.CalculateBill(time));
		
	}

}
