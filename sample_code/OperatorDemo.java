public class OperatorDemo {

    // Determine whether the answer will be _true_ or _false_
    // and why.
    
    public static void main(String[] args) {

	// boolean values can be true or false only.  No "maybe", no "probably",
	// no "kind of".

	boolean trueVal = true;
	boolean falseVal = false;

	
	// We can compare values with relational (< > <= >=) and equality (== !=)
	// operators.

	boolean greaterThan = 6 > 2;
	boolean lessThanVal = 4.6 < 200.0;
	boolean greaterThanEqualTo = 7 >= 1;
	boolean lessThanEqualTo = 4000.5 <= 4000.7;

	// System.out.println(_boolean_) will print out "true" or "false".

	System.out.println("Value of trueVal is: " + trueVal);
	System.out.println("Value of lessThan is: " + lessThanVal);
	System.out.println("6 < 1, true or false? " + (6 < 1));
	
	// We can combine them with ! (not), || (logical or), && (logical and), and
	// technically ^ (bitwise XOR, which will function like a logical XOR in Java).
	// There is a slight difference to ^, which we'll discuss in a moment.

	boolean notTrueVal = !trueVal;

	System.out.println("!trueVal --> " + notTrueVal);
	
	boolean oppositeVal = !(7 < 10);

	System.out.println("!(7 < 10) --> " + oppositeVal);
	
	boolean orVal = trueVal || falseVal;
	boolean andVal = trueVal && falseVal;

	System.out.println("trueVal || falseVal --> " + orVal);
	System.out.println("trueVal && falseVal --> " + andVal);
	
	boolean xorTrueVal = true ^ false;
	boolean xorFalseVal = true ^ true;

	System.out.println("true ^ false --> " + xorTrueVal);
	System.out.println("true ^ true  --> " + xorFalseVal);

	
	// As mentioned, ^ is a little weird.  Logical operators can short-circuit.
	// Bitwise operators cannot.  Short-circuiting means that Java will take a
	// 'shortcut' and not evaluate the second half of a statement if it doesn't
	// need to.  For example -

	boolean shortCircuited = 1 < 3 || 3 < 2;

	// Java will never even look at 3 < 2, because true || *whatever* will
	// always be true.
	
	// ^ will never short-circuit, which means it will always calculate
	// both sides of the equation.  This is because we can never know if
	// XOR is true without checking both!  If the first element is true,
	// we need to check if the second part is false.  If the first element
	// is false, we need to check if the second is true.  For example -

	boolean noShortCircuit = 7 >= 6 ^ 6 == 5;
	
	// Floating points can equal integers, but it can be dangerous!
	// Comparing equality in floating-point land can be difficult
	// due to rounding.  This can mean _very_ slight differences in
	// values you think are "equal"!
	// Note that the "float" and "double" casts are not necessary
	// since we are casting from int to a higher-precision variable.
	
	int intVal = 1;
	float floatVal = (float) 1;
	double doubleVal = (double) 1;
	float div1 = (float) 17.0 / 3;	
	float div2 = ((float) 17.0) / (((float) 1.0 / (float) 9999999.1) * ((float) 9999999.1 * 3));

	System.out.println("(int) 1 == (int) 1 --> " + (intVal == floatVal));
	System.out.println("(int) 1 == (float) 1.0 --> " + (intVal == floatVal));
	System.out.println("(int) 1 == (double) 1.0 --> " + (intVal == doubleVal));

	System.out.println("div1 == div2 --> " + (div1 == div2));
	System.out.println("div1 == " + div1);
	System.out.println("div2 == " + div2);

	// Problems from slides begin here!

	// Set up variables.
	
	int i = 10, j = 15, k = 20;
	double x = 10.0, y = 3.333333, z = 100.0;

	
	// Note that && has higher precedence than or.  This means
	// that the following two statements are equivalent.  Note
	// parentheses.

	// boolean answer = i < j || (j < k && x <= y);
	
	boolean answer = i < j || j < k && x <= y;
	
	System.out.println(answer);

	// Note that i is an integer value, and y is a double-precision
	// floating point value.
	
	answer = (i / 3) == y;

	System.out.println(answer);

	// Note that x and y are both double-precision floating point
	// values.  
	answer = (x / 3) == y;
	// System.out.println("x = " + x);
	// System.out.println("x / 3 = " + (x / 3));
	// System.out.println("y = " + y);
	System.out.println("(x / 3) == y --> " + answer);

	// DANGER DANGER DANGER!  Comparing floating point
	// values for equality can be dangerous.
	
	
	// Note the multiple uses of ! (not) here.  Also note
	// that x is a floating-point value and i is an integer.
	
	answer = !(x != i);

	System.out.println(answer);

	
	
    }
    
}
