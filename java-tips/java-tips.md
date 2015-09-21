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

* Remember your code needs lots of hugs, which you can give it with parentheses.  If your code has precedence issues, feel free to clarify with parentheses.  For example

* Boolean operators need a _complete_ boolean expression on each side.  For example, the following code does not do what you might think it does.

```
if (i == 1 || 2) {
   System.out.println("i is one or two!");
}
```

In this case, you are testing that one of the two statements is true:

1. (i is equal to 1) is true
2. 2 is true

You are testing if 2 is true.  What you mean to do is to test if:

1. (i is equal to 1) is true
2. (i is equal to 2) is true

You need to be very specific with Java!  This is how you would code this:

```
if (i == 1 || i == 2) {
   System.out.println("i is one or two!");
}
```

* One equals means assignment; two equals means equality.  Be wary of doing things like this, your code will not compile.  In other languages, it might compile but give you weird run-time errors:

```
if (j = 1) {
    System.out.println("j is one!");
}
```

Do this instead!

```
if (j = 1) {
    System.out.println("j is one!");
}
```



