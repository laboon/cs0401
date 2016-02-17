import java.util.*;

public class SequentialSearch {

    // Helper method to print out arrays
    
    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
		System.out.print(arr[j] + ", ");
	}
	
	System.out.println(arr[arr.length - 1] + " ]");

    }

    
    public static void main(String[] args) {
	
	int[] arr = new int[100];

	Random rng = new Random();

	for (int j=0; j<arr.length; j++) {
	    arr[j] = rng.nextInt(100);
	}

	printArray(arr);
	
	// For loop
	
	System.out.println("For search:");
	boolean foundIt = false;
	
	for (int j=0; j < arr.length; j++) {
	    if (arr[j] == 42) {
		System.out.println("FOUND IT AT " + j);
		foundIt = true;
		break;
	    }
	}
	
	if (foundIt == false) {
	    System.out.println("No 42 found =(");
	}

	System.out.println("While search:");
	
	foundIt = false;
	int counter = 0;
	while (!foundIt && counter < arr.length) {
	    if (arr[counter] == 42) {
		System.out.println("FOUND IT AT " + counter);
		foundIt = true;
	    }
	    counter++;
	}

	
	if (foundIt == false) {
	    System.out.println("No 42 found =(");
	}

	// For each loop
	
	System.out.println("For each search:");

	foundIt = false;

	counter = 0;
	
	for (int n : arr) {
	    if (n == 42) {
		System.out.println("FOUND IT AT " + counter);
		foundIt = true;
		break;
	    }
	    counter++;
	}

	if (foundIt == false) {
	    System.out.println("No 42 found =(");
	}

	// Do while loop

	System.out.println("Do while loop:");

	foundIt = false;

	counter = 0;

	if (arr.length > 0) {
	    do {
		if (arr[counter] == 42) {
		    System.out.println("FOUND IT AT " + counter);
		    foundIt = true;
		    break;
		}
		counter++;
	    } while (!foundIt && counter < arr.length);
	}

	if (foundIt == false) {
	    System.out.println("No 42 found =(");
	}
	
	  
    }
    
}
