package OOPS.Polymorphism.Animal;

public class MainClass {

	public static void main(String[] args) {
		Animal a = new Dog();
		
		a.speak();
		
		Animal b = new Cat();
		
		b.speak();
	}

}
