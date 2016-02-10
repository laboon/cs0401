import java.util.Random;

public class Professor {

    // Same as public String _name;
    // public String _name;
    
    String _name;
        
    private String _firstName;

    public String getFirstName() {
	return _firstName;
    }
    
    public Professor(String name, String firstName) {
	_name = name;
	_firstName = firstName;
    }
    
    public int teach() {
	System.out.println("Professor " + _name + " says \"Blah blah blah...\"");
	return 1;
    }

}
