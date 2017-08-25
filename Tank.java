
public class Tank extends Vehicle{
	
	protected double armorWidth;

	public Tank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tank(int year, double weight, double armorWidth) {
		super(year, weight);
		this.armorWidth = armorWidth;
	}

	public double getArmorWidth() {
		return armorWidth;
	}

	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
	}

	@Override
	public String toString() {
		return "Tank: " +super.toString()+ " Armor Width:" +armorWidth+ "";
	}
	
	

}
