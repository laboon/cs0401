public class AlterArray {

    public static void blimBlam(int[] a2) {
	a2[3] = 17;
    }

    public static void main(String[] args) {
	int[] a1 = { 1, 2, 3, 4, 5, 6};
	System.out.println("Before Blim Blam..");
	for (int a : a1) {
	    System.out.println(a);
	}
	blimBlam(a1);
	System.out.println("After Blim Blam..");
	for (int a : a1) {
	    System.out.println(a);
	}
    }
    
}
