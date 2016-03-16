import java.util.Scanner;

public class MovieRater {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("So, what did you think of the movie? (1 - 4) > " );
	int numStars = sc.nextInt();

	for (int j = 0; j < 50; j++) {
	    System.out.print("*");

	    // break;
	}
	System.out.println();
	
	switch (numStars) {
	case 1:
	    System.out.println("Wow, worse than The Phantom Menace");
	    break;
	case 2:
	    System.out.println("Slightly better than The Phantom Menace");
	    break;

	case 3:
	    System.out.println("On par with Return of the Jedi");
	    break;

	case 4:
	    System.out.println("It's another The Empire Strikes Back!");
	    break;

	default:
	    System.out.println("LOL WUT");
	}
    }
    
}
