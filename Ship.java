
public class Ship {
	
	protected String name;
	protected int yearBuilt;
	
	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ship(String name, int yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}
	
	public Ship(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}


	public String toString() {
		return "Name: " + name + " \nYear Built: " + yearBuilt + "";
	}

	
	

}
