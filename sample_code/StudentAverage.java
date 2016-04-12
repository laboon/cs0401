import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number students > ");
	int numStudents = sc.nextInt();

	int currentStudent = 1;
	int grade = 0;
	int total = 0;
	
	while (currentStudent <= numStudents) {
	    System.out.print("Enter grade for student " + currentStudent + " > ");
	    grade = sc.nextInt();
	    if (grade < 0 || grade > 100) {
		// Invalid value!
		System.out.println("Grade has to be between 0 and 100 inclusive.");
	    } else {	
		total += grade;
		currentStudent++;
	    }
	}

	System.out.println("Average is: " + ((float) total / numStudents));
	
    }
    
}
