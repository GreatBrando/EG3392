import java.io.*;
import java.util.Scanner;

public class FileSum {

	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Integers that will be added to calculate a Sum. Enter -1 to end");
		int user = 0;
		int sum = 0;
		
		
		//Writing into File
		File myFile = new File("Numbers.txt");
		PrintWriter output = new PrintWriter(myFile);
		
		while(user != -1){
			user = keyboard.nextInt();
			if (user == -1)
				break;
			else
			output.print(user + " ");
			
		}
		output.close();
		
		
		//Calculating sum from within file
		Scanner input = new Scanner(myFile);
		
		while (input.hasNext()){
			sum += input.nextInt();
		}
		
		System.out.println("The sum of all numbers is " +sum);
		input.close();	
		
		
		
		
		
		
		
	}

}
