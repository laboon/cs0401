public class ArrayAccessDemo {

    public static void sequentialAccess(int[] arr) {
	for (int val : arr) {
	    
    }

    public static void directAccess(int[] arr) {
	for (int j=0; j < arr.length; j++) {
	    
	}

	
    }
    
    public static void main(String[] args) {
	System.out.println("Accessing the index 5 of array... ");
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	// Direct access here, too.  Read/write

	arr[0] = arr[1];
	
	sequentialAccess(arr));
	System.out.println("direct: " + directAccess(arr));
    }
    
}
