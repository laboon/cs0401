public class ExitStatus {

    public static void main(String[] args) {
	int statusCode = -1;
	if (args.length < 1) {
	    System.out.println("Enter one argument, either 'success' or 'failure'");
	    statusCode = 2;
	} else if (args[0].equalsIgnoreCase("success")) {
	    statusCode = 0;
	} else if (args[0].equalsIgnoreCase("failure")) {
	    statusCode = 1;
	} else {
	    System.out.println("Unknown argument!");
	    statusCode = 3;
	}

	System.out.println("Exiting with status code " + statusCode);
	System.exit(statusCode);

    }
}
