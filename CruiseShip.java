
public class CruiseShip extends Ship{
	protected int passengers;

	public CruiseShip() {
		super();
		
	}

	public CruiseShip(String name, int passengers) {
		super(name);
		this.passengers = passengers;
		
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Name: " +getName()+" \nMaximum Passengers: " + passengers + "";
	}
	
	
	
	

}
