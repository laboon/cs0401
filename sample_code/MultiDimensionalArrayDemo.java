public class MultiDimensionalArrayDemo {

    // This assumes a perfect grid
    private static void print2DCharArray(char[][] arr) {
	for (int j = 0; j < arr.length; j++) {
	    for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[j][k]);
	    }
	    System.out.println("");
	}
    }

    // This DOES NOT assume a perfect grid - it handles ragged arrays
    private static void print2DIntArray(int[][] arr) {
	System.out.println("--------------------");
	for (int j = 0; j < arr.length; j++) {
	    for (int k = 0; k < arr[j].length; k++) {
		System.out.print(arr[j][k]);
	    }
	    System.out.println("");
	}
	System.out.println("--------------------");
    }

    
    public static void main(String[] args) {

	// Arrays can be arrays of references.. and these references can
	// themselves be other arrays!

	char[][] ticTacToe = new char[3][3];

	// Fill array with "space" character
	for (int j = 0; j < ticTacToe.length; j++) {
	    for (int k = 0 ; k < ticTacToe.length; k++) {
		ticTacToe[j][k] = ' ';
	    }
	}

	// Now make a diagonal of X's
	
	for (int j = 0; j < 3; j++) {
	    ticTacToe[j][j] = 'X';
	}

	print2DCharArray(ticTacToe);
	
        // You can use the same {} shortcut, but rememember that
	// multi-dimensional arrays are really "arrays of arrays"

	int[][] multiArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

	print2DIntArray(multiArray);

	// Arrays must contain the same data but do NOT need to be
	// the same length!  Multi-dimensional arrays that are not
	// perfect grids are called "ragged arrays".  For example -

	System.out.println("----------------");
	int[][] raggedArray = { {1,2}, {3,4,5,6,7,8}, {9,10,11,12}, {13} };

	print2DIntArray(raggedArray);

	// These are perfectly fine because remember, each element in
	// a reference-based array is a reference to something else.
	// These can be different-sized arrays, or even replaced by other
	// arrays!

	// Note that we set the number of rows, but the columns are empty

	int[][] ragged2 = new int[3][];

	ragged2[0] = new int[2];
	ragged2[1] = new int[5];
	ragged2[2] = new int[3];

	ragged2[0][1] = 5;
	ragged2[2][2] = 5;
	ragged2[1][2] = ragged2[2][2];

	print2DIntArray(ragged2);

	// Let's replace ragged2[2] with a new array.

	int[] tango = new int[10];
	for (int j = 0; j < tango.length; j++) {
	    tango[j] = j;
	}

	ragged2[2] = tango;
	print2DIntArray(ragged2);
	
	// Into the third dimension..
	// Nothing is stopping you from making arrays of arrays of arrays.
	// You could then use x,y,z coordinates to make a virtual
	// 3-D world, or a Rubik's cube sort of object.

	int[][][] threeD = { { {1,2,3}, {4,5,6}, {7,8,9} },
			     { {3,2,1}, {6,5,4}, {9,8,7} },
			     { {1,1,1}, {2,2,2}, {3,3,3} } };

	// And beyond!  These are hard to visualize but the
	// math works out just fine.

	int[][][][][][] sixD = new int[3][4][3][5][6][8];

	int counter = 0;
	for (int j=0; j < sixD.length; j++) {
	    for (int k=0; k< sixD[j].length; k++) {
		for (int l=0; l < sixD[j][k].length; l++) {
		    for (int m=0; m < sixD[j][k][l].length; m++) {
			for (int n=0; n < sixD[j][k][l][m].length; n++) {
			    for (int o=0; o < sixD[j][k][l][m][n].length; o++) {
				sixD[j][k][l][m][n][o] = counter++;
			    }
			}
		    }
		}
	    }
	}

	System.out.println("sixD[0][0][0][0][0][0] = " + sixD[0][0][0][0][0][0]);
	System.out.println("sixD[2][3][2][4][5][7] = " + sixD[2][3][2][4][5][7]);
	System.out.println("sixD[1][2][1][2][1][2] = " + sixD[1][2][1][2][1][2]);

    }
    
}
