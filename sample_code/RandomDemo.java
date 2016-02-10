// Be sure to import java.util.Random or java.util.*
import java.util.Random;

public class RandomDemo {
    
    public static void main(String[] args) {

	// First, create a Random Number Generator (RNG).
	// It's actually a pseudorandom number generator - it's
	// difficult for computers to create truly random values
	// since everything they do is deterministic.  However,
	// this will act random enough for our purposes.

	Random rng = new Random();

	// You can now get random integers from the rng using the
	// instance method .nextInt().

	// This, for instance, will give you a random number between
	// 0 and 4 (one less than 5).  Think of it as any number less
	// than the number you input.
	
	int q = rng.nextInt(5);

	// If you need it to be from 1 - whatever instead of 0 - whatever,
	// then you can just add 1.  This will give you a random number
	// from 1 to 5.

	int q2 = rng.nextInt(5) + 1;

	// This can be used just like any other variable.

	System.out.println("Random number results = " + q + " and " + q2);
	
	if (q2 == 1 || q2 == 5) {
	    System.out.println("On the edge!");
	}

	int sortingHat = rng.nextInt(4);
	
	String house = "";
	switch (sortingHat) {
	case 0:
	    house = "Slytherin";
	    break;
	case 1:
	    house = "Hufflepuff";
	    break;
	case 2:
	    house = "Gryffindor";
	    break;
	case 3:
	    house = "Ravenclaw";
	    break;
	}

	System.out.println("You are in house " + house);
	
    }
}
