public class WideningDemo {

    // Method overloading (aka ad hoc polymorphism)

    public static long minimum(long a, long b) {
	System.out.println("Long minimum!");
	// Ternary operator!
	// Acts just like a simple if..then
	// Equivalent to the code:
	// if (a < b) {
	//    return a;
	// } else {
	//    return b;
	// In parens: a conditional statement
	// Between the ? and : (the first statement), executed if true
	// between the : and the ;, executed if false
	return (a < b) ? a : b;
    }

    public static float minimum(float a, float b) {
	System.out.println("Float minimum!");
    	return (a < b) ? a : b;
    }

    public static short minimum(short a, short b) {
	System.out.println("Short minimum!");
    	return (a < b) ? a : b;
    }

    
    public static void main(String[] args) {

	// Java will try to find the "best fit" for a method
	// This does not mean that the arguments have to meet
	// the EXACT parameter types, only that the arguments can be
	// "widened" to fit into it.

	int a = 7;
	int b = 5;

	// Even though minimum takes longs, the ints can be widened
	// to longs
	
	long c = minimum(a, b);
	System.out.println("Minimum is " + c);
	
	// Here, we send in floats, and we call the float minimum
	// method.

	float d = minimum((float) a, (float) b);
	System.out.println("Minimum is " + d);

	// However, ints can be widened to floats, too, so why
	// didn't the first method just widen the ints all the way
	// up to floats?  Because Java looks for the least possible
	// amount of widening.

	byte e = (byte) 9;
	byte f = (byte) 2;
	
	short g = minimum(e, f);
	System.out.println("Minimum is " + g);
	
	// double k1 = 99;
	// double k2 = 100;

	// double k3 = minimum((float) k1, (float) k2);
	// System.out.println("Minimum is " + k3);
	
    }


    // Note - some languages (such as C++) also allow
    // operator overloading (e.g., using + to mean something
    // else, e.g. concatenating two arrays.
    // Although Java does some operator overloading internally
    // (e.g., "foo" + "bar" = "foobar", the + here is different
    // than an arithmetic +), as a developer, you cannot do it.
  
    
}
