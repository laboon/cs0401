
public class ProtectedDemo {

    public static void main(String[] args) {

	Employee e = new Employee();
	
	Dishwasher d = new Dishwasher();
	Waiter w = new Waiter();
	Manager m = new Manager();

	// As we all know, you can't access private variables.  This won't compile.
	// System.out.println("Employee has a company car: " + e._hasCompanyCar);

	// We can get around that with accessors (public methods that get the state
	// of private variables).
	
	System.out.println("Employee has a company car: " + e.getHasCompanyCar());
	
	// There is another kind of "private" variable modifier, protected
	
	System.out.println("The salary for a dishwasher is: " + d._salary);

	System.out.println("Manager has a company car: " + m.getHasCompanyCar());

	

    }

	    
    
}

class Employee {

    protected int _salary = 0;
    // private int _salary = 0;

    private boolean _hasCompanyCar = true;

    public boolean getHasCompanyCar() {
	return _hasCompanyCar;
    }

    protected void cat() {
	System.out.println("Cat cat cat!");
    }

}

class Manager extends Employee {

    public Manager() {
	// Can't access - private to Employee!
	// _hasCompanyCar = false;

	// CAN access - protected means ONLY subclasses can see it
	_salary = 50000;

	// cat();
    }
    
}

class Staff extends Manager {

    public Staff() {
	_salary = 30000;
    }

    
}

class Waiter extends Staff {

    public Waiter() {
	_salary = 35000;
    }

    
}

class Dishwasher extends Staff {

    public Dishwasher() {
	_salary = 25000;
    }

    
}
