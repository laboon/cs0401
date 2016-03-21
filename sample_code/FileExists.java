import java.util.*;
import java.io.*;


public class FileExists {

    public static void main(String[] args) {
        File f = new File("kittycat.txt");
	if (f.exists()) {
	    System.out.println("File exists!");
	    // READ IN STUFF
	} else {
	    System.out.println("NOPE");
	    // TELL USER FILE DOESNT EXISTS
	}
    }
}
