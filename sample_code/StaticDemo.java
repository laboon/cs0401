public class StaticDemo {

    public static void main(String[] args) {
	Student s = new Student(888);
	s.answerQuestion();
	s.enroll();

	// System.out.println(Student.peopleSoftNumber);
	// System.out.println(s.peopleSoftNumber);
	// System.out.println(Student.school);
	// System.out.println(school);

	Student[] students = new Student[20];
	
	for (int j = 0; j < 20; j++) {
	    students[j] = new Student();
	    System.out.println(students[j].peopleSoftNumber);
	}

	
	
	
    }
}

class Student {

    public static String school = "Pitt";

    public static int peopleSoftCounter = 0;
    
    public int peopleSoftNumber = -1;

    public Student(int p) {

	peopleSoftNumber = p;
    }

    public Student() {
	peopleSoftNumber = ++peopleSoftCounter;
    }

    public void answerQuestion() {
	System.out.println("Student " + peopleSoftNumber + " from " + school + " has answered a question!");
    }
    
    public static void enroll() {
	System.out.println("Student " + " from " + school + " has has enrolled!");
    }
    

    
}
