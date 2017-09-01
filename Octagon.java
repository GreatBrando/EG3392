
public class Octagon extends Polygon{
	
	public Octagon(){
		
	}

	
	public Octagon(int side, int sidelength) {
		super(8, sidelength);
		// TODO Auto-generated constructor stub
	}

	public double getArea(){
		 return ((2 + 2 * Math.sqrt(2)) * getSidelength() * getSidelength()); 
	}

	@Override
	public String toString() {
		return "An Octagon has " + side + " sides \nA side length of " + sidelength + "\nAn area of " + getArea() + " \nA perimeter of " +getPerimeter()+ " \nAn internal Angle of " +getAngle()+ "\n" +getDateCreated();
	}
	
	

}


