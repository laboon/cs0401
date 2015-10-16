import java.io.*;
import java.util.*;

public class ArrayCapacity {

    public static void printArray(int[] arr, int numItems) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    if (j >= numItems) {
		System.out.print("***, ");
	    } else {
		System.out.print(arr[j] + ", ");
	    }
	}
	
	if ((arr.length -1) >= numItems) {
	    System.out.println("*** ]");
	} else {
	    System.out.println(arr[arr.length - 1] + " ]");
	}
    }

    public static void printLogicalArray(int[] arr, int numItems) {

	if (numItems == 0) {
	    System.out.println("[ ] ");
	    return;
	}
	
	System.out.print("[ ");
	for (int j=0; j < (numItems - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	
	System.out.println(arr[numItems - 1] + " ]");

    }

    public static int[] resize(int[] oldArray) {
	int oldLength = oldArray.length;
	int newLength = oldLength * 2;
	int [] toReturn = new int[newLength];
	
	for (int j = 0; j < oldLength; j++) {
	    toReturn[j] = oldArray[j];
	}
	
	return toReturn;
    }

    
    public static void main(String[] args) {

	boolean keepGoing = true;
	Scanner sc = new Scanner(System.in);
	int capacity = 3;
	int numItems = 0;
	int item = 0;
	int[] arr = new int[capacity];
	
	do {
	    
	    System.out.println("Number of items = " + numItems);
	    System.out.println("Size of array = " + arr.length);
	    System.out.println("Logical > ");
	    printLogicalArray(arr, numItems);
	    System.out.println("Actual > ");
	    printArray(arr, numItems);
	    System.out.print("Enter a non-negative integer, negative to quit > ");
	    item = sc.nextInt();
	    if (item < 0) {
		System.exit(0);
	    } else {
		arr[numItems] = item;
		
		numItems++;
		if (numItems == arr.length) {
		    arr = resize(arr);
		}
	    }		    
	} while (true);
    }
}
