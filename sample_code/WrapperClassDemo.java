
import java.util.ArrayList;

public class WrapperClassDemo {

    public static void main(String[] args) {
	// We need to use a workaround for dealing with 'primitives'
	// This is done via a wrapper class.  You can use these when
	// you need an object "wrapper" around a primitive.
	// Wrappers hold a value, but also provide lots of helper methods
	// and can be passed around as a reference

	// Wrapper classes often have the same name as the primitive
	// class, but with a capital letter.  The exceptions are
	// Integer, which is the wrapped version of int, and
	// Character, a wrapped version of char.
	
	Byte byteObject = new Byte((byte) 17);
	Short shortObject = new Short((short) 100);
	Integer intObject = new Integer(6000);
	Long longObject = new Long(999999);
	Boolean booleanObject = new Boolean(true);
	Float floatObject = new Float(13.0004); // <-- This is weird.
	Double doubleObject = new Double(99.99999);
	Character charObject = new Character('F');
	
	// You can extract the primitive value using value methods:
	// Java API
	
	int intX = intObject.intValue();
	long longX = intObject.longValue();
	byte byteX = intObject.byteValue();

	System.out.println("intX = " + intX + ", longX = " + longX
			   + ", byteX = " + byteX);
	
	// Now we can use "primitives" in our ArrayLists!
	
	ArrayList<Integer> integerList = new ArrayList<Integer>();

	for (int j=0; j < 5; j++) {
	    integerList.add(new Integer(j * 1000));
	}

	for (Integer num : integerList) {
	    System.out.println(num.intValue() * 2);
	}

	// We can do all sorts of other things, as well.

	System.out.println("integerList in different bases:");

	for (Integer num : integerList) {
	    int intNum = num.intValue();
	    System.out.println("Decimal (10): " + intNum
			       + " / Binary (2): " + Integer.toBinaryString(intNum)
			       + " / Hexadecimal (16): " + Integer.toHexString(intNum)
			       + " / Octal (8): " + Integer.toOctalString(intNum));
	}
	
	System.out.println("Read in Strings as ints");

	String someValue = "713";

	int foo = Integer.parseInt(someValue);
	
	String hexExample = "2C9";

	int bar = Integer.parseInt(hexExample, 16);

	System.out.println("foo = " + foo + " / bar = " + bar);
	
    }
}
