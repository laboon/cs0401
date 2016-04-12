public class ParseInteger2 {

    public static void main(String[] args) {
        String num = args[0];
	int total = 0;
	for (int j = num.length(); j > 0; j--) {
	    int tenPower = j - 1;
	    System.out.println("10 ^ " + tenPower + "*" + num.charAt(num.length() - j  ));
	    char x =  num.charAt(num.length() - j);
	    int thisColumn = (int) Math.pow(10, tenPower) * (x - 48);
	    total += thisColumn;
	}
	System.out.println("That's " + total + " as an int");
    }
}
