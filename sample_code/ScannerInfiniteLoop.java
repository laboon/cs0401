/**
 * If you enter a non-integer here, the loop will run forever!
 * The reason is that the "bad" value never gets taken "out"
 * of the scanner, sc.  So there is always something there
 * but it is never an int.  You need to add an extra sc.next()
 * to "get the bad value out" before trying again.
 */

import java.util.Scanner;

public class ScannerInfiniteLoop {
    public static void main(String[] args) {
	boolean noValidInput = true;
	int value = -1;
	Scanner sc = new Scanner(System.in);
	do {
	    System.out.print("Enter an int > ");
	    if (sc.hasNextInt()) {
		value = sc.nextInt();
		noValidInput = false;
	    }
	    // Add these lines to avoid an infinite loop
	    // else {
	    //    sc.next();
	    // }
	} while (noValidInput);
	System.out.println(value + " is an integer!");
    }
}
