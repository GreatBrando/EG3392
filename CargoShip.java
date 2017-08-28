
public class CargoShip extends Ship {
	
	protected int cargoCapacity;

	public CargoShip() {
		super();
	}

	public CargoShip(String name, int cargoCapacity) {
		super(name);
		this.cargoCapacity = cargoCapacity;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public String toString() {
		return "Name: " +getName()+ " \nCargo capacity: " + cargoCapacity + " tons";
	}
	
	
	
	
}
