public class AbstractDemo {

    public static void main(String[] args) {
	// Can't do this - abstract classes cannot be instantiated
	// Dog d = new Dog();

	// However, their subclasses can!
	// They act just like normal classes
	
	System.out.println("Chihuahua:");
	Chihuahua c = new Chihuahua();
	c.bark();
	c.eat();

	System.out.println("\nGreat Dane:");
	GreatDane gd = new GreatDane();
	gd.bark();
	gd.eat();
	
	
    }
}

// You cannot instantiate an abstract class!

abstract class Dog {

    // Methods that are _abstract_ must be filled in by subclasses
    // before a subclass can be instantiated

    // Kind of like an interface, no?
    
    public abstract void bark();

    // However, regular old methods can co-exist (unlike pre-1.8
    // interfaces).
    
    public void eat() {
	System.out.println("Chomp chomp!");
    }
    
}

// Otherwise, though abstract classes act just like regular classes.
// You can call super on them, have access to defined methods, etc.

class Chihuahua extends Dog {

    public void bark() {
	// Nothing exists in super.bark()!  No such method.
	// This will cause a compiler error that abstract methods
	// canot be accessed directly
	//super.bark();
	System.out.println("Yip yip!");
    }
    
}

// Multiple subclasses are possible, just like regular classes

class GreatDane extends Dog {

    public void bark() {
	System.out.println("Woof woof!");
    }

    public void eat() {
	super.eat();
	System.out.println("YUM YUM!");
    }

    
}
    
