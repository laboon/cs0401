public class IndentStyle {

    // Java style - a slight variant on K&R (below)
    
    public static int doStuff0(int a, int b) {
	if (a < 10) {
	    return 1;
	} else {
	    return a + b;
	}
    }
    
    // K&R Style (from Kernigan and Richie's The C Programming Language)

    public static int doStuff1(int a, int b)
    {
	if (a < 10)
	    return 1;
	else
	    return a + b;
    }

    // 1TBS (One True Brace Style)

    public static int doStuff2(int a, int b)
    {
	if (a < 10) {
	    return 1;
	} else {
	    return a + b;
	}
    }

    
    // Allman style (a/k/a BSD style)
    public static int doStuff3(int a, int b)
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

    public static int doStuff4(int a, int b) {
	if (a < 10) {
	    return 1; }
	else {
	    return a + b; } }    

    // Derp style

    public static
	int doStuff5(int
     a, int b)
	
{ if (a < 10
    ) { return 1; } else { return a +
	b
	;
} }
     
    
    public static void main(String[] args) {
	System.out.println(doStuff0(15, 20));
	System.out.println(doStuff1(15, 20));
	System.out.println(doStuff2(15, 20));
	System.out.println(doStuff3(15, 20));
	System.out.println(doStuff4(15, 20));
	System.out.println(doStuff5(15, 20));

	
    }
    
}
