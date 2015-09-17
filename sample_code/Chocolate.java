import java.util.Scanner;

public class Chocolate {

    public static void main(String[] args) {

	int numGrades = 0;
	int runningTotal = 0;

	boolean enterMoreGrades = true;

	Scanner sc = new Scanner(System.in);
	
	do {
	    System.out.print("Enter a grade > ");
	    int oneGrade = sc.nextInt();

	    if (oneGrade == -1) {
		enterMoreGrades = false;
	    } else {
		if (oneGrade >= 0 && oneGrade <= 100) {
		    runningTotal += oneGrade;
		    numGrades++;
		} else {
		    System.out.println("OUT OF RANGE");
		}
	    }
	    
	} while (enterMoreGrades);

	double classAverage = (double) runningTotal / (double) numGrades;
	System.out.println("Class average is: " + classAverage);
	
    }
    
}
