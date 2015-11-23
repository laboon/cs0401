import java.util.*;
import java.io.*;

public class FileAccess {

    public static boolean saveFile(String fileName, String m) {
	try {
	    PrintWriter out = new PrintWriter(fileName);
	    out.println(m);
	    out.close();
	    return true;
	} catch (IOException ioex) {
	    return false;
	}
    }


    
    public static ArrayList<String> loadFile(String fileName) {

    	ArrayList<String> lines = new ArrayList<String>();

    	try {
    	    File f = new File(fileName);
    	    Scanner sc = new Scanner(f);

    	    while (sc.hasNextLine()) {
    		lines.add(sc.nextLine());
    	    }

    	    sc.close();
    	} catch (FileNotFoundException fnfex) {
    	    return null;
    	}

    	return lines;

    }
    
}
