public class IntCircle {

    private int _radius = -1;
    
    public IntCircle(int radius) {
	_radius = radius;
    }

    public double area() {
	return Math.PI * _radius * _radius;
    }

    public double circumference() {
	return Math.PI * 2 * _radius;
    }

    public String toString() {
	return "[ Circle with radius " + _radius + " ]";
    }
    
    public static void main(String[] args) {
	IntCircle ic = new IntCircle(1);
	System.out.println("Should be [ Circle with radius 1 ]");
	System.out.println(ic);
	System.out.println("Should be pi... ");
	System.out.println(ic.area());
	System.out.println("Should be pi * 2... ");
	System.out.println(ic.circumference());
	IntCircle ic2 = new IntCircle(6);
	System.out.println(ic2);
	System.out.println(ic2.area());
	System.out.println(ic2.circumference());


	IntCircle ic3 = new IntCircle(-4);
	System.out.println(ic3);
	System.out.println(ic3.area());
	System.out.println(ic3.circumference());

    }
    
}
