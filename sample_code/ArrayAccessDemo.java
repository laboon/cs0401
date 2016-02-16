public class ArrayAccessDemo {

    // This is just a helper method I made to pretty-print
    // arrays.
    
    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
		System.out.print(arr[j] + ", ");
	}
	
	System.out.println(arr[arr.length - 1] + " ]");

    }

    
    public static void main(String[] args) {
	System.out.println("Accessing the index 5 of array... ");
	int[] arr = { 14, 21, 1, 17, 42, 39, 18, 12, 8, 10 };

	// Direct access here -> we do not need to go through
	// positions 0 through 4 to get here!

	arr[5] = 0;

	printArray(arr);
	
	// Sequential access -> you need to go through each
	// previous element to get to a certain place
	// In this situation, we are looking for the value
	// 8 and if we find it, replace it with -1.
	// Since we don't know where 8 is, we can't directly
	// access it - we need to sequentially search through
	// all the elements.
	
	for (int j=0; j < arr.length; j++) {
	    if (arr[j] == 8) {
		arr[j] = -1;
	    }
	}
	
	printArray(arr);
	
	// Why would you want to do sequential access instead
	// of direct access?  It seems so much more work.
	// 1. Some data types (e.g. lists) can only be accessed
	// sequentially
	// 2. Necessary for, say, searching an unsorted array
	// 3. Necessary for accessing an entire array

	// Let's say you are looking for 
	
	
    }
    
}
