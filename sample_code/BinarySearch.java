import java.util.*;
    
public class BinarySearch {

    /**
     * Print array with Left / Right / Middle indicators
     */

    public static void printArrayWithLRM(int[] arr, int l, int r, int m) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + " ");
	}
	if (arr.length > 0) {
	    System.out.print(arr[arr.length - 1]);
	}
	System.out.println(" ]");
	System.out.print("  ");
	for(int j = 0; j < arr.length; j++) {
	    if (j == r && j == l && j == m) {
		System.out.print("LMR ");		
	    } else if (j == l && j == m) {
		System.out.print("LM  ");
	    } else if (j == r && j == m) {
		System.out.print("MR  ");
	    } else if (j == l) {
		System.out.print("L   ");
	    } else if (j == r) {
		System.out.print("R   ");
	    } else if (j == m) {
		System.out.print("M   ");
	    } else {
		System.out.print("    ");
	    }
	}
	System.out.println();
    }

    
    private static int arrToSearch[] = {100, 204, 320, 409, 597,
				 550, 595, 701, 722, 723,
				 811, 813, 824, 835, 840,
				 900, 902, 904, 910, 999};

    public static void main(String[] args) {

	int tgt = 0;
	int pos = 0;
	
	Scanner sc = new Scanner(System.in);

	do {
	    System.out.print("Target > ");
	    tgt = sc.nextInt();

	    pos = binarySearch(arrToSearch, tgt);

	    if ( pos != -1) {
		System.out.println("Found " + tgt + " at position " + pos + "! :D");
	    } else {						
		System.out.println("Did not find " + tgt + " in array. :(");
	    }

	    sc.nextLine();
		  
	} while (true); // Just hit control-C to exit
    }

    /**
     * Search for an integer using Binary Search
     *  @param int[] arr Array to search
     *  @param int tgt Target to search for
     */

    public static int binarySearch(int[] arr, int tgt)
    {

	int left = 0;
	int right = arr.length - 1;
	int middle = -1;
	int pos = -1;
	boolean found = false;


	// Keep searching until one of those two things happens -
	// 1. found turns true, because we found the number
	// 2. Left <= right, which means we have "collapsed" the search space -
	//    we have looked everywhere and did not find it
	
	while (!found && left <= right) {

	    // Get midpoint - notice this is integer division so automatic rounding down!
	    middle = (left + right) / 2;

	    System.out.println("\tChecking midpoint of positions " + left + " & " + right +
			       ", value = " + arr[middle]);
	    printArrayWithLRM(arr, left, right, middle);
	    
	    // Three possibilities - value is equal to midpoint, in which case we found the target.
	    // Value is greater than midpoint, so look to the right
	    // Value is less than midpoint, so look to the left
	    if (arr[middle] == tgt) {
		System.out.println("\tIndex " + middle + " held value " + arr[middle] + "!");
		found = true;
		pos = middle;
	    } else if (arr[middle] > tgt) {
		System.out.println("\tValue " + tgt + " is LESS than " + arr[middle] + ", looking to the left");
		right = middle - 1;
	    } else {
		System.out.println("\tValue " + tgt + " is GREATER than " + arr[middle] + ", looking to the right");
		left = middle + 1;
	    }
	}

	if (found) {
	    return pos;
	} else {
	    return -1;
	}
    }
    
}
