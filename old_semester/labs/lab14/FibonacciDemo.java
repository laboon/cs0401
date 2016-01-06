public class FibonacciDemo {

    private static long _numCalls = 0;
    private static long _numMemoizedCalls = 0;
    
    // The Fibonacci Sequence is the series of numbers found by starting
    // with 0, 1, 1.. and the next number is the sum of the previous two numbers.
    // For example, 0 + 1 = 1, so the next number in the Fibonacci sequence is 1.
    // 1 + 1 is 2, so the third number is 2.  2 + 1 is 3, so the fourth number is 3.
    // etc. - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc.

    // This can very easily be calculated recursively.  For the nth number, if n
    // is 1, then return 1.  Otherwise, return whatever the results of the
    // last two elements of the Fibonacci sequence are, by calling the Fibonacci
    // method again.
    
    public static long recursiveFibonacci(long num) {
	_numCalls++;
	if (num <= 1) {
	    // BASE CASE
	    System.out.println("Fib(" + num + ") = " + num);
	    return num;
	} else {
	    // RECURSIVE CASE
	    long num1 = recursiveFibonacci(num - 1);
	    long num2 = recursiveFibonacci(num - 2);
	    System.out.println("Fib(" + num + ") = " + num1 + " + " + num2);
	    return num1 + num2;
	}
    }

    public static long iterativeFibonacci(long num) {
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


    public static long memoizedFibonacci(long num) {
	return -1;
    }

    public static long closedFormFibonacci(long num) {
	return -1;
    }

    public static long lookupTableFibonacci(long num) {
	return -1;
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

	long fib1, fib2, fib3, fib4;
		
	
	System.out.println("Recursive Fib(" + num + ") = " + recursiveFibonacci(num));
	System.out.println("\tTook " + _numCalls + " recursive calls!");
	System.out.println("Iterative Fib(" + num + ") = " + iterativeFibonacci(num));
	// System.out.println("Memoized Recursive Fib(" + num + ") = " + memoizedFibonacci(num));
	// System.out.println("\tTook " + _numMemoizedCalls + " recursive calls!");
	// System.out.println("Closed-Form Fib(" + num + ") = " + closedFormFibonacci(num));
	// System.out.println("Lookup Table Fib(" + num + ") = " + lookupTableFibonacci(num));
	
    }

    // Print error message and end program
    public static void printErrorAndDie() {
	System.out.println("Program requires one argument, a positive integer.");
	System.exit(1);
    }

    
}
