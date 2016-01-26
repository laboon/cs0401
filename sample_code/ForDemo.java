public class ForDemo {

    public static void main(String[] args) {

	// For loops

	System.out.println("For loop count:");
	
	// Create an index variable, j, and set it to 0
	// As long as j is less than 10, keep looping
	// At the end of each loop iteration, increment j by one

	for (int j=0; j < 10; j++) {
	    System.out.println("j is " + j);
	}
	
	System.out.println("While loop count:");

	// For loops are just a special kind of loop.  Any for
	// loop can be turned into a while loop, and vice versa.
	
	// For example, the previous loop is equivalent to...

	int j2 = 0;
	while (j2 < 10) {
	    System.out.println("j2 is " + j2);
	    j2++;
	}

	// For loops can specify multiple variables and have more complex
	// Boolean expressions.  They can also do more things than just
	// increment the counter!  For example:
	
	for (int j=0, k=4; (j != 1 && k < 25); j += 3) {
	    System.out.println("j is " + j + " and k is " + k);
	    k += 5;
	}
	System.exit(0);
	// This is an infinite loop!  Why?  We don't set any variables;
	// the exiting condition will never be false; we don't do anything
	// to increment variables.
	
	for (;;) {
	    System.out.println("BILL RULES!!!!");
	}

	// Equivalent to -

	// while (true) {
	//     System.out.println("BILL RULES!!!!");
	// }
	
	
    }

}
