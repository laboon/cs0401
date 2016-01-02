import java.util.*;

// Inheritance vs. Composition

public class InheritanceCompositionDemo {

    // Inheritance is a "is-a" relationship.  For example,
    // a Dog is-a Animal (ignore the slight grammatical weirdness
    // there), a Duck is-a Bird, an Integer is a Number.

    // Composition is a "has-a" relationship.  For example, a
    // Pond may have Ducks (or may not), but a Duck is not a
    // particular kind of pond.  You could implement this as a
    // PondWithDucks.

    Pond p = new Pond();
    PondWithDucks pwd = new PondWithDucks();
    pwd.add(new Duck());
    System.out.println("Number of ducks in pond with ducks is: "
		       + pwd.numDucks());
    
    // Alternatively, you can construct a Pond2 using composition.

    Pond2 pwd2 = new Pond2(); 
    pwd2.add(new Duck());
    System.out.println("Number of ducks in pond with ducks is: "
		       + pwd2.numDucks());

    // If something is a TYPE of something else, use inheritance.
    // If it contains something else, or is linked to something else,
    // use composition.

    // This is a heuristic, but helpful!
    
    
}

// Inheritance style
// Note that we save some work because swim() is already
// implemented, BUT we add work by having lots of classes
// This may be less flexible as the number of class sizes increases. 

class Pond {
    public void swim() {
	System.out.println("Splash splash splash!");
    }
}

class SwimmingPool extends Pond {
    // automatically has swim()
}
   

class PondWithDucks extends Pond {

    ArrayList ducks = new ArrayList();
    
    public void addDuck(Duck d) {
	ducks.add(d);
    }

    public int numDucks() {
	return ducks.size();
    }
}


// Composition style
// Note that we have to repeat ourselves a bit since
// we are not using inheritance!

class Pond2 {

    ArrayList ducks = new ArrayList();
    
    public void addDuck(Duck d) {
	ducks.add(d);
    }

    public int numDucks() {
	return ducks.size();
    }
    
    public void swim() {
	System.out.println("Splash splash splash!");
    }
}

class SwimmingPool2 {
    public void swim() {
	System.out.println("Splash splash splash!");
    }
}

class Duck {
    
}
