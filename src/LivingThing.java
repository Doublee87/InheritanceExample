public abstract class LivingThing {	
	public LivingThing() {
		System.out.println("LivingThing constructor - no parameters");
	}
	
	public LivingThing( int x ) {
		System.out.println("LivingThing constructor - 1 int parameter");
	}
	
	public void myMethod() {
		System.out.println("myMethod is written in LivingThing class");
	}
	
	private void anotherMethod() {
		System.out.println("anotherMethod is written in LivingThing class");
	}
	
	/* This is an abstract method. It has the Java keyword 'abstract' in the
	 * method header plus it has a semicolon at the end (no curly braces).
	 * A class with at least one abstract method must be an abstract class.
	 * But you can have an abstract class with no abstract methods.
	 */ 
	public abstract void method3();
	
}
