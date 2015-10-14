import java.util.*;
import java.io.*;

public class ArrayResize {

    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	System.out.println(arr[arr.length - 1] + " ]");
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


    public static int[] resizeWithInvalidValues(int[] oldArray) {
	int oldLength = oldArray.length;
	int newLength = oldLength * 2;
	int [] toReturn = new int[newLength];
	
	for (int j = 0; j < oldLength; j++) {
	    toReturn[j] = oldArray[j];
	}

	for (int j = oldLength; j < newLength; j++) {
	    toReturn[j] = Integer.MIN_VALUE;
	}
	
	return toReturn;

    }


    public static int[] dynamicResize(int[] oldArray, int newLength) {
	int oldLength = oldArray.length;
	int[] toReturn = new int[newLength];
	
	for (int j = 0; j < oldLength; j++) {
	    if (j < newLength) {
		toReturn[j] = oldArray[j];
	    }
	}
	
	return toReturn;
    }
	
    
    public static void main(String[] args) {
	int[] firstArray = { 1 , 2, 3 };
	printArray(firstArray);

	System.out.println("----------------------");
	System.out.println("Plain resizing:");
	
	int[] secondArray = resize(firstArray);
	printArray(secondArray);

	System.out.println("----------------------");
	System.out.println("Resize again:");
	
	int[] thirdArray = resize(secondArray);
	printArray(thirdArray);
	
	System.out.println("----------------------");
	System.out.println("Resized with 'invalid' values:");

	int[] fourthArray = resizeWithInvalidValues(firstArray);
	printArray(fourthArray);

	System.out.println("----------------------");
	System.out.println("Dynamic resize:");
	
	int[] fifthArray = dynamicResize(firstArray, 11);
	printArray(fifthArray);

	System.out.println("----------------------");
	System.out.println("Dynamic resize down - WARNING!:");
	
	int[] sixthArray = dynamicResize(fifthArray, 2);
	printArray(sixthArray);


	
	
    }
    
}
