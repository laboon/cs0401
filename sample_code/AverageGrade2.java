import java.util.Scanner;

public class AverageGrade2 {

    public static void main(String[] args) {

	System.out.print("How many students? > ");
	Scanner sc = new Scanner(System.in);
	int numStudents = sc.nextInt();

	int currentStudent = 1;
	int totalScore = 0;
	
	while (currentStudent <= numStudents) {
	    System.out.print("Enter score of student " + currentStudent + " > ");
	    int score = sc.nextInt();
	    if (score < 0 || score > 100) {
		System.out.println("INVALID!!!");
	    } else {
		totalScore += score;
		currentStudent++;
	    }
	}

	double average = (double) totalScore / numStudents;

	System.out.printf("Class average is %.2f\n", average);
	
    }
    
}
