public class SwitchDemo {

    public static void main(String[] args) {
	int x = 3;

	switch (x) {
	case 1:
	    System.out.println("Tiny!");
	case 2:
	    System.out.println("Small!");
	case 3:
	    System.out.println("Medium!");
	case 4:
	    System.out.println("Grande!");
	case 5:
	    System.out.println("Venti!");
	case 6:
	    System.out.println("Trenti (dunno)!");
	default:
	    System.out.println("???");
	}

	System.exit(0);
       
	switch (x) {
	case 1:
	    System.out.println("It's-a 1");
	    break;
	case 2:
	    System.out.println("It's-a 2");
	    break;
	case 3:
	    System.out.println("It's-a 3");
	    break;
	case 4:
	case 5:
	case 6:
	    System.out.println("It's-a big number!");
	    break;
	default:
	    System.out.println("I dunno");
	}

	String sandwich = "Pastrami";
	
	switch (sandwich) {
	case "Vegemite":
	case "PeanutButter":
	    System.out.println("That's vegan!");
	    break;
	case "Pastrami":
	case "Salami":
	case "Ham":
	    System.out.println("Not vegan!");
	    break;
	default:
	    System.out.println("Delish");
	}
	
    }
	   

}
