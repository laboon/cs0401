import java.util.Random;

public class CompSciClass {
    
    public static void main(String[] args) {

	Student[] _students = new Student[10];

	Professor p = new Professor("Laboon");
	
	Random rng = new Random();
	
	for (int j = 0; j < 10; j++) {
	    _students[j] = new Student(p);
	}

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
	    System.out.println("Student " + j + " learned " + _students[j].getLearning() + " units of knowledge!");
	}
    }
}
