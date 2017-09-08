
public class TestAnimal {
	public static void main(String[] args){
	
		Animal object1 = new Cat("persian cat", "jerry", 4);	
		Animal object2 = new Dog("Yorkie", "Hershey", 4);
	
		object1.makeNoise();
		object2.makeNoise();
		
		object1.groupBehaviour();
		object2.groupBehaviour();
		
	}
	
}
