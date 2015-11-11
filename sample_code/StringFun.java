import java.util.Scanner;

public class StringFun {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string and have FUN > ");
	String s = sc.nextLine().trim();

	// .trim()
	System.out.println("I chopped all of the front and back whitespace for you!  Your string is now: \"" + s + "\"");

	// .length()
	System.out.println("Your string is " + s.length() + " characters!");
	
	// .charAt()
	try {
	    System.out.println("The third character is " + s.charAt(2));
	} catch (IndexOutOfBoundsException ex) {
	    System.out.println("Not a lot of characters there, eh chief?");
	}
	
	// .toLowerCase()
	System.out.println("In all lowercase, your string is : " + s.toLowerCase());

	// .toUpperCase()
	System.out.println("In all uppercase, your string is : " + s.toUpperCase());

	System.out.println("S is still " + s);
	
	// .substring
	System.out.println("The first four characters of your string are : " + s.substring(0,4));
	System.out.println("The third through last characters of your string are : " + s.substring(2));
	System.out.println("The second through fourth characters of your string are : " + s.substring(1,4));

	
	// .replace
	System.out.println("Your string with all E's turned to 3s is: " + s.replace('E', '3')); // note chars, not strings
	System.out.println("Your string with all E's and e's turned to 3s is: " + s.replace('E', '3').replace('e', '3'));


	System.out.println("Your string l337ified is: " + s.toUpperCase().replace('A', '4').replace('E', '3').replace('T', '7').replace('4', '@').replace('S', '$').replace('O', '0'));

	// .indexOf
	System.out.println("Location of first o is (-1 if none): " + s.indexOf('o'));

	System.out.println("Location of first cat is (-1 if none): " + s.indexOf("cat"));
	
	// .lastIndexOf
	System.out.println("Location of last o is (-1 if none): " + s.lastIndexOf('o'));

	// .split
	String[] ss = s.split(" ");
	System.out.println("There are this many tokens separated by spaces: " + s.split(" ").length);
	System.out.println("Tokens:");
	for (String foo : ss) {
	    System.out.println("\"" + foo + "\"");
	}
	
    }
}
	

