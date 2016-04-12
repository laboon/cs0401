import java.util.*;
import java.io.*;

public class ExceptionDemo {

    public ExceptionDemo() {

	try {
	    File f = new File("poo");
    	    Scanner sc = new Scanner(f);
	    String a;
    	    while (true) {
   		a = sc.nextLine();
    	    }

	} catch (Exception ioex) {
	    System.out.println(ioex.toString());
	}
	
	try {
	    PrintWriter out = new PrintWriter("");
	    out.println("meow");
	    out.close();
	} catch (FileNotFoundException ioex) {
	    System.out.println(ioex.toString());
	}

	try {
	    Object[] foo = new String[3];
	    foo[1] = new Integer(5);
	} catch (ArrayStoreException ex) {
	    System.out.println(ex.toString());
	}
	
	
	try {
	    int a = -13;
	    int[] foo = new int[a];
	} catch (NegativeArraySizeException ex) {
	    System.out.println(ex.toString());
	}

	try {
	    Object b = new Object();
	    String f = (String) b;
	} catch (ClassCastException ex) {
	    System.out.println(ex.toString());
	}
	
	try {
	    int f = Integer.parseInt("poodle");
	} catch (NumberFormatException ex) {
	    System.out.println(ex.toString());
	}
	
	
	try {
	    String foo = null;
	    char b = foo.charAt(20);
	} catch (NullPointerException ex) {
	    System.out.println(ex.toString());
	}
	
	
	try {
	    String foo = "aaa";
	    char b = foo.charAt(20);
	} catch (StringIndexOutOfBoundsException ex) {
	    System.out.println(ex.toString());
	}

	
	try {
	    int[] arr = new int[5];
	    arr[20] = 7;
	} catch (ArrayIndexOutOfBoundsException ex) {
	    System.out.println(ex.toString());
	}

	
	try {
	    int a = 7 / 0;
	} catch (ArithmeticException ex) {
	    System.out.println(ex.toString());
	}

	try {
	    throw (new NoogieException());
	} catch (NoogieException nex) {
	    System.out.println(nex.toString());
	}

	
	try {
	    throw (new CoogieException(7));
	} catch (CoogieException bex) {
	    System.out.println(bex.toString());
	}
    }
    
    public static void main(String[] args) {
	new ExceptionDemo();
    }

    class NoogieException extends Exception {
	
    }

    
    class CoogieException extends Exception {
	private int _numCats = 0;
	
	public CoogieException(int numCats) {
	    _numCats = numCats;
	}

	public String toString() {
	    return _numCats + " is too many cats!";
	}
	
    }
    
}
