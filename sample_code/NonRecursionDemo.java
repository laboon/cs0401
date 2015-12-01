public class NonRecursionDemo {

    // Any recursive method can use a regular ol' loop!
    // Why is this good?
    // 1. Efficient (in Java)
    // 2. Avoid stack overflows
    // Why is it bad?
    // 1. Mathematically inelegant
    // 2. Might be more difficult to understand or harder to code
    public static int triangle(int num) {
	// This method does the same thing as the recursive method
	// in RecursionDemo!
	int val = 0;
	for (int j=0; j <= num; j++) {
	    val += j;
	}
	return val;
    }

  
    public static int fibonacci(int num) {
	// This method does the same thing as the recursive method
	// in RecursionDemo!
	int back2 = 0;
	int back1 = 1;
	int current = 1;
	for (int j=1; j < num; j++) {
	    current = back2 + back1;
	    back2 = back1;
	    back1 = current;
	}
	return current;
    }


    
    public static void main(String[] args) {
	int num = -1;
	
	if (args.length >= 1) {
	    num = Integer.parseInt(args[0]);
	    if (num <= 0) {
		printErrorAndDie();
	    }
	} else {
	    printErrorAndDie();
	}

	int fib = fibonacci(num);

	int tri = triangle(num);

	System.out.println("Fib(" + num + ") = " + fib);
	System.out.println("Tri(" + num + ") = " + tri);
    }

    // Print error message and end program
    public static void printErrorAndDie() {
	System.out.println("Program requires one argument, a positive integer.");
	System.exit(1);
    }

    
}
