
public class Circle extends GeometricObject1 implements Comparable {
	private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double r){
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	public double getDiameter(){
		return 2*radius;
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
