Name:________________________________

CS0401 - QUIZ 1 / 28 SEP 2015

1. (5 points) What is the output from these two statements?

  int j = 5;
  System.out.printf("Num is %03d", j);


```
Num is 005
```


2. (2 points each) For each of the following variable assignments, mark YES if it will work as-is, or NO if it will generate an error (compile-time or run-time).

a. int a = (int) 12.5; `YES`

b. double b = 200; `YES`

c. byte c = 25000; `NO`

d. double d = (int) 55.32; `YES`

e. byte e = (byte) 30000; `YES`

3. (8 points) What is the output from these three statements?

  int quack = 9;
  System.out.println("I quacked " + quack++ + " times.");
  System.out.println("They quacked " + ++quack + " times.");

```
I quacked 9 times.
They quacked 11 times.
```


4. (5 points) What is the final value of the variable foo?

int foo = 10;
foo -= 3;
foo++;
foo = 13 % 3;

```
1
```

5. (10 points) Write a for loop which counts by 2's, from 2 to 10, and displays them on the screen, followed by a carriage return ("enter") .  In other words, output should look like:
2
4
6
8
10

```
for (int j=2; j <= 10; j += 2) {
    System.out.println(j);
}
```

OR

```
for (int j=1; j <= 5; j++) {
   System.out.println(j * 2);
}
```

_Lots of other possibilities!_


6. (10 points) Write a method, hasGoodNumPets, that accepts two arguments: numCats (an integer) and numDogs(a long), and returns a boolean.  In the case that a person has two or fewer cats and three or fewer dogs, return true.  Otherwise, return false.

```
public static boolean hasGoodNumPets(int numCats, long numDogs) {
   if (numCats <= 2 && numDogs <= 3) {
       return true;
   } else {
       return false;
   }
```

OR

```
public static boolean hasGoodNumPets(int numCats, long numDogs) {
   boolean toReturn = (numCats <= 2 && numDogs <= 3);
   return toReturn;
}
```

_Lots of other possibilities!_


7. (6 points) Write down what output the following lines of code will produce.

int birds = 2;
switch (birds) {
case 1:
    System.out.println("Pretty bird.");
case 2: case 3:
    System.out.println("Good bird.");
default:
    System.out.println("Fluffy bird.");
}


```
Good bird.
Fluffy bird.
```

8. (6 points) Write down what output the following lines of code will produce.

int numHorses = 10;
int numMen = 20;

if (numHorses >= 5 || numHorses <= 25) {
    if (numMen != 5) {
        System.out.println("Oh no Humpty Dumpty!");
    } else if (numMen <= 30 && numHorses > 0 && numHorses < 100) {
        System.out.println("Sorry Humpty Dumpty!");
    } else {
        System.out.println("Boo Humpty Dumpty!");
    }
} else {
    System.out.println("Uh oh Humpty Dumpty!");
}
    
```
Oh no Humpty Dumpty!
```


9. (6 points) Write down what output the following lines of code will produce.

int numCats = 2 * 2 + 4 * 3;
System.out.println("Num cats is " + numCats);

```
Num cats is 16
```


10. (6 points) Write down what output the following lines of code will produce.

int foo = 17 % 5;
int bar = 10 / 3;
System.out.println("I have " + foo + " foos and " + bar + " bars.");


```
I have 2 foos and 3 bars.
```


11. (5 points) What will happen if I enter "plumbus" for input in the following code?  You may assume that the rest of the program works correctly (e.g., Scanner has been imported, class and main method set up correctly, etc.) Circle the best answer.

Scanner sc = new Scanner(System.in);
int fleeb = sc.nextInt();

(a) You will never get to this point; javac will generate a compile-time error.

(b) The variable fleeb will be set to the ASCII value of the first character, p.

(c) The variable fleeb will be set to the default int value, 0.

(d) A run-time error will occur, showing the exception java.util.InputMismatchException.

(e) An infinite loop will occur, because the non-integer value will not be popped off the stack.

```
d
```


12. (8 points) Write a procedure, printLove, which accepts one parameter, a String (you may name this parameter whatever you like).  It will then print out the words "I love ", then the passed-in parameter, then an exclamation point.  For example, if printLove is called with the argument "Madame Bovary", it will print out "I love Madame Bovary!"

```
public static void printLove(String name) {
    System.out.println("I love " + name + "!");
}
```

13. (5 points) What will be the output of this loop?  Circle the best answer.

int k = 0;
do {
    System.out.print("Schmeckle");
} while (k != 2);

(a) "Schmeckle"

(b) No output

(c) "SchmeckleSchmeckleSchmeckle..." (infinite loop)

(d) "SchmeckleSchmeckle"


```
a
```

14. (5 points) What will be the output of this loop?

long quantum = 400;
while (quantum < 200) {
    System.out.print("Zeep");
    quantum -= 400;
}

(a) "Zeep"

(b) No output

(c) "ZeepZeepZeep..." (infinite loop)

(d) "ZeepZeep"


```
b
```

15. (5 points) Which of the following lines of code will set the value of variable glipglop to 10, after the first three lines are executed?  Circle the best answer.

int glipglop = 11;
int beth = 40;
int jerry = 4;

(a) glipglop = beth % jerry;

(b) glipglop = jerry % beth;

(c) glipglop = jerry / beth;

(d) glipglop = beth / jerry;

```
d
```

16. (+1 bonus) Draw a funny computer-related picture, or a programming-related joke.

_+1 for anything_

```
             ,----------------,              ,---------,
        ,-----------------------,          ,"        ,"|
      ,"                      ,"|        ,"        ,"  |
     +-----------------------+  |      ,"        ,"    |
     |  .-----------------.  |  |     +---------+      |
     |  |                 |  |  |     | -==----'|      |
     |  |  PROFESSOR      |  |  |     |         |      |
     |  |  LABOON         |  |  |/----|`---=    |      |
     |  |  RULES          |  |  |   ,/|==== ooo |      ;
     |  |                 |  |  |  // |(((( [33]|    ,"
     |  `-----------------'  |," .;'| |((((     |  ,"
     +-----------------------+  ;;  | |         |,"
        /_)______________(_/  //'   | +---------+
   ___________________________/___  `,
  /  oooooooooooooooo  .o.  oooo /,   \,"-----------
 / ==ooooooooooooooo==.o.  ooo= //   ,`\--{)B     ,"
/_==__==========__==_ooo__ooo=_/'   /___________,"
`-----------------------------'
```