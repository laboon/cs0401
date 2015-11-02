public class FinalDemo {

    // "final" is an additional keyword that indicates a variable can only
    // be set once.  It is often used to indicate constants.

    // Constant values in Java are usually in ALL CAPS by convention.
    // This is not NECESSARY, but a good idea.
    
    public static final int QUARTS_PER_GALLON = 4;

    public static final int TEASPOONS_PER_TABLESPOON = 3;
    
    public static void main(String[] args) {

	// These will be a compile-time errors - they have already been set
	// QUARTS_PER_GALLON = 9;
	// TEASPOONS_PER_TABLESPOON = 400;

	System.out.println("5 Gallons = " + (QUARTS_PER_GALLON * 5) + " Quarts");
	System.out.println("5 Tablespoons = " + (TEASPOONS_PER_TABLESPOON * 5) + " Teaspoons");
	
    }
    
}
