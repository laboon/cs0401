import java.util.*;

// This class shows how Generics are used in Java.

public class GenericDemo {

    public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("chirpanirp");
	
	// Remember that an ArrayList accepts Objects, that is, any kind of
	// Java object can be in one.  Unlike arrays, which can only store
	// one kind of data and so we know what we're getting.

	al.add(new Integer(1));
	al.add(new Float(3.11f));
	al.add(new Byte((byte) 17));

	// When we want to get something out of the ArrayList, it's coming out
	// as an Object.  We need to explicitly cast it if we want it to go
	// into a specific kind of object.

	// This won't work - can't auto-convert a reference to an Object to
	// an Integer.
	// Integer baz = al.get(1);

	// Need to explicitly cast - say "trust me Java, I know what I'm doing"

	Integer baz2 = (Integer) al.get(1);

	// This will cause a run-time error!
	// Run-time errors are Bad.  Much better to catch at compile time.
	// Why are run-time errors bad?
	//   1. Harder to find
	//   2. Harder to test for
	//   3. Ruin user experience
	// Integer foo = (Integer) al.get(0);

	// So much work, and unsafe!  What if we accidentally put in a non-Integer there?
	
	// Let's assume that our ArrayList should ONLY ever have Integers in it.
	// Wouldn't it be nice if we could tell that to Java?
	// Now you can, with Generics!  You can add what kind of objects an
	// ArrayList (or whatever) can store in <> symbols.  Observe:

	ArrayList<Integer> intAl = new ArrayList<Integer>();
	intAl.add(new Integer(1));
	intAl.add(new Integer(2));
	intAl.add(new Integer(3));

	// won't work =(
	// intAl.add("BILL LABOON!!!!!!!");
		
	ArrayList<String> strAl = new ArrayList<String>();
	strAl.add("Nirp");
	strAl.add("A");
	strAl.add("Chirp");
	
	// If you try to add something to intAl that is not an Integer, or to
	// strAl which is not a String, it will fail at compile-time!  No more
	// waiting to run something before knowing if it works or not.
	
	// WILL NOT COMPILE
	// intAl.add(new Float(7.11f));
	// strAl.add(97);

	// Importantly, when we get something out of intAl, we know it is
	// an Integer, and Java knows too!  Look, no explicit casting!

	int bizzle = ((int) ((int) ((int) (int) 7 + (int) 4 - (int) 2 + (int) 3)));
	System.out.println(bizzle);
	
	Integer bar = (Integer) intAl.get(0);

	System.out.println(bar);
	
    }
    
}
