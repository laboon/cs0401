import java.util.Scanner;

public class VariableScope {
    
    public static void main(String[] args) {

	boolean moreCustomers = false;

	Scanner sc = new Scanner(System.in);
	
	do {
	    System.out.print("Is there another customer (1=Yes, 2=No)? > ");
	    int foo = sc.nextInt();
	    if (foo == 2) {
		moreCustomers = false;
	    } else if (foo == 1) {
		moreCustomers = true;
	    } else {
		System.out.println("Enter 1 or 2!");
		moreCustomers = true;
	    }
		     
	} while (moreCustomers);
	
    }

    
}
