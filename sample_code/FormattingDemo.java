public class FormattingDemo {

    public static void main(String[] args) {

	// print / println does not give you much control over
	// how things are printed out
	
	int three = 3;
	
	System.out.println("(int) Three is " + three);

	double threePointOh = 3.0;
	
	System.out.println("(double) Three is " + threePointOh);

	double threePointOhOneTwoThree = 3.0123;

	System.out.println("(double) Three point oh one two three is " + threePointOhOneTwoThree);

	// printf does!  Note we use a different format here, embedding
	// how we want a value printed out in the string itself, then
	// passing the value as another parameter to the method

	// Also note that System.out.printf() acts like println.  It
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

	// You can have more than one variable in a string
	int dogs = 10;
	int cats = 3;
	int snakes = 2;
	System.out.printf("I have %d dogs, %d cats, and %d snakes.\n", dogs, cats, snakes);
	
	// Use %e for exponential notation

	double bar = 999999999.0;

	System.out.printf("Here is bar in exponential notation! %e\n", bar);
	
	// You can use a string with %s
	
	String iLoveIt = "hot sauce";

	System.out.printf("I love %s!\n", iLoveIt);

	// If you need to print a % sign in the string, use %%.
	int percentSure = 99;
	
	System.out.printf("I am %d%% sure that I love %s!\n", percentSure, iLoveIt);
	
	// You can add zeros in front of a number to make it a certain
	// size.  Just add a 0 after the % symbol, along with the
	// minimum size to be printed..

	int numBirds = 4;

	System.out.printf("I have %03d birds.\n", numBirds);

	// Note that if the size of the printed-out value is larger,
	// the zeros are ignored.

	numBirds = 5000;
	System.out.printf("I have %03d birds.\n", numBirds);

	// You can left-justify by including - after the percent sign.
	numBirds = 2;
	System.out.printf("I have %-5d birds.\n", numBirds);

	// Or right-justify by including a non-zero int after the percent sign.

	numBirds = 2;
	System.out.printf("I have %5d birds.\n", numBirds);
	
	// If you only want to print a certain number of points past
	// the decimal, use .

	double pi = Math.PI;
	System.out.printf("Pi rounded to three decimal places is %.3f\n", pi);
	
    }
    
}
