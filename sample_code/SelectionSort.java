import java.util.*;

public class SelectionSort {

    /**
     * Helper method for printing out arrays.
     * @param int[] arr Array of integers to print
     */
    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	if (arr.length > 0) {
	    System.out.print(arr[arr.length - 1]);
	}
	System.out.println(" ]");
	    
    }

    /**
     * Swap two elements in an array
     * @param int[] arr - the array
     * @param int index1 - the index of first element to swap
     * @param int index2 - the index of the second element to swap
     */

    public static void swap(int[] arr, int index1, int index2) {
	if (index1 == index2) {
	    // Do nothing!
	} else {
	    int tmp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = tmp;
	}
    }

    /**
     * Sort an array in ascending order using the Selection Sort algorithm
     * @param int[] arr - the array
     */
    
    public static void selectionSort(int[] arr) {
	
	if (arr.length < 2) {
	    return;
	}
	
	int minIndex = 0;
	int minVal = 0;

	for (int j = 0; j < (arr.length-1); j++) {
	    System.out.println("Checking position " + j);
	    printArray(arr);
	    minIndex = j;
	    minVal = arr[j];
	    for(int k = j + 1; k < arr.length; k++) {
		System.out.println("\tComparing " + minVal + " & " + arr[k]);
		if (arr[k] < minVal) {
		    System.out.println("\tSetting minVal to " + arr[k] + " & minIndex to " + k);
		    minVal = arr[k];
		    minIndex = k;
		}
	    }
	    System.out.println(arr[minIndex] + " < " + minVal + "?");
	    System.out.println("Swapping " + j + " - " + minIndex);
	    swap(arr, j, minIndex);
	}

    }

    public static void main(String[] args) {
	
	int[] unsortedArray = { 8, 1, 14, -97, 322, 78, 77, 5 };
	int[] alreadySortedArray = { 0, 9, 14, 18, 19, 21, 29, 1024 };

	int[] oneElementArray = { 2 };
	int[] zeroLengthArray = new int[0];


	System.out.print("Unsorted (before): ");
	printArray(unsortedArray);
	selectionSort(unsortedArray);
	System.out.print("Sorted (after): ");
	printArray(unsortedArray);

	System.out.print("Already sorted (before): ");
	printArray(alreadySortedArray);
	selectionSort(alreadySortedArray);
	System.out.print("Already sorted (after): ");
	printArray(alreadySortedArray);

	System.exit(0);
	
	System.out.print("Unsorted (before): ");
	printArray(oneElementArray);
	selectionSort(oneElementArray);
	System.out.print("Sorted (after): ");
	printArray(oneElementArray);

	System.out.print("Unsorted (before): ");
	printArray(zeroLengthArray);
	selectionSort(zeroLengthArray);
	System.out.print("Sorted (after): ");
	printArray(zeroLengthArray);

    }
}
