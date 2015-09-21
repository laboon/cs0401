/**
 * If you enter a non-integer here, the loop will run forever!
 */

import java.util.Scanner;

public class ScannerInfiniteLoop {
    public static void main(String[] args) {
	boolean noValidInput = true;
	int value = -1;
	Scanner sc = new Scanner(System.in);
	do {
	    System.out.print("Enter an int > ");
	    if (sc.hasNextInt()) {
		value = sc.nextInt();
		noValidInput = false;
	    }
	} while (noValidInput);
	System.out.println(value + " is an integer!");
    }
}
