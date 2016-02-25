import java.util.Random;

public class CompSciClass {
    
    public static void main(String[] args) {

	Student[] _students = new Student[10];

	Professor p = new Professor("Laboon", "Bill");
	
	// Won't work - private!
	// System.out.println(p._firstName);

	Random rng = new Random();
	
	for (int j = 0; j < 10; j++) {
	    _students[j] = new Student(p);
	}

	Student yup = new Student();
	yup.learn();

	Student.meow();

	int looloo = 7;
	int pkol = 8;
	String clark = "meow";
	
	Student.tweet(looloo, pkol, clark);
	
	System.exit(0);
	
	boolean keepGoing = true;
	int val = 0;
	
	while (keepGoing) {
	    val = rng.nextInt(100);
	    if (val == 99) {
		keepGoing = false;
	    } else {
		_students[val % 10].learn();
	    }
	}
	for (int j = 0; j < 10; j++) {
	    System.out.print("Student " + j + ": ");
	    System.out.println(_students[j]);
	}
    }
}
