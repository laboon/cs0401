public class ObjectArray {

    public static void main(String[] args) {
	Monkey[] monkeys = new Monkey[5];

	monkeys[1] = new Monkey();
	monkeys[3] = new Monkey();
	
	for (Monkey m: monkeys) {
	    System.out.println(m);
	    m.makeNoise();
	}
    }
    
}

class Monkey {

    public Monkey() {
	
    }
    
    public void makeNoise() {
	System.out.println("Monkey noise!");
    }

}
