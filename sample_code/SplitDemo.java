public class SplitDemo {

    public static void main(String[] args) {
        String foo = args[0];
	String delimiter = args[1];
	String[] ricks = foo.split(delimiter);
	for (int j = 0 ; j < ricks.length; j++) {
	    System.out.println(j + ": " + ricks[j]);
	}
	String[] beths = ricks[0].split(args[2]);
	for (int j = 0 ; j < beths.length; j++) {
	    System.out.println("\t" + j + ": " + beths[j]);
	}
	

	
    }
}
