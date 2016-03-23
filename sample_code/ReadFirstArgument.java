public class ReadFirstArgument {

    public static void main(String[] args) {
	if (args.length > 0) {
	    System.out.println("First arg is: " + args[0]);
	} else {
	    System.out.println("No args given!");
	}
    }
}
