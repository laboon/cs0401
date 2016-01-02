import java.util.*;
import java.io.*;
import java.nio.file.*;

public class FileAccess {

    /**
     * Standard "save".  Write the string to the file.
     */
    
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

    /**
     * "Safe save".  Write the string to a backup file,
     * then copy it over the last saved file, and 
     * if everything is OK, delete the originally 
     * written file.
     */
    
    public static boolean safeSaveFile(String fileToWrite, String backupFile, String m) {

	// If there is any error, return false to
	// let the user know.
	
	try {

	    // Unlike the assignment, there is no
	    // need to read anything in from the
	    // original file.  Let's write directly
	    // to the backup file.  However, for
	    // you could start by reading the
	    // previous data.

	    // Write directly to the BACKUP file first.
	    
	    PrintWriter out = new PrintWriter(backupFile);
	    out.println(m);
	    out.close();

	    // The file is now closed.  We now
	    // have a "backup copy", but our original
	    // saved file is still safe.  Any error
	    // before this point is going to throw
	    // an exception and our original file
	    // is still safe.

	    // Now let's copy over the "backup copy"
	    // to replace the old saved file.
	    
	    File a = new File(fileToWrite);
	    File b = new File(backupFile);
	    Files.copy(b.toPath(), a.toPath(), StandardCopyOption.REPLACE_EXISTING);

	    // So now we have two copies of the
	    // new file - the new one we just wrote
	    // in backupCopy, and the copy we just
	    // copied over the old saved copy.
	    // But we don't need two copies, so
	    // delete the original one we put
	    // in backupCopy.

	    Files.delete(b.toPath());
	    
	    // If we got here, no problems!
	    // We now have one saved file,
	    // and if any problems occurred,
	    // we wouldn't have gotten here.
	    // So just return true (== success).
	    
	    return true;
	} catch (IOException ioex) {

	    // Any error that occurs, return false.
	    // We'll leave it up to the user to
	    // double-check the files and see
	    // what can be salvaged.

	    // For an industry product, we'd
	    // probably want to have better
	    // error messaging.
	    
	    return false;
	}

	
    }

    /**
     * Load file and return an ArrayList of Strings
     * which equates to the contents of the file.
     */
    
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
	    // Any error, return null - nothing
	    // there.
    	    return null;
    	}

    	return lines;

    }
    
}
