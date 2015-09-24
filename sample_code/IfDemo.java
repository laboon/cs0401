public class IfDemo {

    // Plato supposedly defined "man" as a two-legged animal without
    // feathers. This code will help us determine whether something
    // is a man according to Plato's definition.
    // It could, of course, also be a bird or a griffin.
    
    // Note that Diogenes of Sinope later came to Plato's Symposium
    // holding a plucked chicken and saying "Behold Plato's Man!"
    
    public static void main(String[] args) {

	// || is OR
	// && is AND
	// ! is NOT
	// Note - you can use ^ for XOR but it's technically a bitwise
	// operator, so some people may look at your code askew.
	// You can always do (a && !b) || (!a && b) instead
	
	boolean hasFeathers = true;
	boolean hasTwoLegs = true;
	
	// Note no else statement here!
	// if (hasFeathers) {
	// if (hasTwoLegs) {
	// System.out.println("It has feathers and two legs.");
	// }
	// } else {
	// System.out.println("It does not have feathers");
	// }

	System.exit(0);
	if (hasTwoLegs) {
	    System.out.println("It has two legs.");
	} else {
	    // Note I don't need anything here
	}

	if (true) {
	    // This would always execute
	    // System.out.println("Yay!");
	} else {
	    // This code would never execute
	    // System.out.println("Boo!");
	}
	
	if (hasFeathers || hasTwoLegs) {
	    System.out.println("It could be either a griffin or a bird.");
	} else {
	    System.out.println("It's not a griffin or a bird.");
	}
	
	if (hasFeathers && hasTwoLegs) {
	    System.out.println("it's a bird");
	} else {
	    System.out.println("it's not a bird");
	}

	if (hasFeathers && !hasTwoLegs) {
	    System.out.println("it's a griffin");
	} else {
	    System.out.println("it's not a griffin");
	}

	if (!hasFeathers && hasTwoLegs) {
	    System.out.println("Behold Plato's man!");
	} else {
	    System.out.println("It's not a man.");
	}


    }

}
