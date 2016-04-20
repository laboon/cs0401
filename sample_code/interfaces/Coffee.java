public class Coffee extends Drink implements Sippable, Squirtable {

    // Note - no drink method, but extends from Drink() so will
    // use that method by default
    
    public void sip() {
	// This won't work - can't modify final variables, i.e.
	// any variable in the interface
	// _sips++;
	System.out.println("Sipping COFFEE");
    }

    // public void noisySip() {
    // 	System.out.println("Sipping COFFEE, noise level = " + SIPPING_NOISE);
    // }

    public void squirt() {	
	System.out.println("Squirting COFFEE (that's kind of disturbing)");
    }
    
}
