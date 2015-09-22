public class LongIf {

    public static void main(String[] args) {
	int foo = 2;
	// if (foo == 1) {
	//     System.out.println("One");
	// } else if (foo == 2) {
	//     System.out.println("Two");
	// } else if (foo == 3) {
	//     System.out.println("Three");
	// } else {
	//     System.out.println("??");
	// }

	int bar = 1;
	switch (bar) {
	case 1:
	    System.out.println("One");
	    break;
	case 2:
	    System.out.println("Two");
	    break;
	case 3:
	    System.out.println("Three");
	    break;
	case 4: case 5: case 6:
	    System.out.println("WOW THAT IS A BIG NUMBER");
	    break;
	default:
	    System.out.println("??");
	}
	System.out.println("DONE!");
    }
}
    
