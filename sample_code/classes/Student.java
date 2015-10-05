import java.util.Random;

public class Student {

    private int _learning = 0;

    private Professor _prof;
    
    public String _level = "";
    
    public Student(Professor p) {

	_prof = p;
	
	Random rng = new Random();
	int val = rng.nextInt(4);
	if (val == 0) {
	    _level = "Freshman";
	} else if (val == 1) {
	    _level = "Sophomore";
	} else if (val == 1) {
	    _level = "Junior";
	} else {
	    _level = "Senior";
	}
    }

    public void learn() {
	_learning += _prof.teach();
    }

    public int getLearning() {
	return _learning;
    }
    
}
