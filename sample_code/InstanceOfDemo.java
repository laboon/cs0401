// Show you how instanceof works

public class InstanceOfDemo {

    public static void main(String[] args) {

	// Very simple - we have an Animal which extends Object.
	// We can check if it's an Animal (yes) or an Object (yes, Object
	// is a superclass of Animal - and all Java objects).
	// However, it is NOT a Bird; that's a subclass of Animal but
	// a is not one of them.
	
	Animal a = new Animal();

	System.out.println("Is _a_ an Animal? " + (a instanceof Animal)); // true
	System.out.println("Is _a_ an Object? " + (a instanceof Object)); // true
	System.out.println("Is _a_ a Bird? " + (a instanceof Bird)); // false

	System.out.println();

	// Note that instanceof checks the OBJECT, not the REFERENCE!  Even if
	// we have an Animal reference to a bird, we can determine that behind
	// the scenes, it's a reference to a Bird, not a generic Animal.
	
	Animal a2 = new Bird();
	
	System.out.println("Is _a2_ an Animal? " + (a2 instanceof Animal)); // true
	System.out.println("Is _a2_ a Bird? " + (a2 instanceof Bird)); // true
	System.out.println("Is _a2_ a Cockatiel? " + (a2 instanceof Cockatiel)); // false

	System.out.println();

	// We can check for objects whose classes are midway through the
	// hierarchy.  For example, b is both a Bird (subclass) and Animal
	// (superclass).  However, it is not a Cockatiel (more specific subclass).
	
	Bird b = new Bird();
	System.out.println("Is _b_ an Animal? " + (b instanceof Animal)); // true
	System.out.println("Is _b_ a Bird? " + (b instanceof Bird)); // true
	System.out.println("Is _b_ a Cockatiel? " + (b instanceof Cockatiel)); // false

	System.out.println();


	// We now have a Bird reference to a Cockatiel object.  It is
	// a Cockatiel, Bird, and Animal.  Remember the reference does
	// not matter, only the actual object.
	
	Bird c = new Cockatiel();
	System.out.println("Is _c_ an Animal? " + (c instanceof Animal)); // true
	System.out.println("Is _c_ a Bird? " + (c instanceof Bird)); // true
	System.out.println("Is _c_ a Cockatiel? " + (c instanceof Cockatiel)); // true
	
    }
    
}

// Remember that all classes extend from Object,
// we are just making it explicit here
class Animal extends Object {

}

class Dog extends Animal {

}

class Bird extends Animal {

}

class Cockatiel extends Bird {

}
