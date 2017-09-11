
public class Rectangle extends GeometricObject1 implements Comparable {
	
	private double width;
	private double height;
	
	
	public Rectangle(){
		
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}
	
	public double getArea(){
		return width*height;
	}
	
	public double getPerimeter(){
		return (2*width) + (2* height);
	}

	
	public boolean isEquals(GeometricObject1 o1, GeometricObject1 o2){
		return o1.getArea() == o2.getArea();
	}
	
	public boolean isGreater(GeometricObject1 o1, GeometricObject1 o2) {
		if (o1.getArea() > o2.getArea()) {
            return true;
        } else if (o1.getArea() < o2.getArea()) {
            return false;
        }
		    return false;
	}

	
	public boolean isLess(GeometricObject1 o1, GeometricObject1 o2) {
		if (o1.getArea() < o2.getArea()) {
            return true;
        } else if (o1.getArea() > o2.getArea()) {
            return false;
        }
		    return false;
	}

	
}
