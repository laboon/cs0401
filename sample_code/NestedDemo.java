public class NestedDemo {
    
    public static void main(String[] args) {

	int a = 5;
	int b = 4;
	if (a < 10) {
	    if (true) {
		System.out.println("meow!");
	    }
	} else {
	    System.out.println("a is not small!");
	}

	
	boolean student = true;
	boolean ta = false;
	boolean livesInDorms = true;

	if (student) {
	    if (ta) {
		System.out.println("TA! And student!");
	    }
	} else {
	    System.out.println("Not A Student!");
	}
	
	System.out.println("Laboon's Pizza Shop!!!");
	
	if (student == true) {
	    if (ta == true) {
		System.out.println("20% discount!");
	    } else {
		System.out.println("10% discount!");
	    }
	} else {
	    if (livesInDorms == true) {
		System.out.println("No discount!");
		if (ta == true) {
		    System.out.println("But you're not a student???");
		    if (6 < 7) {
			System.out.println("Tautology");
		    }
		}
	    } else {
		if (5 < 3) {
		    System.out.println("blar2!");
		} else {
		    System.out.println("blar!");
		}
		System.out.println("Congrats for not living in a dorm! 90% discount!");
	    }
	}
	
    }
}
