public class ForDemo {

    public static void main(String[] args) {

	// For loops

	System.out.println("For loop count:");
	
	// Create an index variable, j, and set it to 0
	// As long as j is less than 10, keep looping
	// At the end of each loop iteration, increment j by one

	// standard names for loop counter vars are i, j and k.
	// I tend to use j just because "i" looks like a "1".

	for (int j=0; j < 10; j++) {
	    System.out.println("j is " + j);
	}

	// for (float j= (float) 0.0; j < 10.0; j += 0.01) {
	//     System.out.println("j is " + j);
	// }
	    	
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
	    // j += 3
	}

	int total = 0;

	int start = 0;
	int stop = 5;
	
	for (int j=start; j <= stop; j++) {
	    System.out.println("Total = " + total + " - adding " + j);
	    total += j;
	}
	System.out.println(total);


	int K = 514;

	for (int j = 1, c = 0; j < K; j *= 2) {
	    System.out.println("2^" + c + " -  = " + j);
	    c++;
	}
	
	// Just like if's (conditional execution), you can nest loops
	// (iterative execution).  Let's say we want to make a triangle
	// of asterisks, like so:
	// *
	// **
	// ***
	// ****
	// *****
	// ******
	// We can think of this as two loops: one for each line, then one
	// for each character on the line.  In Java:

	
	// Six lines..
	for (int j=1; j <= 6; j++) {
	    // For each line ( = each iteration), make a NEW
	    // loop, with the number of elements (*'s) equal
	    // to the number of the line (first line = 1, second
	    // line = 2, etc.)
	    for (int k=0; k < j; k++) {
		for (int l=0; l < k; l++) {
		    System.out.print("-");
		}
		System.out.print("*");
	    }
	    // Print a carriage return to go to the next line
	    // after printing out j number of asterisks
	    System.out.println();
	}

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
