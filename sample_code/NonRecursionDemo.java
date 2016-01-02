public class NonRecursionDemo {

    // Any recursive method can use a regular ol' loop!
    // Why is this good?
    // 1. Efficient (in Java)
    // 2. Avoid stack overflows
    // Why is it bad?
    // 1. Mathematically inelegant
    // 2. Might be more difficult to understand or harder to code
    public static long triangle(long num) {
	// This method does the same thing as the recursive method
	// in RecursionDemo!
	long val = 0;
	for (int j=0; j <= num; j++) {
	    val += j;
	}
	return val;
    }

  
    public static long fibonacci(long num) {
	// This method does the same thing as the recursive method
	// in RecursionDemo!
	long back2 = 0;
	long back1 = 1;
	long current = 1;
	for (long j=1; j < num; j++) {
	    current = back2 + back1;
	    back2 = back1;
	    back1 = current;
	}
	return current;
    }


    
    public static void main(String[] args) {

	for (int j=9; j>=0; j--) {
	    System.out.print(j);
	}
	System.out.println();
	
	long num = -1;
	
	if (args.length >= 1) {
	    num = (long) Integer.parseInt(args[0]);
	    if (num <= 0) {
		printErrorAndDie();
	    }
	} else {
	    printErrorAndDie();
	}

	long fib = fibonacci(num);

	long tri = triangle(num);

	System.out.println("Fib(" + num + ") = " + fib);
	System.out.println("Tri(" + num + ") = " + tri);
    }

    // Print error message and end program
    public static void printErrorAndDie() {
	System.out.println("Program requires one argument, a positive integer.");
	System.exit(1);
    }

    
}
