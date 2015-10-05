import java.util.Random;


public class Professor {

    String _name;

    public Professor(String name) {
	_name = name;
    }
    
    public int teach() {
	System.out.println("Professor " + _name + " says \"Blah blah blah...\"");
	return 1;
    }

}
