public class ForDemo {

    public static void main(String[] args) {

	for (int j=0; j < 10; j++) {
	    System.out.println("j is " + j);
	}

	for (int j=0, k=4; (j != 1 && k < 25); j += 3) {
	    System.out.println("j is " + j + " and k is " + k);
	    k += 5;
	}
	
	for (;;) {
	    System.out.println("BILL RULES!!!!");
	}
	
    }

}
