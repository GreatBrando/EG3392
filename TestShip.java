

public class TestShip {
	public static void main(String[] args){
	
		Ship[] shipArray = new Ship[3];
		
		shipArray[0] = new Ship("Triump", 1960);
		shipArray[1] = new CruiseShip("Disney Magic", 2400);
		shipArray[2] = new CargoShip("Black Pearl", 50000);
				
		for(Ship i:shipArray){
			System.out.println(i);
			System.out.println("------------------------");
			
		}

		
	}
}
