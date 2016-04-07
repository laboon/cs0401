// Show you how instanceof works

import java.util.*;

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

	
	// Make an ArrayList with animals a, b, and c
	ArrayList animals =  new ArrayList();
	animals.add(a);
	animals.add(b);
	animals.add(c);

	// When we take them OUT of the animals ArrayList, they're just
	// generic Objects.  We need to double-check that they are Birds
	// or Cockatiels before doing anything!

	int counter = 0;
	for (Object animal : animals) {

	    System.out.println("Object " + counter++ + ":");

	    // Explicitly cast as Cockatiel
	    // WILL CAUSE A RUN-TIME FAILURE =(
	    // ((Cockatiel) animal).chirp();
	    
	    // Explicitly cast ONLY if it of the correct class!
	    // Otherwise, run-time errors could occur if we get
	    // e.g. an Animal out of there and try to make it a Bird
	    if (animal instanceof Bird) {
		((Bird) animal).tweet();
		if (animal instanceof Cockatiel) {
		    ((Cockatiel) animal).chirp();
		}
	    } else {
		System.out.println("I don't know what kind of animal this is!");
	    }
	    
	}
	
    }
    
}

// Remember that all classes extend from Object,
// we are just making it explicit here
class Animal extends Object {

}

class Dog extends Animal {

}

class Bird extends Animal {

    public void tweet() {
	System.out.println("Tweet tweet!");
    }
    
}

class Cockatiel extends Bird {

    public void chirp() {
	System.out.println("Chirp chirp!");
    }
    
    
}
