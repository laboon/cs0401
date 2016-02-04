import java.util.Scanner;

// Variables exist from when they are declared
// until the end of the current block.

public class VariableScope { // Start of _class_ block
    
    public static void main(String[] args) { // Start of method _main_ block

	int x = 1; // will exist until end of main block

	while (x < 4) { // start while block
	    int y = 10; // will exist until end of while block
	    x++; // In a loop, I can access variables referenced in higher block
	    y += 5;
	    System.out.println("y is now " + y);
	} // end while block

	System.out.println("After loop, x is now " + x);
	System.out.println("But y no longer exists! ");

	// j is created immediately before the block; will not reset
	// at the end of each iteration!  But p will.
	
	for (int j=0; j < 10; j++) { // start of _for_ block
	    System.out.println("j is " + j + " at beginning of the loop");
	    int p = 40; // resets each iteration through
	    p += 2;
	    j += 2;
	    System.out.println("j is " + j + " but p is " + p);
	} // end of _for_ block

	System.out.println("Can't access j here!");
	
	int q = 17;
	
	if (x < 4) {
	    int a = 4;
	    System.out.println(a);
	} else {
	    int b = 6;
	    System.out.println(b);
	}
	// q is accessible from here
	// Neither a nor b is accessible here

	// function call

	
	System.out.println("x is " + x);
	x = foo(x);	
	System.out.println("After foo call, x is " + x);

	doSomething(x);

	
	doSomethingCrazy();
	
	
	boolean moreCustomers = false;

	Scanner sc = new Scanner(System.in);
	
	do { // start do block
	    int foo = sc.nextInt();
	    if (foo == 2) {
		moreCustomers = false;
	    } else if (foo == 1) {
		moreCustomers = true;
	    } else {
		System.out.println("Enter 1 or 2!");
		moreCustomers = true;
	    }
		     
	} while (moreCustomers); // end do..while loop

	// Can't access foo here - declared inside of the do..while block!
	// System.out.println("User typed: " + foo);
	
    } // end method _main_ block

    // Note that this method is still part of the VariableScope class!
    // Since the class block has not ended

    // main -> calls doSomething... -> doSomethingElse

    public static void doSomething(int r) {
	
	// Variable r now has value (copy!) of x
	System.out.println("(doSomething) r is " + r);
	// I can make another variable x, which has NO RELATIONSHIP
	// to the x in the method this was called from
	int x = 200;
	System.out.println("(doSomething) x is " + x);
	
	// If I call another method, it can also have an x which is
	// entirely separate from this x

	doSomethingElse();

    }


    
    
    // In bother of these methods, x is an entirely different variable,
    // even an entirely different type!
    
    public static void doSomethingElse() {
	double x = 4.0;
	x = x / 2.0;
	System.out.println("(doSomethingElse) x is " + x);
	doAnotherThing();
    }

    public static void doAnotherThing() {
	String x = "Talking mailbox";
	System.out.println("(doAnotherThing) x is " + x);
    }

    public static int foo(int y) {
	int schmeckle = 8;
	schmeckle--;
	return y * 2;
    }
    // MAGIC FOR NOW!
    
    public static int _foo = 1;
    
    public static void doSomethingCrazy() {
	System.out.println("Crazy!");
	doSomethingElseCrazy();
    }

    public static void doSomethingElseCrazy() {
	System.out.println("*political joke*");
	doSomethingCrazy();
    }
    
} // end _class_ block
