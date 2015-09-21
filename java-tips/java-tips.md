* Remember that calling `.hasNextInt()` (or any of the other .hasNext methods) does not remove any tokens from the Scanner!  For example, the following code will result in an infinite loop if you enter an invalid value.
```
boolean noValidInput = true;
int value = -1;
do {
    System.out.print("Enter an int > ");
    if (sc.hasNextInt()) {
        value = sc.nextInt();
	noValidInput = false;
    }
} while (noValidInput);
System.out.println(value + " is an integer!");
```
In order to avoid this, remove the invalid value by using a .next() and throwing the value away.
```
boolean noValidInput = true;
int value = -1;
do {
    System.out.print("Enter an int > ");
    if (sc.hasNextInt()) {
        value = sc.nextInt();
	noValidInput = false;
    } else {
        String throwaway = sc.next();
    }
} while (noValidInput);
System.out.println(value + " is an integer!");
```
