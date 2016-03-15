public class ThisDemo {

    int quack = 5;
    
    public ThisDemo() {
	int quack = 200;
	System.out.println("Quack is " + quack);
	
    }
    
    public static void main(String[] args) {
	new ThisDemo();
    }
    
}
