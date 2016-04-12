import java.io.*;

public class NewExceptionDemo {

    public static void main(String[] args) {
        try {
	    throw new FileNotFoundException();
	} catch (FileNotFoundException f) {
	    System.out.println("FNF!");
	} catch (Exception e) {
	    System.out.println("lol idk");
	} 
    }
}
