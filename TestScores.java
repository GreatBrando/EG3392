import java.util.Scanner;

public class TestScores {
	
	public static void main(String[] args){
		
		int testScores[] = new int[5];
		Scanner keyboard = new Scanner(System.in);
	
			
		for(int i = 0; i < testScores.length; i++) {
	       System.out.println("Enter some test scores: ");
	       testScores[i] = keyboard.nextInt();  
	       
	       if(testScores[i]<0 || testScores[i]>100){
	    	   throw new IllegalArgumentException("Score Invalid");
	       }
	    
		}
	 
	
		Scores a = new Scores(testScores);
		System.out.println(a.getAverage());	
			
	}
}
