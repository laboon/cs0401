public class CompositionDemo {


    public static void main(String[] args) {

	// Note that in this class, I have no idea how
	// Zoo is constructed.  I just use it.
	
	//Create a zoo
	Zoo zoo = new Zoo("Laboon Zoo", 7, 3, 2);
	System.out.println(zoo);

	System.out.println("Adding three elephants!");
	zoo.addElephants(3);
	System.out.println(zoo);

	System.out.println("Go clean out the elephant stables!");
	zoo.work();
	System.out.println(zoo);
	
	System.out.println("Somebody freed all of the animals!");
	zoo.freeAllTheAnimals();
	System.out.println(zoo);

    }
    
}


class Zoo {
    
    // The larger Zoo class's data consists of five pieces of
    // data - the name of the Zoo (a string), and the number of
    // gorillas, elephants, and giraffes in the zoo (all ints),
    // an an array of Strings, indicating employees.

    private Employee[] _employees = new Employee[4];

    private String _name = "";
    
    private int _numGorillas = 0;

    private int _numElephants = 0;

    private int _numGiraffes = 0;

    // Constructor
    
    public Zoo(String name, int gorillas, int elephants, int giraffes) {
	_name = name;
	_numGorillas = gorillas;
	_numElephants = elephants;
	_numGiraffes = giraffes;

	// Set employees

	_employees[0] = new Employee("John Smith");
	_employees[1] = new Employee("Jane Jones");
	_employees[2] = new Employee("Janet Lee");
	_employees[3] = new Employee("Joe Jackson");
	
    }

    // Make all of the employees work
    
    public void work() {
	for (Employee e: _employees) {
	    e.work();
	}
    }
	    
	    
    // Mutators - modify the number of elephants, giraffes, or
    // gorillas
    
    public void addElephants(int e) {
	_numElephants += e;
    }

    public void addGiraffes(int e) {
	_numGiraffes += e;
    }

    public void addGorillas(int e) {
	_numGorillas += e;
    }

    // Modifies multiple instance vars - still a mutator!
    
    public void freeAllTheAnimals() {
	_numElephants = 0;
	_numGiraffes = 0;
	_numGorillas = 0;
    }

    // Special toString() method

    public String toString() {
	return _name + ": [ " + _numGorillas + " gorillas, "
	    + _numElephants + " elephants, and "
	    + _numGiraffes + " giraffes ]";
    }

}


class Employee {
    String _name = "";

    public Employee(String name) {
	_name = name;
    }

    public void work() {
	System.out.println(_name + " is working!");
    }
}
