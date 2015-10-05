public class IndentStyle {

    // Java style
    
    public int doStuff0(int a, int b) {
	if (a < 10) {
	    return 1;
	} else {
	    return a + b;
	}
    }
    
    // K&R Style (from Kernigan and Richie's The C Programming Language)

    public int doStuff1(int a, int b)
    {
	if (a < 10) {
	    return 1;
	} else {
	    return a + b;
	}
    }
    
    // Allman style (a/k/a BSD style)
    public int doStuff2(int a, int b)
    {
	if (a < 10)
	{
	    return 1;
	}
	else
	{
	    return a + b;
	}
    }
    
    // Lisp Style

    public int doStuff3(int a, int b) {
	if (a < 10) {
	    return 1; }
	else {
	    return a + b; } }    
    
    public static void main(String[] args) {
	
    }
    
}
