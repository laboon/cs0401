## Arrays, File I/O, and The Lack of Free Will

## Introduction

In this lab, we will simulate our own universe, as well as attempt to understand arrays and writing to files.

## Setup

You may use the same private repo as used in the lab last week.  We will be creating one Java file, Lab07.java.  Remember to add, commit, and push to your repository!

## Lab 7

Causal determinism is the belief that every event is necessary and caused by events that occurred before it.  For example, the reason that there is a broken egg on the floor is that I dropped it; the reason that I dropped it was that I was looking out the window; the reason I was looking out the window was to see a beautiful sunset; the reason the sunset was so beautiful was a volcano that erupted; the reason that the volcano erupted was a fissure in the Earth's surface; the reason for the fissure was a weakness in the granite... _ad infinitum_, or at least until the beginning of the Universe.  Determinism holds that there is no such thing as free will; our actions and thoughts are also the result of whatever the state of our own universe was a moment ago.

We will create a one-dimensional universe, and it will be governed by deterministic rules.  The universe will consist of an array of characters representing spots of land.  Every fifth spot of land, starting at position 5 in the array, will have a Carrot on it (represented as a "^").  Any spot of land without a Carrot or a Numericon (see below) will be represented as a ".".

It will be peopled by the Numericons.  Numericons have three stages of life - baby, child, and adult (represented by 0, 1, and 2, respectively).  Numericons exist on every seventh spot of land, starting on the zeroth spot.  All Numericons are generated initially as Baby Numericons.  If a Numericon is generated on a spot of land where a Carrot is, the Numericon takes precedence and no Carrot is there.

Baby and Child Numericons do not move or eat; they simple grow from Baby to Child, and Child to Adult, each after one iteration.  Adult Numericons move to the "right" (increasing index in the array) by one spot each iteration until they find a Carrot.  At this point, they eat the Carrot (it is removed from the Universe), and become a Baby Numericon.  If an Adult Numericon tries to move but another Numericon is blocking their way, they stay in the same spot.  This is true even if the other Numericon has not yet moved in that iteration!  For example,

```
22...
```

The first Adult Numericon cannot move, but the second one can.  After one iteration, the Universe will look like this:

```
2.2..
```

At the beginning of the simulation, you should ask the user what size they would like the simulation to be, and generate the universe in a method with the following method signature:

```
char[] generateUniverse(int size)
```

Other aspects of the signature, such as whether it is private or public, static or not, etc., are up to you.

At each iteration, you should display the world in its current state.  You may choose to (Q)uit, (A)dvance one iteration or (S)ave to a file.  You may assume that only valid input will be entered.

1. Quitting will end the simulation (and the Java program)
2. Advancing one iteration will cause all Numericons to age one stage (a baby Numericon becomes a child, a child becomes an adult, and an adult moves or becomes a child after eating a Carrot).  Carrots do not age.
3. Saving to a file will write the current state of the universe to a file named "universe.txt" in the current directory.  It will overwrite any file which is already there with the same name.

You will then be able to save your universe to a text file, along with the number of baby, child, and adult Numericons.  The universe will be saved on one line, and then the number of baby, child, and adult Numericons on separate lines after that (see below for a sample).

Eventually, your Universe will run out of Carrots, and your poor adult Numericons will be hungry forever.  After finishing the assignment, you may want to add an additional "Carrot regeneration" rule if you would like the Numericons.  However, this is entirely optional.  It is up to you and your own personal ethical system whether you should spent time generating Carrots for virtual beings.  You also may want to add the ability to "load" a world that had previously been written to a file, or you may allow the Numericons in that Universe to live in an eternal statis until you delete the directory in which they are stored.  

## Sample Output

```
(1158) $ javac Lab06.java ; java Lab06
How big of a world? > 25
0....^.0..^...0^....^0...
A
1....^.1..^...1^....^1...
A
2....^.2..^...2^....^2...
A
.2...^..2.^....0....^.2..
A
..2..^...2^....1....^..2.
A
...2.^....0....2....^...2
A
....2^....1.....2...^...2
A
.....0....2......2..^...2
A
.....1.....2......2.^...2
A
.....2......2......2^...2
A
......2......2......0...2
A
.......2......2.....1...2
A
........2......2....2...2
A
.........2......2....2..2
A
..........2......2....2.2
A
...........2......2....22
A
............2......2...22
S
............2......2...22
A
.............2......2..22
A
..............2......2.22
Q
```
## Sample Saved Universe

```
............2......2...22
Babies: 0
Children: 0
Adults: 4
```

## Tips

1. Remember to check if you're at the end of the universe when iterating through arrays!
2. Keep in mind that arrays are index 0 through (length of the array - 1).
3. If you are using a for loop, you can modify the index in the middle of the loop.
4. You can make a String version of a char array by using the String constructor, `new String(charArray);`.
5. An ArrayIndexOutOfBoundsException means that you tried to access an element of the array that doesn't exist.  For example, if you have an array that has 30 elements, the valid indexes are 0,1,2...27,28,29.  Trying to access the element with index 30 will throw an exception.

## To Think About...

What happens "at the end of the Universe", after all Carrots have been eaten?

Could we make this a truly non-deterministic simulation?  That is, a universe in which the state of the universe is not dependent solely upon the previous state?

Does any of this accurately reflect the universe in which we live?  Is there some sort of limiting factor in our universe similar to Carrots in the Numericons' universe?

## Grading Rubric
* Worth: two points overall
  * 1 point - Universe (array) created and Numericons age
  * 0.5 points - Numericons eat Carrots and are rejuvenated
  * 0.5 points - Universe can be saved to a text file

If you do not complete the lab during recitation, you may show it to your TA at the **beginning** of the next recitation for full credit.
