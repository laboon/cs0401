public class ThisDemo {

    private int quack = 5;

    private int meow = 6;
    
    public ThisDemo() {
	int quack = 200;
	System.out.println("Quack is " + quack);
	System.out.println("this.quack is " + this.quack);
	System.out.println("Meow is " + meow);
	System.out.println("this.meow is " + this.meow);

    }
    
    public static void main(String[] args) {
	new ThisDemo();
    }
    
}
