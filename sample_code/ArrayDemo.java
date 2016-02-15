public class ArrayDemo {

    // Whoa, we have been using arrays the whole time!
    // Look at String[] args.  These are the arguments (args)
    // passed from the command line.  So when you type:
    //
    // java ArrayDemo.java
    //
    // java is the program, and it has one argument, "ArrayDemo.java".
    // This would mean the args array looks like this:
    //
    // args[0] = "ArrayDemo.java"
    //
    // If we passed in other arguments, e.g.
    //
    // java ArrayDemo.java Tweet 7, the array would look like:
    // args[0] = "ArrayDemo.java"
    // args[1] = "Tweet"
    // args[2] = "7"
    
    
    
    public static void main(String[] args) {

	// How to make an array:
	// An array is an object which holds a number of values
	// of the same type, accessible by index.
	// Think of a filing cabinet, each cabinet stores a particular value:
	// Filing Cabinet
	// Index 0: 7
	// Index 1: 4
	// Index 2: 3
	// Index 3: 19
	// Arrays are always contiguous (that is, you can't have only indexes
	// 0, 17, 19, and 26; you would need all the values 0 through 26 as
	// valid) and homogenous (the same type).  So in a single array, you
	// could not store both ints and floats, for example.
	// We can make an array that does that like so:

	// Create an object, an array which stores 4 ints, called fc
	// Remember four elements means indexes are 0, 1, 2, and 3!
	int[] fc = new int[4];

	// We now have four values we can write!
	fc[0] = 7;
	fc[1] = 4;
	fc[2] = 3;
	fc[3] = 19;

	// You can do this in shorthand with the following syntactic sugar
	// This is exactly equivalent to the code above!  It creates a four-
	// element array, fc2, and sets the values.
	int[] fc2 = {7, 4, 3, 19};

	// You can loop through an array using a for loop very easily.
	// These are all separate variables, you can read and write
	// them as per normal.

	for (int j=0; j < 4; j++) {
	    System.out.println("fc[" + j + "] is: " + fc[j]);
	}

	for (int j=0; j < 4; j++) {
	    System.out.println("fc2[" + j + "] is: " + fc2[j]);
	}

	
	// By default, all values in an array are the default for their
	// primitive type.  This is usually the equivalent of 0 or false
	// for each each type.
	// Default char = null char (character code 0)
	// Default byte, short, int, long = 0
	// Default float or double = 0.0

	char[] chars = new char[5];

	System.out.println("Default char = \"" + chars[0]
			   + "\" ( Character # " + (int) chars[0] + ")");

	int[] ints = new int[12];
	
	System.out.println("Default int = " + ints[3]);
	
	// Primitive types are easy, but what about ref types?
	// They start as default null.  You have to individually
	// assign each one a "new" value or object reference.
	// But you can then call them individually

	Cat[] cats = new Cat[5];

	cats[0] = new Cat("Old Deuteronomy");
	cats[1] = new Cat("Rum Tum Tugger");
	cats[2] = new Cat("Mr. Mistoffelees");
	cats[3] = new Cat("Jennyanydots");
	cats[4] = new Cat("Grizabella");

	System.out.println("Welcome to the Jellicle Ball!");

	for (int j=0; j<5; j++) {
	    cats[j].meow();
	}

	// BEWARE GOING BEYOND THE BOUNDS OF THE ARRAY!
	// JAVA WILL NOT WARN YOU OF THIS AT COMPILE-TIME!
	// This will cause a run-time exception
	// cats[5].meow();
	
    }
    
}

class Cat {

    String _name = "Jellicle Cat";
    
    public Cat(String name) {
	_name = name;
    }
    
    public void meow() {
	System.out.println(_name + " says, MEOW!");
    }
    
}
