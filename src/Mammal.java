public class Mammal extends LivingThing {	
	
	public Mammal() {
		super();
		System.out.println("Mammal constructor - no parameters");
	}
	
	public Mammal( int x ) {
	
		System.out.println("Mammal constructor - 1 int parameter");
	}
	
	public void method3() {
		System.out.println("method3 is written in the Mammal class");
		
	}
}
