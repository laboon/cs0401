public class ModifyArray {

    public static void printArray(char[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j]);
	}
	System.out.println(arr[arr.length - 1] + " ]");
    }

    
    public static void main(String[] args) {
        char [] arr = new char[30];
	for (int j = 0; j < arr.length; j++) {
	    arr[j] = '.';
	}
	arr[0] = '2';
	System.out.println("START!");
	
	printArray(arr);

	// .....2.....
	
	while (arr[arr.length - 1] != '2') {
	    System.out.println("Next iteration");
	    for (int j = 0; j < arr.length; j++) {
		if (arr[j] == '2') {
		    if (j < arr.length - 1) {
			arr[j + 1] = '2';
			// arr[j] = '.';
		    }
		    j++;
		}
	    }
	    printArray(arr);
	}
	    
    }
}
