
public class TestGeometricObject {
	public static void main(String[] args){
		GeometricObject1 b = new Circle(0);
		GeometricObject1 a = new Rectangle(0,0);
		
		System.out.println("The Two Objects have the same area? " + ((Circle) b).isEquals(b,a));
		System.out.println("Does your Object have a Greater Area? " + ((Circle) b).isGreater(b,a));
		System.out.println("Does your Object have a Lesser Area? " + ((Circle) b).isLess(b,a));
		
	}
}
