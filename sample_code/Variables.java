public class Variables {


    public static void main(String[] args) {

	// Note that all of these are "syntactic sugar" for two
	// operations, declaration and assignment.  In other words,
	// you can write all of these like this:
	// byte b;
	// b = 127;
	// and you are doing the exact same thing!

	int noogie = 500000;
	byte b = (byte) noogie;
	System.out.println(b);
	
        short s = 32767;
	int i = 2147483647; // = Integer.MAX_VALUE
	long l = Long.MAX_VALUE;
	float f = (float) 1.1111111111; // 1.111 is by default double!
	double d = 1.1111111111;
	boolean bool = true;
	char c = 'a';
	
	String str;
	str = "foo BILLIS THE BEST!!!!! narklfdso";

	// // Long is very big!
	System.out.println("max long value is " + l);

	// Primitive ariable that is declared and not assigned
	// NOTE WILL NOT COMPILE!
	//int ball;
	// System.out.println("ball is...");
	//System.out.println(ball);

	// Reference variable that is declared and not assigned
	Integer foo = null;
	System.out.println(foo);

	// // Double vs Float
	System.out.println("f = " + f);
	System.out.println("d = " + d);

	// // You can define multiple variables on the same line
	// All of these variables must of the same type!

	int cat = 1, dog = 2, bird = 3;
	
	// // But you have to define variables of different types
	// // as separate statements. Note the semicolons!

	// Cookies mean number of cookies
	byte cookie = 4;
	String meow = "foo";
	double bar = 1.0;

	
	// // Newlines don't mean anything in Java!
	String boo = "boo"
	    + "oooooo" + "ooooooo"
	    + "!!!!!!!!!";
	System.out.println(boo);

	System.out.println(7 / 2);
	System.out.println(7.0 / 2);
	System.out.println("Modulo");
	System.out.println(7 % 2);
	System.out.println(7.0 % 2);

	double goodQuestion = 7 / 3;
	System.out.println(goodQuestion);
	
	// // // Precedence - see http://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html for complete list
	// // // If you are having difficulties, add parentheses =)

	int testing = 1;
	testing = 4 * 3 - 2;
	System.out.println("4 * 3 - 2 = " + testing);
	
	testing = 4 * (3 - 2);
	System.out.println("4 * (3 - 2) = " + testing);

	
	
	// // Integer arithmetic and floating point are different!
	int quack1 = 10, quack2 = 3;
	int result1 = quack1 / quack2;
	int remainder = quack1 % quack2;
	System.out.println("(int) 10 / 3 = " + result1);
	System.out.println("(int) 10 / 3 remainder = " + remainder);
	
	double quack3 = 10, quack4 = 3;
	double result2 = quack3 / quack4;
	System.out.println("(double) 10 / 3 = " + result2);

	// // // "Convenience operators"
	// // // Shortcuts for addition, subtraction, etc. of variables
	
	int addMe = 1;
	addMe += 1; // Could use addMe++; or ++addMe; or addMe = addMe + 1;
	System.out.println("1 + 1 = " + addMe);
	
	addMe -= 1; // Could use i--; or --i; or i = i - 1;
	System.out.println("1 + 1 - 1 = " + addMe);

	// // // Prefix and postfix differences
	// // // Prefix - updated BEFORE statement completes
	// // // Postfix - updated AFTER statement completes

	int p = 1;
	System.out.println("++p = " + ++p);

	p = 1;
	System.out.println("p++ = " + p++);
	System.out.println("line after p++, p = " + p);

	
	System.exit(0);
	
	// // Overflow!

	b = 127;
	b++;
	System.out.println("127 + 1 is " + b);

	b = -128;
	b--;
	System.out.println("-128 - 1 is " + b);

	b = (byte) (b + 10000);
	System.out.println("127 + 10000 is " + b);
	
	// // // // Float vs Double
	// // double doubleResult = 5.0 / 3.0;
	// // System.out.println("5.0 / 3.0 = " + doubleResult);
	// // double doubleResult2 = (double) (5 / 3);
	// // System.out.println("5 / 3 = " + doubleResult2);
	// // double doubleResult3 = ((double) 5) / ((double) 3);
	// // System.out.println("(double) 5 / (double) 3 = " + doubleResult3);

	// // System.out.println("Float is " + f);
	// // System.out.println("Double is " + d);

	// // // Adding strings.. be careful!
	String one = "1";
	String two = "2";
	String total = one + two;
	System.out.println("one plus two equals " + total);


	
	// // // Printing out boolean values
	// // // ! means "not"
	boolean testBool = true;
	System.out.println("testBool is " + testBool);
	System.out.println("!testBool is " + !testBool);

	// // // You can go to "more precise" variable types easily..
	// int morePrecise = 10000;
	// byte lessPrecise = 20;

	// morePrecise = lessPrecise;

	// // But going to "less precise" involves "casting"
	// // BUT BE CAREFUL!
	
	// morePrecise = 10000;
	// lessPrecise = (byte) morePrecise;

	// // System.out.println("morePrecise is " + morePrecise);
	// // System.out.println("lessPrecise is " + lessPrecise);

	// // // You can go from a floating-point to integer by casting
	// // // BUT BE CAREFUL!

	double d2 = 20.5;
	double d3 = 20.0;
	int i2 = (int) d2;
	int i3 = (int) d3;
	
	System.out.println("(int) 20.5 = " + i2);
	System.out.println("(int) 20.0 = " + i3);

	
    }

}
