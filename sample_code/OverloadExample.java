public class OverloadExample {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
       return a + b;
    }

    public static int add(int a) {
	return a;
    }

    public static void main(String[] args) {
	int foo = OverloadExample.add(1, 2);
	int bar = OverloadExample.add(7);
	double baz = OverloadExample.add(17.6, 13.2);
	
	System.out.println("Foo is " + foo);
	System.out.println("Bar is " + bar);
	System.out.println("Baz is " + baz);
    }
}
