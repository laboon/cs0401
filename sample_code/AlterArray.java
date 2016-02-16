public class AlterArray {

    public static void blimBlam(int[] a2) {
	a2[0] = -100;
	a2[3] = 17;
    }

    public static int[] corbloc() {
	int[] toReturn = new int[10];
	int[] meow = new int[19];
	meow[2] = 6;
	toReturn[6] = 1;
	return toReturn;
    }
    
    public static int doubleMe(int qwyjibo) {
	int toReturn =  qwyjibo * 2;
	qwyjibo++; // <- LOST LIKE TEARS IN THE RAIN
	qwyjibo *= 9; // <- TOTALLY IRRELEVANT
	qwyjibo = 16 % 3; // <- SUPERFLUOUS
	return qwyjibo; // ONLY WAY I CAN INTERACT WITH REST OF PROGRAM!
    }

    public static void main(String[] args) {

	int[] foo = corbloc();

	for (int a : foo) {
	    System.out.println(a);
	}

	
	// Passing in values as primitives can't cause any issues
	// aside from the return value, because we are sending
	// a copy of the value to the method - NOT the variable
	// itself.
	// doubleMe does all sorts of crazy stuff to r, but none of it
	// matters, it's not "our" r here.

	int r = 6;
	System.out.println("Before doubleMe, r is : " + r);
	
	int doubleR = doubleMe(r);

	System.out.println("After doubleMe, r is : " + r);
	
	// Arrays are different, because the "value" you are passing in
	// is really a _reference_ - it's the address of an object
	// out in memory.  If I give you a copy of my address, there
	// isn't suddenly another Professor Laboon out there.

	// a1 points to memory location, let's say, 0x1069FB12
	// When I go there, I see that there is an array object
	// which has the values 1,2,3,4,5,6 stored in it.
	
	// So when I pass the array, it could change EVEN if there
	// is no return statement!  
	
	int[] a1 = { 1, 2, 3, 4, 5, 6 };

	// Check out these cool new loops!  They're called
	// foreach loops.  We can use them with arrays and other
	// collections of data in Java.
	// They mean "for every int in a1, put it into variable a
	// and iterate the loop.  This loop is the equivalent of
	// for (int j=0; j < a1.length; j++) {
	//    int a = a1[j];
	//    System.out.println(a);
	// }
	// But much cleaner!  Any time you use a foreach loop, it
	// could be replaced with a regular for loop, though.  They're
	// just syntactic sugar.
	
	System.out.println("Before Blim Blam, a1 is..");
	
	for (int a : a1) {
	    System.out.println(a);
	}

	// I call blimBlam here with a1.  Note that there is NO
	// return value as it is a void method.  With primitive
	// values, this would mean that we are safe from variables
	// changing from out underneath us.  But not with arrays.
	
	blimBlam(a1);

	// Behold, a value has changed...
	
	System.out.println("After Blim Blam, a1 is..");
	for (int a : a1) {
	    System.out.println(a);
	}
    }
    
}
