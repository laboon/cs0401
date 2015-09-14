// Note you need to import Scanner before using it!
// It is not "built in" like e.g. System

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

	// Make a new scanner
	
	Scanner sc = new Scanner(System.in);

	// Read in a line
	// This should take anything you type!

	System.out.print("Enter something, anything you want > ");
	String someStr = sc.nextLine();
	System.out.println("You typed " + someStr + "!");
	
	// Read in an integer
	// Note that an exception is thrown and the program
	// ends if the value is NOT an integer
	
	System.out.print("Enter an integer > ");
	int someInt = sc.nextInt();
	System.out.println("You typed " + someInt + "!");
	// You can now do whatever you want with that variable
	System.out.println("Multiplied by two, that's " + (someInt * 2) + "!");
	
	// You can send in multiple values as long as they are
	// separated by whitespace (tabs, spaces, etc.)

	System.out.print("Enter two floats > ");
	float f1 = sc.nextFloat();
	float f2 = sc.nextFloat();
	System.out.println("You typed " + f1 + " and " + f2 + "!");
	System.out.println("Added together, that's " + (f1 + f2) + "!");
	
	// Close the scanner.  It can no longer be used.

	sc.close();

	// I couldn't scan anything else in at this point
	
    }
    
}
