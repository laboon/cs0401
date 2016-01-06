## Lab 14

## A Closer Look at the Fibonacci Sequence

### Introduction

"Circular Definition, 263, 308: _see_ Definition, Circular  
 ...  
 Definition, Circular: _see_ Circular Definition"  
  -Donald Knuth, from the index of _The Art of Computer Programming, Volume 1_

Recursion is a powerful tool in our arsenal, and often allows for understanding of a problem than using an iterative solution.  However, using recursion often comes with important caveats, especially in a language like Java.

In this week's lab, we are going to take a closer look at the Fibonacci Sequence.  We will spend some time understanding why the recursive algorithm is so slow, and we will attempt to speed it up in a variety of ways.

## Setup

You may use the same private repo as used in the lab last week.   Remember to add, commit, and push them to your repository!

## Instructions 

Please use the FibonacciDemo.java file as your starting point.  You will be implementing several more ways of calculating the Fibonacci sequence.  This will allow you to test your work by ensuring that the same results are calculated by each of the methods.

I have included two possible ways to perform the Fibonacci sequence - the classic recursive strategy, and the iterative strategy.  If you would like to understand how the sequence is calculated, I recommend you uncomment the println's and see how the same results are calculated numerous times.  You can add additional println's to understand it better if you wish.

### Implementing a Memoized Recursive Method

For the recursive method, note how many times that the method is called.  This number will increase very quickly as the ssize increases!  This is one of the main reasons that it is so slow.  However, one of the reasons that the method is called so many times is that the same value must be recalculated numerous times.  For example, let's assume we're calculating the eight Fibonacci number.  We end up calculating, say, Fib(4) several times.  What if we just stored that value instead of re-calculating it?  We'd save numerous method calls (since every call to Fib(4) means 9 recursive method calls) and would probably see faster results.

This process of saving return values in case they are needed again is called "memoization".  In some languages, this is available as part of the language (e.g., Clojure's `memoize` function).  In Java, however, we must implement it ourselves.  This is usually done by adding some sort of data structure in which these values can be looked up.  If the value exists, then it can just be returned instead of continuing to calculate the result.

Think how you would do this, and implement the `memoizedRecursiveFibonacci()` method.  Remember to also have it increment the `_numMemoizedCalls` variable each time it is called.  Afterwards, uncomment the `println()` that displays the number of calls.  You will be pleasantly surprised at how many fewer calls are necessary with a properly memoized method!

The trade-off: this will also cause more memory usage, since you will need to store each of these calculated values somewhere.

### Implementing a Closed-Form Method

Could we make calculating even more efficient than a memoized or iterative method?  It turns out that the Fibonacci sequence is closely related to the Golden Ratio (phi).  This value, which is equal to approximately 1.6180339887..., is seen in numerous

Instead of calculating via recursion or looping, we can simply calculate it in what's called a "closed-form" manner, that is, simply solving an equation.  The _n_th Fibonacci number is equal to:

```
(phi ^ n) / sqrt(5)
```

If you round this number to the nearest integer, it is equal to the nth Fibonacci number!

Think how you would implement this, and implement it as the `closedFormFibonacci()` method.

The trade-off: since we are now using floating-point numbers, we may have to worry about floating-point errors for large values.

### Implementing a Lookup Table Method

The Fibonacci sequence is not going to change.  It has been calculated numerous times (many times by students in Intermediate Java classes before you).  The fifth Fibonacci number will always be 5, and the twentieth will always be 6765.  Why are we even bothering to calculate them again?

In fact, we don't have to do so!  We could just store them in a large array and call the nth element of the array.  You can get the array of precalculated Fibonacci numbers and the nth element will be the nth Fibonacci number.

Implement the `lookupTableFibonacci()` method.  You can use the `FibNums.txt` file to seed the array for this.

The downside: if the number isn't stored in the array (there's a finite size to all precalculated arrays), then we're going to have to calculate it anyways.

### Final Analysis

After you have completed all of these implementations, you can time them (comment out all but one of the calls, and run with a reasonably-sized Fibonacci value, say 45; try this for each of the different methods).  This can be done as follows on a Linux or OS X system:

```
javac FibonacciDemo.java
time java FibonacciDemo 45
```

You are interested in the time marked "real".  If you want to know about the other kinds of time when it comes to testing performance of an application, you can learn about them in CS1632!

On Windows machines, you should be able to use PowerShell to do this in a similar manner (although _caveat lector_, I do not own a Windows machine and have not tried this!)

```
java FibonacciDemo.java
Measure-Command {java FibonacciDemo 45}
```

Check how long the calculation takes with different implementations.  See how the results differ when calculating small values and large values.

## Tips

1. Put some println's to double-check what the values are for your recursive methods.
2. Array indexes are by default ints.  Remember to appropriately cast values.
3. You may need to look up how to do some mathematical functions in the Math class.  You can find this in the Java API.
4. When timing, make sure you are only timing the _run_ and not the _compilation_ time!  The time marked "real" is how long it took according to the clock on the wall.

## To Think About..

Remember that programming is often more art than science.  There are many different ways to get the same result, and often you will have trade-offs.  In this example, we went from a mathematically elegant solution (recursion) all the way down to what seems like a hack (lookup tables).  However, performance (in relationship to time) was drastically improved as we did so.  In so doing, though, we created some limitations (what happens when you try to do a lookup for a value which doesn't exist in the lookup table?).

Just as in life, there is rarely a "right" answer to a program.  Results can be right, but there are (quite literally) an infinite number of ways to reach that result.  

## Grading Rubric

This lab is not graded.
