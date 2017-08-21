

public class ThePoint {
	private int x;
	private int y;
	
	public ThePoint(){
		x = 0;
		y = 0;
	}
	
	public ThePoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString(){
		return String.format("(%d, %d)", this.x, this.y);
	}

	public double getDistance( ThePoint p) {
		return Math.sqrt(Math.pow(p.getX()-this.getX(),2) + Math.pow(p.getY()-this.getY(),2));
	
	}
}
