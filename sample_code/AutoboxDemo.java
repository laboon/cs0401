public class AutoboxDemo {

    public static void main(String[] args) {


	// Create two Integer wrappers around ints 7 and 5
	Integer a = new Integer(7);
	Integer b = new Integer(5);

	// Autobox and put into another Integer object
	Integer result1 = a + b;

	// Autobox and put into an int primitive
	int result2 = a + b;

	// Get intValues (convert to primitives) and put into an int
	int result3 = a.intValue() + b.intValue();

	// Get intValue from a, add it to an Integer wrapper object b
	int result4 = a.intValue() + b;
	
	System.out.println("Result 1 = " + result1);
	System.out.println("Result 2 = " + result2);
	System.out.println("Result 3 = " + result3);
	System.out.println("Result 4 = " + result4);
    }   
}
