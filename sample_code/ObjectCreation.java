public class ObjectCreation {
    
    public static void main(String[] args) {

	// Make 5 new objects - they are 
	// thrown away at the end of the block
	// and eventually garbage collected

	System.out.println("5 different objects:");
	for (int j=0; j < 5; j++) {
	    Object o = new Object();
	    System.out.println(o);
	}
	
	// Make 1 object and reuse it
	System.out.println("5 references to same object:");
	Object o2 = new Object();

	for (int j=0; j < 5; j++) {
	    Object oRef = o2;
	    Object oRef2 = oRef;
	    Object oRef3 = o2;
	    System.out.println(oRef);
	}
	
	// Create three Student objects
	Student s1 = new Student("Geraldine Ferraro", 9001);
	Student s2 = new Student("Bob Dole", 2009);
	Student s3 = new Student("George McGovern", 1182);

	// Create a Student reference, but it is not pointing to
	// an object!
	
	Student s4;
	
	// Get and set the name
	// Accessors and mutators are often called getters and
	// setters because of this!
	
	System.out.println("Student 1's name is " + s1.getName());
	
	s1.setName("Jeanette Rankin");

	System.out.println("Now student 1's name is " + s1.getName());

	
	s2.setName("Bob Dole II");
	
	// Remove reference to the Bob Dole object - nothing is
	// pointing to that object anymore!  Eventually it will just
	// go away
	s2 = null;

	// s2.setName("Bob Dole III");
	
	// Will crash with a NullPointerException!
	
	// s2.getName();

	s2 = s3;

	// Now both s2 and s3 point to the George McGovern object

	System.out.println(s2.getName());
	System.out.println(s3.getName());
	
	
	// Ready for some magic?  println will automatically
	// call the .toString method of an object when printing it
	// out!
	System.out.println(s1);
	
	
    }
}

// Note that only one class in a file can be PUBLIC -
// this class is ONLY accessible to other classes in the SAME FILE

class Student {

    String _studentName = "";
    
    int _id = -1;

    // Constructor - how the class is created
    
    public Student(String studentName, int id) {
	_studentName = studentName;
	_id = id;
    }

    // Note that none of these are static!  They are
    // associated with the OBJECT, not the class!
    
    // Accessors - accesses and returns data
    
    public String getName() {
	return _studentName;
    }

    // Another accessor
    
    public int getId() {
	return _id;
    }

    // Mutator - modifies the state of the object

    public void setName(String newName) {
	_studentName = newName;
    }

    // toString method - very common method on Java objects
    // which returns a String representation of an object
    
    public String toString() {
	return "[ " + _studentName + " ID: " + _id + " ]";
    }
    
}
