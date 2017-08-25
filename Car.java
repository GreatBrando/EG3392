
public class Car extends Automobile{
	
	protected int maxPassengers;

	public Car() {
		super();

	}

	public Car(int year, double weight, String licensePlate, String make, int maxPassengers) {
		super(year, weight, licensePlate, make);
		this.maxPassengers = maxPassengers;
		
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	public String toString() {
		return "Honda: " +super.toString()+ " MaxPassengers:" +maxPassengers+ "";
	}

}
