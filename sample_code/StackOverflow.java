public class StackOverflow {

    private static int numTimes = 0;
    
    public static void crash() {
	numTimes++;
	System.out.println("Called crash " + numTimes + " times ");
	crash();
    }
    
    public static void main(String[] args) {
        crash();
    }
}
