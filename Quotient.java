import java.util.InputMismatchException;
import java.util.Scanner;

public class Quotient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		
		try{
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
		
		}
		
		catch(ArithmeticException e){
			System.out.println("Avoid using 0 for number2");
		}
		
		catch(InputMismatchException e){
			System.out.println("Please enter integers for number 1 and 2.");
		}
		
		catch(Exception e){
			System.out.println("Please enter integers for number 1 and 2 and Avoid using 0 for number2");
		}
	}
}