import java.util.*;

public class SequentialSearch {

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


	
	
    }
    
}
