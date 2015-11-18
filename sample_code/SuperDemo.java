// Demonstrate how super works


public class SuperDemo {
    public static void main(String[] args) {

	// We are creating three objects, A, B and C.
	// C is a subclass of B, and B is a subclass of A.
	
	A a = new A();
	B b = new B();
	C c = new C();
	
	// Call printSomething on each.  Note that each will call the
	// printSomething method for that particular object's class!
	// However, by using super, B first calls A and asks it to do
	// its printSomething.  C's super calls B, which calls A.
	
	System.out.println("\nA");
	a.printSomething();
	System.out.println("\nB");
	b.printSomething();
	System.out.println("\nC");
	c.printSomething();
	
	// If you don't use super, you can "purely" override the method.
	// D extends C, but its printSomething does not use super, so
	// it entirely overrides C's method.
	
	D d = new D();
	System.out.println("\nD");
	d.printSomething();

	System.exit(0);

	// If you have an A reference to C, it still calls C's methods.
	// However, it CANNOT call methods which A does not have!  Even
	// though .shake exists, the reference does not know that it's
	// there.
	// This is to ensure that the A reference can act like an A for
	// all intents and purposes.

	System.out.println("\nA2");	
	A a2 = new C();
	// A-class reference to a C-class object.
	a2.printSomething();
	// Will not compile! 
	// a2.shake();
    }
}

// A <- B <- C <- D

class A {

    public A() {
	System.out.println("\nTHIS IS AN A");
    }
    
    public void printSomething() {
	System.out.println("Something!");
    }
}

class B extends A {

    public B() {
	super();
	System.out.println("B is a subclass of ^");
    }

    
    public void printSomething() {
	super.printSomething();
	System.out.println("Something Else!");
    }
}

class C extends B {

    public C() {
	super();
	System.out.println("C is a subclass of ^");
		
    }

    
    // public void printSomething() {
    // 	super.printSomething();
    // 	System.out.println("Yet another thing!");
    // }

    public void shake() {
	System.out.println("Shake shake shake!");
    }
    
}

class D extends C {

    public D() {
	super();
	System.out.print("D is a subclass of ^ ");
    }

    
    public void printSomething() {
	super.printSomething();
	System.out.println("I do my own thing!");
    }

}
