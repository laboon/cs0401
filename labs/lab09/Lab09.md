## Lab 09

### Deep Bubbles

## Introduction

_“Good artists copy, great artists steal.”_   
   ― Pablo Picasso

In class, we discussed selection sort.  We also briefly discussed the difference between _shallow copying_ and _deep copying_.  In this lab, we will implement another sorting algorithm, Bubble Sort, as well as a method to deep-copy a ragged two-dimensional array.  

## Setup

You may use the same private repo as used in the lab last week.  You may want to put the files this week under a special "Lab09" subdirectory.  However, this lab can be done with only one Java class.  Remember to add, commit, and push any Java files to your repository!

## Instructions

A base file, Lab09.java, is included in the repository.  You may use this as your basis for the assignment.

You will note that there is an array

```java
public static int[][] deepCopy(int[][] arr)
```

That is, it will accept a two-dimensional array (of any size, including ragged ones) and return a new array of the same size and with the same values.  For example, if I pass in an array such as:

```java
{ {1, 2, 3}
  {4, 5, 6, 7, 8, 9, 10},
  {-1} }
```

It will return a new array of the same sizes and with the same values.  It should NOT return a reference to the same array, or to any of the subarrays!  The arrays must be entirely separate.

Then, your program should make a copy of the array a1 and put it in a different variable, a2.

You will note that the original array has five sub-arrays.  Each of these sub-arrays should be sorted, with the ones in a1 being sorted by Bubble Sort (described below) and the ones in a2 by Selection Sort.  These should be two separate methods.  Each of these methods should return an `int` representing the number of times a swap occurred when sorting one particular sub-array.

After sorting each sub-array through both bubble and selection sorts, display the now-sorted array and number of swaps necessary.  For example, for the first sub-array for a1 and a2, your output should look like this:

```
Bubble sort: [ 3, 4, 5, 6, 8, 9 ]
Swaps = 13
Selection sort: [ 3, 4, 5, 6, 8, 9 ]
Swaps = 3
```

Bubble Sort is a similar kind of sort to Selection Sort, in that it involves swapping values.  Selection Sort spends each iteration looking through the rest of the values to see what belongs in position 0, 1, 2, etc., and swapping them.  Bubble Sort, however, will only look at the two elements right next to each other.  If the "left" value (e.g., position 4) is greater than the "right" value (e.g., position 5), then the sort will swap them.  If not, it leaves them alone.

At the end of an iteration, the Bubble Sort will most likely not be done.  Instead, it will have to start back at the beginning of the array and once again look through all the values to see if any need to be swapped.  The Bubble Sort will keep going through the list until there have been no swaps during an iteration, at which point all of the values are in the correct order.

Looking through the output below, notice how smaller values slowly "bubble" to the beginning of the array, and larger values slowly "sink" to the end.

```
Iteration 0
[ 8, 9, 5, 6, 4, 3 ]
Swapping position 1 (Value: 9) and 2 (Value: 5)
[ 8, 5, 9, 6, 4, 3 ]
Swapping position 2 (Value: 9) and 3 (Value: 6)
[ 8, 5, 6, 9, 4, 3 ]
Swapping position 3 (Value: 9) and 4 (Value: 4)
[ 8, 5, 6, 4, 9, 3 ]
Swapping position 4 (Value: 9) and 5 (Value: 3)

Iteration 1
[ 8, 5, 6, 4, 3, 9 ]
Swapping position 0 (Value: 8) and 1 (Value: 5)
[ 5, 8, 6, 4, 3, 9 ]
Swapping position 1 (Value: 8) and 2 (Value: 6)
[ 5, 6, 8, 4, 3, 9 ]
Swapping position 2 (Value: 8) and 3 (Value: 4)
[ 5, 6, 4, 8, 3, 9 ]
Swapping position 3 (Value: 8) and 4 (Value: 3)

Iteration 2
[ 5, 6, 4, 3, 8, 9 ]
Swapping position 1 (Value: 6) and 2 (Value: 4)
[ 5, 4, 6, 3, 8, 9 ]
Swapping position 2 (Value: 6) and 3 (Value: 3)

Iteration 3
[ 5, 4, 3, 6, 8, 9 ]
Swapping position 0 (Value: 5) and 1 (Value: 4)
[ 4, 5, 3, 6, 8, 9 ]
Swapping position 1 (Value: 5) and 2 (Value: 3)

Iteration 4
[ 4, 3, 5, 6, 8, 9 ]
Swapping position 0 (Value: 4) and 1 (Value: 3)

Iteration 5
[ 3, 4, 5, 6, 8, 9 ]
Swaps = 13
```

Note the final iteration (5) sees no swaps done.  This means that the array has already been sorted - there is nothing left to do.

While Bubble Sort is rarely used due to its (lack of) speed, it is used occasionally in graphics programming since it can tell you very quickly and with a minimum of computing power whether or not a list is already sorted.

## Template Code

See Lab09.java for Selection Sort, swap and printArray helper methods, as well as the original array.  Note that you will have to change some of already-existing code in order to complete this lab!

## Tips

1. Remember that you do not have to set the size of the array (or a sub-array) during the declaration of it.
2. Don't be afraid to modify code that already exists.  Mark down where you are (make a "save point") by committing your changes.  If you "go down the wrong path", you can revert back to that point by "git checkout _filename_".
3. Loop through the array to get each sub-array.

## To Think About
Is there any case where Bubble Sort was better than Selection Sort, in regards to number of swaps?  Were there any cases where it was much, much worse?  Why?

## Grading Rubric
   1.0 Point - Implemented Bubble Sort  
   0.5 Point - Properly counts and displays numbers of swaps  
   0.5 Point - Does a proper deep copy of the array  

