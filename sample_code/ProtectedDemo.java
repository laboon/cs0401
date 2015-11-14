
public class ProtectedDemo {

    public static void main(String[] args) {
	Dishwasher d = new Dishwasher();
	Waiter w = new Waiter();
	Employee e = new Employee();
	Manager m = new Manager();

	// As we all know, you can't access private variables.  This won't compile.
	// System.out.println("Employee has a company car: " + e._hasCompanyCar);

	// We can get around that with accessors (public methods that get the state
	// of private variables).
	
	System.out.println("Employee has a company car: " + e.getHasCompanyCar());
	
	// There is another kind of "private" variable modifier, protected
	
	// This won't compile - outside of subclasses, protected acts just like private
	// System.out.println("The salary for a dishwasher is: " + d._salary);

	System.out.println("Manager has a company car: " + m.getHasCompanyCar());

    }

	    
    
}

class Employee {

    protected int _salary = 0;

    private boolean _hasCompanyCar = true;

    public boolean getHasCompanyCar() {
	return _hasCompanyCar;
    }

}

class Manager extends Employee {

    public Manager() {
	// Can't access - private to Employee!
	// _hasCompanyCar = false;

	// CAN access - protected means ONLY subclasses can see it
	_salary = 50000;
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
	_salary = 35000;
    }

    
}
