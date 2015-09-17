import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args) {

	boolean moreStudents = true;

	Scanner sc = new Scanner(System.in);

	int sumOfGrades = 0;
	int numStudents = 0;
	
	double classAverage = -1.0;

        int j = 0;
	
	while (j < 10) {
	    System.out.println("j is " + j);
	    j++;
	}
	
	while (moreStudents) {
	    System.out.print("Enter a grade (-1 to quit) > ");
	    int oneGrade = sc.nextInt();
	    if (oneGrade == -1) {
		moreStudents = false;
	    } else {
		if (oneGrade >=0 && oneGrade <= 100) {
		    numStudents++;
		    sumOfGrades += oneGrade;
		} else {
		    System.out.println("ENTER A NUMBER FROM 0 TO 100!!!!");
		}
	    }
	}

	classAverage = (double) sumOfGrades / (double) numStudents;
	System.out.println("Class average is " + classAverage);
	
    }

}
