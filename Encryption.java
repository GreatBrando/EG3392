import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) throws IOException{
		
		char reader;
		String user;
		char encryption;
		boolean loop = false;
		Scanner keyboard = new Scanner(System.in);
		
		try {
			
			//Create File Objects
			FileInputStream input = new FileInputStream("TestFile.txt");
			DataInputStream inputFile = new DataInputStream(input);

			FileOutputStream output = new FileOutputStream("EncryptFile.txt");
			DataOutputStream outputFile = new DataOutputStream(output);
			
			//User Writes String into File
			System.out.println("Enter a String that will be Encrypted:");
			user = keyboard.next();
			outputFile.writeChars(user);
			
			//Encrypts File
			while (!loop) {
					reader = (char) (inputFile.readChar() + 'a');	
					encryption = reader;
					outputFile.writeChar(encryption);
					System.out.println(encryption);
			}
			
			outputFile.close();
			input.close();
			
			} catch (EOFException e) {
				loop = true;
			
			} finally {
			System.out.println("Encryption Done");
			}
		
		}
	
}


