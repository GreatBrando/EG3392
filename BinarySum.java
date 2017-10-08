import java.io.*;
import java.util.Scanner;

public class BinarySum {

	public static void main(String[] args) throws IOException {
		
		
		int user = 0;
		int sum = 0;
		boolean endOfFile = false;
		Scanner keyboard = new Scanner(System.in);
		
		
		// Create File Objects
		FileOutputStream output = new FileOutputStream("BinarySum.dat");
		DataOutputStream outputFile = new DataOutputStream(output);
		
		FileInputStream input = new FileInputStream("BinarySum.dat");
		DataInputStream inputFile = new DataInputStream(input);
		
		System.out.println("Enter Integers that will be added to calculate a Sum. Enter -1 to end");
		
		//Write into File 
		while(user != -1){
			user = keyboard.nextInt();
			if (user == -1)
				break;
			else
			outputFile.writeInt(user);
			
		}
		outputFile.close();	
		
		while (!endOfFile) {
			try {
				sum += inputFile.readInt();
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		
		
		System.out.println("The sum of all numbers is " +sum);
		input.close();	
		
   }
}
