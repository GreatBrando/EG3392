
public class Polygon extends GeometricObject1 {
	protected int side;
	protected int sidelength;
	
	public Polygon(){
		
	}

	public Polygon(int side, int sidelength) {
		super();
		this.side = side;
		this.sidelength = sidelength;
	}
	
	
	
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getSidelength() {
		return sidelength;
	}
	public void setSidelength(int sidelength) {
		this.sidelength = sidelength;
	}
	
	public double getAngle(){
		return (side-2)*(180.0/side);
	}
	
	public double getPerimeter(){
		return sidelength*side;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
