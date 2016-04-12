public class DogStuff {

    public static void main(String[] args) {
        Dog d = new Dog();
	Chihuahua c = new Chihuahua();

	// Can call bark!
	System.out.println("Dog:");
	d.bark();
	d.run(20);
	// d.run();
	// d.yip();

	System.out.println("Chihuahua:");
	c.bark();
	c.yip();
	c.run(20);
	c.run((float) 20.0);
	c.run();
	c.sniff((int) 17);
	c.sleep((int) 5);
	
	
    }
}

class Dog extends Object {
    public void bark() {
	System.out.println("Bark!");
    }
    // Cannot call yip on this!

    public void run(int speed) {
	System.out.println("Running at speed " + speed);
    }

    public void sniff(double smellLevel) {
	System.out.println("Smelled something level " + smellLevel);
    }
}

class Chihuahua extends Dog {
    public void yip() {
	System.out.println("Yip yip yip!");
    }

    public void sniff(double smellLevel) {
	System.out.println("Chihuahua smelled " + smellLevel);
    }

    public void sleep(float f) {
	System.out.println("Sleeping for (float) " + f + " minutes!");
    }

    public void sleep(double d) {
	System.out.println("Sleeping for (double) " + d + " minutes!");
    }

    
    public void run(float speed) {
	System.out.println("Running at float " + speed);
    }
    
    public void run(int speed) {
	System.out.println("pant, pant... I'm too tired =(");
    }

    public void run() {
	System.out.println("LOL I'm really really tired =(");
    }
    // Can call bark on this!
}
