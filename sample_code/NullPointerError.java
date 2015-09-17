public class NullPointerError {
    public static void main(String[] args) {
	String oneILove = null;
	oneILove = oneILove.toUpperCase();
	System.out.printf("This one goes out to the one I love, " + oneILove);
    }
}
