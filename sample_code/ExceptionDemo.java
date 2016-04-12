// Shows how exceptions are caught / thrown

public class ExceptionDemo {


    public static void main(String[] args) {
	
	int a = 1;
	int b = 0;
	int c = 0;

	try {
	    c = 7; // a / b; // EXCEPTION OCCURS - LEAVE THE BLOCK
	    System.out.println("Bill rocks!");
	    System.out.println("WOOOO");
	} catch (Exception ex) {
	    System.out.println("You broke the universe!");
	    return;
	} finally {
	    System.out.println("La la la!");
	}
	
	try {
	    Thread.sleep(2);
	} catch (InterruptedException iex) {
	    System.out.println("Thread, Interrupted.");
	}
	System.out.println("...");
	// If you want to "catch" an exception (not throw
	// it up to be handled by whoever called this method,
	// you can wrap it in a try..catch block.

	// The try block is the code that will be executed.
	// If an exception occurs, this block will cease
	// execution and the exception will be thrown.  However, it
	// will then be caught by the catch block, and the catch
	// block will execute.

	// 
	
	// In this case, when we divide by zero, 
	
	try {
	    c = a / b;
	    // Lots of code...
	} catch (ArithmeticException aex) {
	    System.out.println(aex.toString());
	}
	
	// Note that having something in a try block does not mean
	// that an exception will or can occur!  Nothing is stopping
	// you from doing this.
	
	try {
	    c = 8 * 2;
	} catch (ArithmeticException aex) {
	    System.out.println("This will never be called!");
	    System.out.println(aex.toString());
	}

	// You ordinarily want to be as specific as possible when
	// saying what exception might be thrown, but you can also
	// use the superclass Exception to catch ANY exception.

	// This is polymorphism in action!
	
	try {
	    c = 17 / 0;
	} catch (Exception ex) {
	    System.out.println(ex.toString());
	}

	// What if multiple exceptions can occur?  One way, of course,
	// is to simply catch Exception.  What if you wanted to do different
	// things depending on exception?  For example, if you can't
	// read from a file or the file is corrupt, you might want to
	// display different error messages to a user.  In that case, you
	// can have multiple catch blocks, one for each exception.

	// Remember that the code in the block will stop executing as soon as
	// an exception is hit!
	
	try {
	    int[] d = new int[5];
	    int e = 70;

	    d[e] = 18;
	    c = a / b;
	} catch (ArithmeticException aex) {
	    System.out.println("You can't divide by zero!");
	    System.out.println(aex.toString());
	} catch (ArrayIndexOutOfBoundsException obex) {
	    System.out.println("You can't access out-of-bounds array indexes!");
	    System.out.println(obex.toString());
	}
	
	// Exceptions are handled from top to bottom - so put most specific errors
	// on top, then move down to less specific!

	// THIS IS BAD!  In fact, Java 1.8 won't even let you do it.
	
	// try {
	//     c = a / b;
	// } catch (Exception obex) {
	//     System.out.println("Something happened, I don't know what!");
	//     System.out.println(obex.toString());
	// } catch (ArithmeticException aex) {
	//     System.out.println("You can't divide by zero!");
	//     System.out.println(aex.toString());
	// }

	// THIS IS BETTER!
	
	try {
	    c = a / b;
	} catch (ArithmeticException aex) {
	    System.out.println("You can't divide by zero!");
	    System.out.println(aex.toString());
	} catch (Exception obex) {
	    System.out.println("Something happened, I don't know what!");
	    System.out.println(obex.toString());
	} 
       
	
	// What happens if an exception occurs INSIDE a catch block?

	// You're no longer in a try block, so nothing will save you!  The exception is
	// thrown and since nothing catches it, the program will halt.

	// For this reason, be very careful what you do in the catch block.
	
	try {
	    c = 12 / 0;
	} catch (ArithmeticException aex) {
	    System.out.println("You can't divide 12 / 0!  Watch:");
	    // try {
	    // c = 12 / 0;
	    // } catch (Exception ex) {
	    // }
	} 
	
	// Sometimes you want to do something at the END of a try block,
	// if an exception occurs or not.  For this, you can use finally.

	// A finally block goes at the end of the catch blocks, and is executed
	// after the try block finished (remember it can finish early!) and any
	// caught exceptions occur.

	int[] g = new int[17];
	
	try {
	    int sum = 0;
	    for (int j = 0; j <= g.length; j++) {
		g[j] = j;
		sum += j;
	    }
	    System.out.println("Sum is " + sum);
	} catch (Exception ex) {
	    System.out.println("Could not sum!  Had an error occur!");
	} finally {
	    System.out.println("Resetting g...");
	    for (int j = 0; j < g.length; j++) {
		g[j] = 0;
	    }
	    
	}

	// Although tracking down the error may seem simple, it gets difficult for
	// larger programs where the location where the error is caught may be very
	// different than where it is thrown.

	// .printStackTrace lets us see a "trace" of the stack, to see where the error
	// actually occurred and what called it.

	try {
	    int x = laboonify(17);
	    System.out.println("17 laboonified is " + x);
	} catch (Exception ex) {
	    System.out.println("Could not laboonify 17!");
	    // Hard to determine where the error is just with this!
	    System.out.println(ex.toString());
	    // Note that this does the printing for you - it does not return
	    // a String, so no need to println() it.
	    ex.printStackTrace();
	}
	
    }

    // There is no need to comprehend this.
    
    public static int laboonify2(int val1, int val2, int val3, int val4) {
	int r = val4 + 19;
	int h = val1 - 2;
	int l = r + h;
	return laboonify3(r, h, l, val3);
	
    }

    public static int laboonify3(int val1, int val2, int val3, int val4) {
	boolean l = (val1 < 4);
	if (!l) {
	    val1 = 1;
	}
	return laboonify4(val1, val2, val3, val4);
	
    }
    
    public static int laboonify4(int val1, int val2, int val3, int val4) {
	int a = laboonify5(val2, val1);
	int b = laboonify5(val3, val4);
	return a + b;
    }

    
    public static int laboonify5(int lhs, int rhs) throws ArithmeticException {
	lhs += rhs;
	return (lhs++) / rhs;
    }

    public static int laboonify(int val) {
	int c = val - val;
	int b = laboonify2(val, val * 2, c, (val * -1));
	b++;
	return b;
    }

    class LaboonException extends Exception {
	
    }

}
