import java.util.Random;

public class Student {

    // Instance variables
    
    private int _learning = 0;

    private Professor _prof; // = new Professor("Joe", "Schmoe");
    
    public String _level; // = "";

    // Constructors

    public Student() {
	_prof = new Professor("Noogie", "Coogie");
    }
    
    public Student(Professor p) {

    	_prof = p;

    	Random rng = new Random();
    	int val = rng.nextInt(4);
    	if (val == 0) {
    	    _level = "Freshman";
    	} else if (val == 1) {
    	    _level = "Sophomore";
    	} else if (val == 2) {
    	    _level = "Junior";
    	} else {
    	    _level = "Senior";
    	}
    }

    private void breathe() {
	System.out.println("Breathing...");
    }
    
    // Mutator
    
    public void learn() {
	breathe();
    	_learning += _prof.teach();
    }
    
    // Accessor
    
    public int getLearning() {
	return _learning;
    }

    public String toString() {
	return _level + " student with learning " + _learning;
    }
    
}
