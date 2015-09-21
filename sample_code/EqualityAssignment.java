public class EqualityAssignment {

    public static void main(String[] args) {
	int j = 1;
	// The following conditional causes this error:
	// EqualityAssignment.java:5: error: incompatible types: int cannot be converted to boolean
	// if (j = 1) {
	//     System.out.println("j is one!");
	// }

	// Do this instead
	if (j == 1) {
	    System.out.println("j is one!");
	}
	
    }

}
