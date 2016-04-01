public class Drink extends Object {

    public void drink() {
	System.out.println("Drinking a GENERIC BEVERAGE");
    }
    
    public static void main(String[] args) {

	// Create a generic drink
	
	Drink d = new Drink();
	d.drink();
	
	// Note in both of these cases, Soda and Drink are kinds-of
	// Drinks.  They use extends to indicate that they are a
	// _subclass_ of Drink.  Drink is a _superclass_ of Water.
	
	// Create a Soda.  This is neat, we can define our object either
	// as the more generic Drink, or more specific Soda or Water.
	// It all depends on how you will be interacting with the
	// element throughout the program.

	Drink soda1 = new Soda();
	Soda soda2  = new Soda();
	soda1.drink();
	soda2.drink();
	
	// Create a Water.  This acts the same as a Soda.

	Drink water1 = new Water();
	Water water2 = new Water();
	water1.drink();
	water2.drink();

	Coffee c1 = new Coffee();
	Drink c2 = new Coffee();
	c1.drink();
	c2.drink();
	System.exit(0);
	
	// Water implements the Squirtable interface.  Squirtable
	// just adds the .squirt() method.  Recall that implementing an
	// interface is "promising" that you will implement all of
	// its methods.

	// We can send any Squirtable
	// object in here, but it will only be able to call the .squirt()
	// method.  Note that you cannot instantiate interfaces directly -
	// that is, you can't do Squirtable s = new Squirtable();
	
	// Squirtable s = new Squirtable();
	Squirtable water3 = new Water();
	water3.squirt();
	// Is a water reference
	water2.squirt();
	
	// This won't work - .drink() is not part of the Squirtable
	// interface!
	// water3.drink();

	// Soda does not implement Squirtable (you don't put soda in your
	// squirt gun unless you are trying to attract bees), so it
	// cannot be put into a Squirtable reference.
	// Even if you add your own .squirt() method to Soda, you
	// cannot put it in a Squirtable reference! 

	// Squirtable soda3 = new Soda();

	// Coffee implements Squirtable and Sippable.  Thus, it
	// must implement all of the methods in both of those
	// interfaces.

	// Note that all of these are Coffee(), but have very different
	// references!  Squirtable references can only call the
	// .squirt() method because that is all that is included in
	// the Squirtable interface.  Sippable references can
	// only call the methods defined in Sippable.  The standard
	// Coffee reference can call any method in Coffee.
	
	Coffee coffee1      = new Coffee();
	Squirtable coffee2  = new Coffee();
	Sippable coffee3    = new Coffee();

	coffee1.sip();
	coffee1.noisySip();
	coffee1.squirt();
	
	// Note that Coffee does not implement a drink() method itself,
	// so it calls the drink() method of its superclass, Drink.
	coffee1.drink();


	System.out.print("Interfaces:");
	
	// Only method that can be called on coffee2
	coffee2.squirt();

	// Only methods that can be called on coffee3
	
	coffee3.sip();
	coffee3.noisySip();
	
    }
    
}
