public class FibonacciDemoSolved {


private static long[] _solvedVals = {
    0L,
	1L,
	1L,
	2L,
	3L,
	5L,
	8L,
	13L,
	21L,
	34L,
	55L,
	89L,
	144L,
	233L,
	377L,
	610L,
	987L,
	1597L,
	2584L,
	4181L,
	6765L,
	10946L,
	17711L,
	28657L,
	46368L,
	75025L,
	121393L,
	196418L,
	317811L,
	514229L,
	832040L,
	1346269L,
	2178309L,
	3524578L,
	5702887L,
	9227465L,
	14930352L,
	24157817L,
	39088169L,
	63245986L,
	102334155L,
	165580141L,
	267914296L,
	433494437L,
	701408733L,
	1134903170L,
	1836311903L,
	2971215073L,
	4807526976L,
	7778742049L,
	12586269025L,
	20365011074L,
	32951280099L,
	53316291173L,
	86267571272L,
	139583862445L,
	225851433717L,
	365435296162L,
	591286729879L,
	956722026041L,
	1548008755920L,
	2504730781961L,
	4052739537881L,
	6557470319842L,
	10610209857723L,
	17167680177565L,
	27777890035288L,
	44945570212853L,
	72723460248141L,
	117669030460994L,
	190392490709135L,
	308061521170129L,
	498454011879264L,
	806515533049393L,
	1304969544928657L,
	2111485077978050L,
	3416454622906707L,
	5527939700884757L,
	8944394323791464L,
	14472334024676221L,
	23416728348467685L,
	37889062373143906L,
	61305790721611591L,
	99194853094755497L,
	160500643816367088L,
	259695496911122585L,
	420196140727489673L,
	679891637638612258L };
    
    private static long numCalls = 0;

    public static void printArray(long[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	System.out.println(arr[arr.length - 1] + " ]");
    }

    
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
	numCalls++;
	if (num <= 1) {
	    // BASE CASE
	    // System.out.println("Fib(" + num + ") = " + num);
	    return num;
	} else {
	    // RECURSIVE CASE
	    long num1 = recursiveFibonacci(num - 1);
	    long num2 = recursiveFibonacci(num - 2);
	    // System.out.println("Fib(" + num + ") = " + num1 + " + " + num2);
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

    private static long[] _memoizedVals = new long[100];
    
    private static int _numMemoizedCalls = 0;
    
    public static long memoizedFibonacci(long num) {
	// printArray(_memoizedVals);
	
	_numMemoizedCalls++;

	// First check if result already stored
	if (_memoizedVals[(int) num] != 0) {
	    // System.out.println("Memoized " + num + " = " + _memoizedVals[(int) num]) ;
	    return _memoizedVals[(int) num];
	}
	    
	
	if (num <= 1) {
	    // BASE CASE
	    // System.out.println("Fib(" + num + ") = " + num);
	    return num;
	} else {
	    // RECURSIVE CASE
	    long num1 = memoizedFibonacci(num - 1);
	    long num2 = memoizedFibonacci(num - 2);
	    _memoizedVals[(int) num] = num1 + num2;
	    // System.out.println("Memoized Fib(" + num + ") = " + num1 + " + " + num2);
	    return _memoizedVals[(int) num];
	}

    }

    private final static double PHI = 1.6180339887;
    
    public static long closedFormFibonacci(long num) {
	return Math.round(Math.pow(PHI, num) / Math.sqrt(5));
    }
    
    public static long lookupTable(long num) {
	return _solvedVals[(int) num];
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

		
	
	System.out.println("Recursive Fib(" + num + ") = " + recursiveFibonacci(num));
	System.out.println("\tTook " + numCalls + " recursive calls!");
	System.out.println("Iterative Fib(" + num + ") = " + iterativeFibonacci(num));
	System.out.println("Memoized Recursive Fib(" + num + ") = " + memoizedFibonacci(num));
	System.out.println("\tTook " + _numMemoizedCalls + " memoized recursive calls!");
	System.out.println("Closed-Form Fib(" + num + ") = " + closedFormFibonacci(num));
	System.out.println("Lookup Table Fib(" + num + ") = " + closedFormFibonacci(num));
	
    }

    // Print error message and end program
    public static void printErrorAndDie() {
	System.out.println("Program requires one argument, a positive integer.");
	System.exit(1);
    }

    
}

