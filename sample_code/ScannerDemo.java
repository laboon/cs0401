// Note you need to import Scanner before using it!
// It is not "built in" like e.g. System

import java.util.Scanner;

// Ignore this for now
import java.io.IOException;

public class ScannerDemo {

    public static void main(String[] args) {

	int x = 10;
	double i = 10.0;
	System.out.println(x == i);
	System.exit(0);
	
	
	// Make a new scanner
	
	Scanner sc = new Scanner(System.in);

	// Read in a line
	// This should take anything you type!

	// System.out.print("Enter something, anything you want > ");
	// String someStr = sc.nextLine();
	// System.out.println("You typed " + someStr + "!");
	
	// Use .next() to read in the next "token" on a line
	// A token is a group of chars separated by whitespace -
	// e.g. the string "12 cats love football!" has four
	// token - "12", "cats", "love", and "football!"

	// System.out.print("Enter at least two tokens > ");
	// String str1 = sc.next();
	// String str2 = sc.next();
	// System.out.println("The first token is " + str1 + "!");
	// System.out.println("The second token is " + str2 + "!");
	
	// Read in an integer
	// Note that an exception is thrown and the program
	// ends if the value is NOT an integer
	
	// System.out.print("Enter an integer > ");
	// int someInt = sc.nextInt();
	// System.out.println("You typed " + someInt + "!");
	// // You can now do whatever you want with that variable
	// System.out.println("Multiplied by two, that's " + (someInt * 2) + "!");
	
	// You can send in multiple values as long as they are
	// separated by whitespace (tabs, spaces, etc.)
	// This will accept the *first two*.
	// If you enter more, they are just "waiting" in the
	// sc object.
	
	// System.out.print("Enter two floats > ");
	// float f1 = sc.nextFloat();
	// float f2 = sc.nextFloat();
	// System.out.println("You typed " + f1 + " and " + f2 + "!");
	// System.out.println("Added together, that's " + (f1 + f2) + "!");

	// Can we tell what the token is ahead of time? Yes!

	// System.out.println("Enter a token > ");
	if (sc.hasNextInt()) {
	    System.out.println("You typed an integer!");
	    int anInt = sc.nextInt();
	    System.out.println("It was " + anInt);
	} else {
	    System.out.println("You typed something other than an integer!");
	    String aToken = sc.next();
	    System.out.println("It was " + aToken);
	}
	// System.exit(0);
	
	// Note that Scanner acts like a "wrapper" around System.in.
	// We can use System.in directly, but it's more complicated.
	// Note you don't have to understand the exception stuff yet.

	System.out.println("Enter some other line > ");
	int someCharValue = 0;
	try {
	    someCharValue = System.in.read();
        } catch (IOException ioex) {
	    System.exit(1);
	}
	char actualChar = (char) someCharValue;
	System.out.println("The first char you typed was " + actualChar + "!");
	System.out.println("That is character code " + someCharValue + "!");

	// When using System.in and Scanner, you need to press enter to
	// enter data, so "Press any key to continue..."-style
	// code is not possible.  It's kind of silly, but you need
	// to use yet another class, Console, or a third-party library
	// like JLine to do that.
	// That's beyond the scope of what we're discussing here, though.
	
	// Close the scanner.  After doing this, it can no longer be used.

	sc.close();

	// I couldn't scan anything else in at this point
	
    }
    
}
