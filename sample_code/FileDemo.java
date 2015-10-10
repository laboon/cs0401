import java.util.*;
import java.io.*;

public class FileDemo {

    // "throws IOExceptions" means "watch out compiler, this method
    // may cause an exception!
    // Remember other run-time exceptions - Divide By Zero,
    // Input Mismatch, etc.
    public static void main(String [] args) throws IOException {

	if (args.length < 2) {
	    showErrorMessage();
	}
	
	String option = args[0];
	String fileName = args[1];
	
	if (option.equals("read")) {
	    displayFile(fileName);
	} else if (option.equals("write")) {
	    writeFile(fileName);
	} else {
	    showErrorMessage();
	}		     
    }

    public static void showErrorMessage() {
	System.out.println("Format: java FileDemo [read | write] <filename>");
	System.exit(1);
    }

	
    public static void displayFile(String fileName) throws IOException {

	File f = new File(fileName);
	Scanner sc = new Scanner(f);
	while (sc.hasNextLine()) {
	    System.out.println(sc.nextLine());
	}
	sc.close();
    }
    
    public static void writeFile(String fileName) throws IOException {
	PrintWriter out = new PrintWriter(fileName);
	for (int j=0; j < 100; j++) {
	    out.println(j + ": FILE HAS BEEN LABOONIFIED!");
	}
	out.close();
    }
}
