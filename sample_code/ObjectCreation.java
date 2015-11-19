public class ObjectCreation {
    public static void main(String[] args) {

	// Make 5 new objects - they are 
	// thrown away at the end of the block
	// and eventually garbage collected

	System.out.println("5 different objects:");
	for (int j=0; j < 5; j++) {
	    Object o = new Object();
	    System.out.println(o);
	}

	// Make 1 object and reuse it
	System.out.println("5 references to same object:");
	Object o2 = new Object();

	for (int j=0; j < 5; j++) {
	    Object oRef = o2; 
	    System.out.println(oRef);
	}
	
	
    }
}
