import java.util.*;

public class Lab08 {

    public static void main(String[] args) {

	World w = new World();
	Scientist s = new Scientist(w);
	Scanner sc = new Scanner(System.in);
	
	boolean explore = true;
	int dimension = 0;
	int numUnits = 0;
	int[] val;
	
        while (explore) {
	    System.out.print("Enter dimension to travel (1,2,3,4,5) (negative to quit) > ");
	    dimension = sc.nextInt();
	    if (dimension < 0) {
		explore = false;
	    } else {
		System.out.print("Enter units to travel (negative for backwards) > ");
		numUnits = sc.nextInt();
		val = s.move(dimension, numUnits);
		System.out.println("Location: ["
				   + val[0] + " "
				   + val[1] + " "
				   + val[2] + " "
				   + val[3] + " "
				   + val[4] + "]"
				   + " = " + World.getColor(val[5]));
	    }
	}

	System.out.println("The scientist gives up on the quest for understanding.");
    }
    
}
