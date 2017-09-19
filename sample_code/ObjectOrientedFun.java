import java.util.*;



class Bread {

    // Static variables / methods are associated with a CLASS
    // Instance (non-static) variables / methods are associated with an OBJECT
    
    public static int pumpernickel = 0;

    public int sourdough = 0;

    public Store s;

    public Bread() {
	s = new Store();
    }

    public Bread(Store s) {
	this.s = s;
    }

    public Bread(Bread b) {
	this.sourdough = b.sourdough;
	this.s = b.s;
    }
    
    public String toString() {
	return "Pumpernickel: " + pumpernickel + " / Sourdough: " + sourdough;
    }

    public void updateBread(int pumpernickel, int sourdough) {
	this.pumpernickel = pumpernickel;
	this.sourdough = sourdough;
    }

    // public Bread shallowCopy() {
    // }

    // public Bread deepCopy() {
    // }
		
}


class ObjectOrientedFun {

    public static void main(String[] args) {

	// We have two Bread objects, and we increment pumpernickel and sourdough
	// on each one

	Bread b1 = new Bread();
	Bread b2 = new Bread();

	b1.pumpernickel++;
	b2.pumpernickel++;

	b1.sourdough++;
	b2.sourdough++;

	System.out.println("Bread 1\n" + b1.toString());
	System.out.println("Bread 2\n" + b2.toString());

	// Update the number of loaves of sourdough and pumpernickel

	System.out.println("\nBREAD TRUCK COMING YAY\n");
	b1.updateBread(17, 19);
	System.out.println(b1.toString());
	System.out.println(b2.toString());
	
	// Now let's make some bread with different stores

	Store s1 = new Store();
	Bread b3 = new Bread(s1);

	Store s2 = new Store();
	Bread b4 = new Bread(s2);

	System.out.println("b3 store = " + b3.s.toString());
	System.out.println("b4 store = " + b4.s.toString());

	Bread b5 = b4;

	b5.s.address = "999 Nine Road";

	System.out.println("b4 store = " + b4.s.toString());

	Bread b6 = new Bread(b4);
	b6.sourdough = 209;
	
	System.out.println("B4 = " + b4.toString());
	System.out.println("B6 = " + b6.toString());
	

    }
    
}

class Store {

    public String name;
    public String address;

    private String generateRandomName() {
	Random rng = new Random();
	int r = rng.nextInt(10);
	switch (r) {
	case 0:
	    return new String("Jane's Bread Shop");
	case 1:
	    return new String("Loafin' Around");
	case 2:
	    return new String("Archers of Loaf");
	case 3:
	    return new String("Makin' Dough");
	case 4:
	    return new String("Lawrenceville Doughboy");
	case 5:
	    return new String("Dough Ray Me");
	case 6:
	    return new String("Bread Store #293");
	case 7:
	    return new String("Bread Is Good");
	case 8:
	    return new String("Carbohydrate City");
	default:
	    return new String("Bread-O-Rama");
	}
    }

    private String generateRandomAddress() {
	Random rng = new Random();
	int num = rng.nextInt(1000);
	String street;
	switch (rng.nextInt(9)) {
	case 0:
	    street = "Ragnarok St.";
	    break;
	case 1:
	    street = "Valhalla Lane";
	    break;
	case 2:
	    street = "Glumglum Ave.";
	    break;
	case 3:
	    street = "Drury Lane";
	    break;
	case 4:
	    street = "Boulevard of the Gumpdrops";
	    break;
	case 5:
	    street = "Chair St.";
	    break;
	case 6:
	    street = "Oppenheimer Road";
	    break;
	case 7:
	    street = "Fake St.";
	    break;
	case 8:
	    street = "Asphalt St.";
	    break;
	default:
	    street = "Seed Highway";	    
	}
	return new String(num + " " + street);
    }

    
    public Store() {
	this.name = generateRandomName();
	this.address = generateRandomAddress();
    }

    public String toString() {
	return this.name + ": " + this.address;
    }
	
}

