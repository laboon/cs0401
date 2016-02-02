public class MethodDemo {

    public static void cat() {
	System.out.println("meow");
    }
    
    // Now we see that our magic incantation is just a particular
    // method with the special name of "main".  It doesn't
    // return anything (void) because it's the "top level"
    // of the program, there's nothing to return a value to.
    
    public static void main(String[] args) {

	// System.out.println() is just a method!
	System.out.println("I'm a method!");

	// You can make your own methods as procedures (void
	// return type)

	printSomethingFunny();

	// .. and enclose them in other statements/blocks such
	// as loops.

	for (int j = 0; j < 5; j++) {
	    printSomethingFunny();
	}

	// Methods can accept arguments that match their parameters
	// (a/k/a formal parameters).  These need to be of the same
	// type, or are at least implicitly castable to that type.

	for (int j = 0; j < 5; j++) {
	    printANumber(j);
	    
	    // NO!
	    // printANumber("Kitty cat");
	    // printANumber(j, 17);
	}
	
	// Functions are like procedures but return a value.  The
	// main focus is getting the value, not side effects like
	// in a procedure.

	int x = laboonify( 10 ) ;
	System.out.println("10 laboonified = " + x);

	
	// Methods can call other methods
	
	x = superLaboonify(10);
	System.out.println("10 superLaboonified = " + x);

	// Methods can act as both procedure and function
	
	x = visibleLaboonify(10);
	System.out.println("10 visibleLaboonified = " + x);

	// You can return at any point in a method.
	// Returning stops execution

	boolean fiveEven = isEven(5);
	System.out.println("5 is even? This statement is " + fiveEven);
	
	// Remember arguments are passed by value, not reference!
	
	int a = 1;
	System.out.println("A is " + a);
	addOneVoid(a);
	System.out.println("A is " + a);
	a = addOneReturn(a);
	System.out.println("A is " + a);

	// Static methods are associated with the class.  You
	// don't need to explicitly mention the class if you
	// are in the same class as that method is defined,
	// but you can if you want to do so.

	MethodDemo.printSomethingFunny();
	printSomethingFunny();
	
	// Instance methods are associated with an object
	// (a class instantiated). Don't use static for these.

	MethodDemo md = new MethodDemo();
	md.instanceMethod();
	
	
    }

    // Simple static method (procedure)
    
    public static void printSomethingFunny() {
	System.out.println("LIMAX MAXIMUS SLUGS!");
	System.out.println("BANANA SLUGS!");
	System.out.println("MORE SLUGS!");
	System.out.println("MORE SLUGS YAY!");
    }

    // Simple static method (procedure) with one parameter
    
    public static void printANumber(long n) {
	// Kind of like:
	// long n = 1;
	System.out.println(">>>> " + n + " <<<<");
    }

    // Simple function which laboonifies a number

    public static int laboonify(int n) {
	int temp = n * 10;
	temp--;
	temp = temp * 3;
	return temp;
    }

    // Method which calls another method

    public static int superLaboonify(int n) {
	int temp = laboonify(n * 100);
	return temp;
    }
    

    // Mixed procedure and function in a method
    public static int visibleLaboonify(int n) {
	System.out.println("You passed in " + n);
	int temp = n * 10;
	System.out.println("Multiplied by 10, that's " + temp);
	temp--;
	System.out.println("Decrement once, that's " + temp);
	temp = temp * 3;
	System.out.println("Multiply by three, that's " + temp);
	return temp;
	// This code will never execute!  Return ends the method!
	// javac will yell at you about unreachable code here
	// (compile-time error)
	// System.out.println("Returned " + temp);
    }

    
    public static boolean isEven(int n) {
	
	if (n % 2 == 0) {
	    return true;
	} else {
	    return false;
	}
	// javac will yell at you about unreachable code here
	// (compile-time error)
	// System.out.println("la la la I will never be printed out");
    }

    
    
    // The local variable n took the value of a (think of it as
    // n = a). However, this time we return the value, where
    // a can be assigned the return value.
    
    public static int addOneReturn(int n) {
	n++;
	return n;
    }

    // Since n is passed by value and never returned,
    // this will have no impact on the rest of the program
    
    public static void addOneVoid(int n) {
	n++;
    }

    public void instanceMethod() {
	System.out.println("I'm an instance method!");
    }
    
}
