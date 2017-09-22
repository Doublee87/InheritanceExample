public class Cat extends Mammal {	
	public Cat() {
		
		System.out.println("Cat constructor - no parameters");
	}
	
	public Cat( int x ) {
		super(x);

		System.out.println("Cat constructor - 1 int parameter");
	}
	
	
	
	public void method3() {
		super.method3();
	    System.out.println("method3 is written in the Cat class");
	    super.method3();
	}
	
	
	public void pet() {
		System.out.println("I am in the pet method in the Cat class, MEOW.");
	}
	
}