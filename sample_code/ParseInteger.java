import java.util.*;

public class ParseInteger {

    // Accept a string, and parse it to an integer.
    
    public static int parse(String s) {
	int toReturn = 0;
	int power = 0;
	int placeholder = 0;
	int intEquiv = 0;
	// Follow the formula:
	// Starting at furthest right character, read in character
	// as an int, and subtract 48 from it to get its int equivalent
	// (since 48 = ASCII for "0").
	// Multiply by successive powers of 10 - (10^0 = 1 for first column,
	// 10^1 = 10 for the second, 10^2 = 100 for the third, etc.)
	// Continually add to toReturn
	for (int j = s.length() - 1; j >= 0; j--) {
	    intEquiv = ((int) s.charAt(j) - 48);
	    placeholder = ((int) Math.pow(10, power++))
		* intEquiv;
	    toReturn += placeholder;
	}
	return toReturn;
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a positive integer > ");
	String s = sc.nextLine().trim();
	int x = parse(s);
	System.out.println("That integer plus one is " + (x + 1) + "!");
    }
    
}
