public class InnerClassDemo {

    private int _food = 7;

    public InnerClassDemo() {
	InnerCat ic = new InnerCat();
	ic.meow = 4;
    }
    
    public static void main(String[] args) {
	new InnerClassDemo();
    }

    class InnerCat {

	public int meow = 0;
	
	public InnerCat() {
	    System.out.println(_food);
	}
	
    }

}

class OuterCat {

    public OuterCat() {
	InnerCat ic = new InnerCat();
    }
    
}



