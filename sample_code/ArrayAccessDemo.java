public class ArrayAccessDemo {

    public static int sequentialAccess(int[] arr) {
	for (int j=0; j < arr.length; j++) {
	    if (j == 5) {
		return arr[j];
	    }
	}
	return -1;
    }

    public static int directAccess(int[] arr) {
	return arr[5];
    }
    
    public static void main(String[] args) {
	System.out.println("Accessing the index 5 of array... ");
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	// Direct access here, too.  Read/write

	arr[0] = arr[1];
	
	System.out.println("sequential: " + sequentialAccess(arr));
	System.out.println("direct: " + directAccess(arr));
    }
    
}
