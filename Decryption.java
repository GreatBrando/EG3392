import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Decryption {

	public static void main(String[] args) throws IOException {
		
		char decryption;
		boolean endOfFile = false;
		
		try {
			FileInputStream input = new FileInputStream("EncryptFile.txt");
			DataInputStream inputFile = new DataInputStream(input);

			FileOutputStream output = new FileOutputStream("DecryptFile.txt");
			DataOutputStream outputFile = new DataOutputStream(output);
			
			//Decrypts Files
			while (!endOfFile) {
				decryption = (char) (inputFile.readChar() - 'a');
				outputFile.writeChar(decryption);
				System.out.println(decryption);
			}

			outputFile.close();
			input.close();
		
			} catch(EOFException e){
			endOfFile = true;
			}
			
			System.out.println("Decryption Done");
  
	}
}