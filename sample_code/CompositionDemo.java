public class CompositionDemo {


    public static void main(String[] args) {
	//Create a zoo
	Zoo zoo = new Zoo("Laboon Zoo", 7, 3, 2);
	System.out.println(zoo);

	System.out.println("Adding three elephants!");
	zoo.addElephants(3);
	System.out.println(zoo);

	System.out.println("Somebody freed all of the animals!");
	zoo.freeAllTheAnimals();
	System.out.println(zoo);

    }
    
}


class Zoo {
    
    // The larger Zoo class's data consists of four pieces of
    // data - the name of the Zoo (a string), and the number of
    // gorillas, elephants, and giraffes in the zoo (all ints).

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
