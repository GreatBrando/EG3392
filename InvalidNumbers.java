import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidNumbers {

	public static void main(String[] args){
		
		    boolean error = true;
			int number = 0;
		   
		
		 do{  
			
			 Scanner input = new Scanner(System.in);
			 System.out.print("Enter a positive integer: "); 
			 
		   try{
				
		    number = input.nextInt();
			if(number<= 0){
				throw new InputMismatchException("Try again. (Incorrect input: A postive integer is reqiured)");
				}
			error = false;
			} 
		   
		   
		   catch (InputMismatchException e){
				System.out.println("Try again. (Incorrect input: A positive integer is required)");
			}
		   
		   
		    
		  }while(error);
		 
		 System.out.println("The Number entered is " +number);
		 System.out.println("Thank You");
			
	}

}
