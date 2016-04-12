public class IntCircle2 {

    // Instance variable
    
    private int _radius = -1;

    // Constructor
    
    public IntCircle2(int radius) {
	_radius = radius;
    }

    // Accessors (3)
    
    public double area() {
	return Math.PI * _radius * _radius;
    }

    public double circumference() {
	return Math.PI * (_radius * 2);
    }

    public String toString() {
	return "[ Circle of Radius " + _radius + " ]";
    }

    // Mutator
    
    public void setRadius(int radius) {
	_radius = radius;
    }

    // Mutator + Accessor

    public double laboonify(int laboonFactor) {
	_radius *= laboonFactor;
	_radius--;
	return _radius * 3;
    }

    public static void main(String[] args) {
	System.out.println("Make new IntCircle2, radius = 1...");
	IntCircle2 ic2 = new IntCircle2(1);
	System.out.println("\tArea = " + ic2.area());
	System.out.println("\tCirc = " + ic2.circumference());
	System.out.println("\tString = " + ic2.toString());

	System.out.println("Make new IntCircle2, radius = 14...");
	IntCircle2 ic3 = new IntCircle2(14);
	System.out.println("\tArea = " + ic3.area());
	System.out.println("\tCirc = " + ic3.circumference());
	System.out.println("\tString = " + ic3);

	System.out.println("Changing ic3 radius from 14 to 21");
	ic3.setRadius(21);
	System.out.println("\tArea = " + ic3.area());
	System.out.println("\tCirc = " + ic3.circumference());
	System.out.println("\tString = " + ic3);

	System.out.println("LABOONIFY BY 8");
	System.out.println("\tLaboonified = " + ic3.laboonify(8));
	System.out.println("\tArea = " + ic3.area());
	System.out.println("\tCirc = " + ic3.circumference());
	System.out.println("\tString = " + ic3);
	
	

    }

}
