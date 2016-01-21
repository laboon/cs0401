public class FormattingDemo {

    /**
     * Good source for printf formatting: http://docs.oracle.com/javase/tutorial/java/data/numberformat.html
     * or http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf
     * Format:
     * % [flags] [width] [.precision] conversion-character 
     */
    
    public static void main(String[] args) {

	// print / println does not give you much control over
	// how things are printed out
	
	int three = 3;

	System.out.println("(int) Three is " + three);

	double threePointOh = 3.000000000;
	
	System.out.println("(double) Three is " + threePointOh);

	double threePointOhOneTwoThree = 3.0123;

	System.out.println("(double) Three point oh one two three is " + threePointOhOneTwoThree);

	// printf does!  Note we use a different format here, embedding
	// how we want a value printed out in the string itself, then
	// passing the value as another parameter to the method

	// Also note that System.out.printf() acts like print, NOT println.
	// It
	// does not put a carriage return after outputting data.
	// You need to manually doing it by including "\n" _in_
	// the string.

	// These specifiers are similar to ones used in other languages
	// like C, C++ and Perl
	
	// Print out a floating point number, use %f. 

	double foo = 10.1;
	
	System.out.printf("Here's a floating point number! %f\n", foo);
	
	// You don't need to pass in a variable, you can pass in a value.

	System.out.printf("Here's another floating point number! %f\n", 99.17);

	// Use %d for integer (decimal - base 10)
	// Remember casting!  You can't do this.  You need to cast first.

	// System.out.printf("Here is foo as an integer! %d\n", foo);
	System.out.printf("Here is foo as an integer! %d\n", (int) foo);
	System.out.printf("Here is another integer! %d\n", 17);

	// Use comma flag for large numbers and integers! Note this does not work with
	// floating point.

	int bigNum = 1000000000;
	int smallNum = 6;
	
	System.out.printf("Bignum with commas is %,d.\n", bigNum);
	System.out.printf("Smallnum with commas is %,d.\n", smallNum);
	
	// You can have more than one variable in a string
	int dogs = 10;
	int cats = 3;
	int snakes = 2;
	System.out.printf("I have %d dogs, %d cats, and %d snakes.\n", dogs, cats, snakes);
	
	System.out.printf("I have %f dogs, %d cats, and %d snakes.\n", (float) dogs, cats, snakes);

	
	// Use %e for exponential notation

	long bar = 99999999999L;

	System.out.printf("Here is bar in exponential notation! %e\n", (float) bar);
	// You can use a string with %s
	
	String iLoveIt = "hot sauce";

	System.out.printf("I love %s!\n", iLoveIt);
	
	// If you need to print a % sign in the string, use %%.
	int percentSure = 99;
	
	System.out.printf("I am %d%% \"sure\" that I love %s!\n", percentSure, iLoveIt);

	// You can add zeros in front of a number to make it a certain
	// size.  Just add a 0 after the % symbol, along with the
	// minimum size to be printed..

	int numBirds = 4;

	System.out.printf("I have %09d birds.\n", numBirds);
	System.out.printf("I have %02d birds.\n", numBirds);

	numBirds = 50000;

	System.out.printf("I have %09d birds.\n", numBirds);

	System.out.printf("I have %02d birds.\n", numBirds);
			
	for (int j = 0; j < 8; j++) {
	    System.out.printf("Agent %03d has died.\n", j);
	}
	
	// Note that if the size of the printed-out value is larger,
	// the zeros are ignored.

	numBirds = 50;
	System.out.printf("I have %03d birds.\n", numBirds);

	numBirds = 500;
	System.out.printf("I have %03d birds.\n", numBirds);

	numBirds = 5000;
	System.out.printf("I have %03d birds.\n", numBirds);
	
	// You can left-justify by including - after the percent sign.
	numBirds = 2;
	System.out.printf("(LEFT) I have %-5d birds.\n", numBirds);

	numBirds = 21;
	System.out.printf("(LEFT) I have %-5d birds.\n", numBirds);

	numBirds = 210;
	System.out.printf("(LEFT) I have %-5d birds.\n", numBirds);

	
	// Or right-justify by including a non-zero int after the percent sign.

	numBirds = 2;
	System.out.printf("(RIGHT) I have %5d birds.\n", numBirds);

	numBirds = 21;
	System.out.printf("(RIGHT) I have %5d birds.\n", numBirds);

	numBirds = 210;
	System.out.printf("(RIGHT) I have %5d birds.\n", numBirds);

	
	numBirds = 999210;
	if (numBirds > 99999) {
	    System.out.printf("(RIGHT) I have -ERR- birds.\n", numBirds);
	} else {
	    System.out.printf("(RIGHT) I have %5d birds.\n", numBirds);
	}

	
	// If you only want to print a certain number of points past
	// the decimal, use .

	double pi = Math.PI;
	double meow = 3.10000;
	System.out.printf("Pi rounded to three decimal places is %.3f\n", pi);
	System.out.printf("Pi rounded to four decimal places is %.4f\n", pi);
	System.out.printf("Meow rounded to eight decimal places is %.8f\n", meow);

	// Mix and match!

	System.out.printf("Pi rounded to four decimal places is %08.4f\n", pi);

	System.out.printf("Pi rounded to three decimal places is %-9.3f", pi);

	System.out.println("END OF LINE HERE!");
    }
    
}
