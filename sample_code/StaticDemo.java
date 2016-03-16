public class StaticDemo {

    public static void main(String[] args) {
	Student s = new Student(888);
	s.answerQuestion();
	s.enroll();

	// System.out.println(Student.peopleSoftNumber);
	// System.out.println(s.peopleSoftNumber);
	
    }
}

class Student {

    private static String school = "Pitt";

    private int peopleSoftNumber = -1;

    public Student(int p) {

	System.out.println(Student.school);
	System.out.println(school);

	
	peopleSoftNumber = p;
    }

    public void answerQuestion() {
	System.out.println("Student " + peopleSoftNumber + " from " + school + " has answered a question!");
    }
    
    public static void enroll() {
	System.out.println("Student " + " from " + school + " has has enrolled!");
    }
    

    
}
