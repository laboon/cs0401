import java.util.*;
import java.io.*;

public class FileDemo {

    // "throws IOExceptions" means "watch out compiler, this method
    // may cause an exception!
    // It "passes the buck" up the stack.  Of course, at this point
    // (main), passing the buck means passing it to the user - which
    // means 
    // Remember other run-time exceptions - Divide By Zero,
    // Input Mismatch, etc.
    
    public static void main(String [] args) throws IOException {

	// Reading arguments from command line!
	// args[] is just a group of String objects that are passed
	// in from the command line.
	
	if (args.length < 2) {
	    showErrorMessage();
	}

	// Take those arguments and send them to two different
	// variables.
	
	String option = args[0];
	String fileName = args[1];

	// Depending on the argument passed in, read or write to a file
	
	if (option.equals("read")) {
	    // Read the file name
	    displayFile(fileName);
	} else if (option.equals("write")) {
	    // Write some info to the file
	    writeFile(fileName);
	} else {
	    // Otherwise, I don't know what to do..
	    showErrorMessage();
	    
	}		     
    }

    public static void showErrorMessage() {
	System.out.println("Format: java FileDemo [read | write] <filename>");
	System.exit(1);
    }

	
    public static void displayFile(String fileName) throws IOException {

	// We can re-use Scanner, but instead of getting data
	// from System.in, we get it from a file.  Note that the file
	// f is a File object, not just the String representation of
	// the filename.
	
	File f = new File(fileName);
	Scanner sc = new Scanner(f);

	// Read the entire first line as a String and print it out
	
	String title = sc.nextLine();

	System.out.println(title);

	// Now loop through and look for five int values.  These can
	// be read in using our Scanner object into variables.
	// The only difference is that we are getting data from a file
	// and not from the keyboard.
	
	int total = 0;
	
	for (int j=0; j < 5; j++) {
	    int readNum = sc.nextInt();
	    System.out.println("Lucky Number: " + readNum);
	    total += readNum;
	}

	// We can use data from the file just like any other data.
	
	System.out.println("A really lucky number is the sum of all of them!");	
	System.out.println("That is: " + total);

	// Be sure to close the file when you are done using it!
	// Otherwise there may be troubles if multiple processes
	// try accessing the same file.
	
	sc.close();
    }

    // Write some text and random numbers to a specified text file
    
    public static void writeFile(String fileName) throws IOException {

	// Create a new PrintWriter - this is the same thing as
	// the "out" in System.out.println, which prints to the
	// screen.  So we can treat it the same, except it will
	// write to a file instead of the screen.

	// Note that unlike before, when we had to make a File
	// object "surrounding" the String representation of the
	// filename, now we can just pass in that String.  
	
	PrintWriter out = new PrintWriter(fileName);
	out.println("Your Lucky Numbers:");

	// Generate some random numbers and write them to the file

	Random rng = new Random();

	// Note that we are printing just like we are to the console,
	// except it is to a file.
	
	for (int j=0; j < 5; j++) {
	    int randNum = rng.nextInt(100);
	    out.println(randNum);
	}

	// Be sure to close the file when you are done using it!
	// Otherwise there may be troubles if multiple processes
	// try accessing the same file.

	
	out.close();
    }
}
