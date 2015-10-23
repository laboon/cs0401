## Lab 08

### The Code As Will and Representation

## Introduction

_“Life is short and truth lives long: let us speak the truth.”_  
- Arthur Schopenhauer, _The World as Will and Representation_

Arthur Schopenhauer is considered a pessimist.  It stands to reason, since one of the key tenets of his moral philosophy is that life consists of pain, and what we call "pleasure" is simply a cessation of that pain.  He also thought that the universe was fundamentally unknowable; it consists of a blind urge to exist, known as the Will.  The Will has no greater meaning or goal, but endlessly and ceaselessly churns and begets more _existence_.  It exists only in order to exist.

What we see with our eyes, feel with our hands, and hear with our ears is merely the result of our self interacting with the Will.  This mixture of thought and Will is Representation.  When we see a flower, we don't actually smell it - our eyes simply interact with some minuscule part of the greater Will, and our mind understands our eyes' reactions, not the flower - or Will - itself.  We delude ourselves when we think that we can ever truly understand the flower.

In this lab, we will make a semi-unknowable, higher-dimensional Universe, and a Scientist who will attempt to understand it without being able to see our random, meaningless machinations.

## Setup

You may use the same private repo as used in the lab last week.  We will be creating three Java files, Lab08.java, Scientist.java, and Universe.java.  Remember to add, commit, and push them to your repository!

## Instructions

Your Lab08 class will create a World, and a Scientist who can travel through the World examining the color of the World at that point.  The colors are Lime, Cerulean, Goldenrod, and Black.  So far, this is much like our World, but with one key difference - whereas our world exists in three dimensions, this World exists in five!  So besides the traditional three directions of movement (up/down, left/right, and forward/back), the Scientist has two other ones (moving "forward" or "backward" in the fourth dimension is known as ana/kata; let's call moving in the fifth dimension grumble/antigrumble).

You will create a five-dimensional, 10x10x10x10x10 unit world, represented by an appropriate multi-dimensional array of ints.  At each location, the color is represented by a value from 0 to 9.  A value of 1 represents the color Lime, a value of 2, Cerulean, and a value of 3, Goldenrod.  All other values represent Black.  Colors are determined by the addition of the values of all the coordinates, modulo 10.  For example, at position [ 0 1 2 7 3 ], the color is Goldenrod, because 0 + 1 + 2 + 7 + 3 = 13, and 13 % 10 is 3.  At position [ 8 0 0 0 8 ], the color is Black, because 8 + 0 + 0 + 0 + 8 = 16, and 16 % 10 is 6, which equates to Black.  These colors are meaningless.  The algorithm is meaningless.  Everything in our constructed world is devoid of meaning.

The World is what is known as Misner space - by heading past one "end" of it, you immediately show up at the "beginning".  Imagine a video game where your character goes off the right side of the screen, and immediately shows up on the left side.  Similarly, if you are in, for example, location [ 0 0 0 9 0], and move one unit in a positive direction in the fourth dimension, you will end up at [ 0 0 0 0 0 ].  If you now move -5 units in the first dimension, you will end up at [ 5 0 0 0 0 ].  The world "wraps around" itself.

The Scientist constructor accepts a World, and has only one public method, move().  The Scientist starts at position [ 0 0 0 0 0 ].  The scientist can move in any one of the five dimensions, labeled by number - note that the first dimension is 1, the second 2, etc.  At each point, the program should display the current location as well as its color.  It should then allow the Scientist to continue travelling on their quest.

The move method signature should look like this:

```java
    public int[] move(int dimension, int numUnits)
```

It will return a six-element array.  The first five elements are the dimensional positions (e.g., [ 0 1 2 3 4 ]).  The last is the integer value of the world at that space.  However, you will display the color as a String ("Black", "Goldenrod", etc.)  

The Scientist will continue to search until a negative dimension is entered as input, at which point the program will stop execution.

## Sample Output

```
javac *.java ; java Lab08
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 1
Enter units to travel (negative for backwards) > 4
Location: [4 0 0 0 0] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 2
Enter units to travel (negative for backwards) > -2
Location: [4 8 0 0 0] = Cerulean
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 3
Enter units to travel (negative for backwards) > -1
Location: [4 8 9 0 0] = Lime
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 3
Enter units to travel (negative for backwards) > 1
Location: [4 8 0 0 0] = Cerulean
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 5
Enter units to travel (negative for backwards) > 3
Location: [4 8 0 0 3] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 1
Enter units to travel (negative for backwards) > 0
Location: [4 8 0 0 3] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 3
Enter units to travel (negative for backwards) > 2
Location: [4 8 2 0 3] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 2
Enter units to travel (negative for backwards) > 2
Location: [4 0 2 0 3] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 4
Enter units to travel (negative for backwards) > -1000
Location: [4 0 2 0 3] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 4
Enter units to travel (negative for backwards) > -99
Location: [4 0 2 1 3] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 4
Enter units to travel (negative for backwards) > 1979
Location: [4 0 2 0 3] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 5
Enter units to travel (negative for backwards) > 5
Location: [4 0 2 0 8] = Black
Enter dimension to travel (1,2,3,4,5) (negative to quit) > 5
Enter units to travel (negative for backwards) > -1
Location: [4 0 2 0 7] = Goldenrod
Enter dimension to travel (1,2,3,4,5) (negative to quit) > -3
The scientist gives up on the quest for understanding.
```

## To Think About...

Although attempting to _visualize_ more dimensions than three is difficult, it is simple to _represent_ them just by using numbers.  It should be simple for you to move back to a location the Scientist has already been, by ensuring that all the coordinates are the same.  Just like with Schopenhauer's metaphysics, we may be unable to truly comprehend the underlying stuff of the universe, but we can deal with the Representation.

## Tips

1. Remember that arrays are 0-based!
2. Another way to think of looping around is modular arithmetic (e.g., adding two hours to 11 o'clock loops around back to 1).
3. Going backwards past 0 may cause problems.  Remember that -2 % 10, for example, is equal to -2.  Thus, going back from position 0 may have you trying to access a negative array index.  How can you make sure that it always gets the right number?
4. Returning an array of values is a powerful tool - previously, we had only ever been able to return a single value from a method.  Remember that you are passing back additional values than just the location when the Scientist moves.
5. You may want to use a simple static method to translate values to colors.

## Grading Rubric

This lab is not graded.