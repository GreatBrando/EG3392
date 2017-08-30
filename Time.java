
import java.time.Instant;
import java.util.Date;

public class Time {
	public static void main(String[] args){
		
		
		Date date = new Date();
		
		long unixTimestamp = Instant.now().toEpochMilli();
		
		//Time Calculations
		int seconds = (int) (unixTimestamp / 1000) % 60 ;
		int minutes = (int) ((unixTimestamp / (60000)) % 60);
		int hours = (int) ((unixTimestamp/ (3600000)));
				

		
		System.out.println("At the execution of this program, system local time is " +date);
		System.out.printf("Time elapsed since Unix Time Epoch: Hours: %d Minutes: %d Seconds: %d", hours, minutes, seconds);
	}
}
