## Lab 13

### Exceptionalism

## Introduction

_“[T]here can be no justice so long as laws are absolute. Even life itself is an exercise in exceptions.”_   
   ― Captain Jean-Luc Picard, _Star Trek: The Next Generation_

As Captain Picard and Wesley Crusher discovered in the ST:TNG episode _Justice_, life is full of exceptions.  We must learn to deal with the exceptions we find, in our code and in our lives.

In this week's lab, you will generate several exceptions and catch them.

## Setup

You may use the same private repo as used in the lab last week.  You may want to put the files this week under a special "Lab13" subdirectory, as we will be creating several Java files.  Remember to add, commit, and push them to your repository!

## Instructions - Gotta Catch 'em All

You will generate at least eight (8) exceptions and catch them.  For full points, two of these exceptions will have to be created by you.  You will be required to implement both a _NoogieException_ and a _CoogieException_ (detailed below).

List of possible exceptions:

1. NoogieException (_required_)
1. CoogieException (_required_)
1. ArrayIndexOutOfBoundsException
1. NullPointerException
1. ClassCastException
1. ArithmeticException
1. NegativeArraySizeException
1. StringIndexOutOfBoundsException
1. NumberFormatException
1. ArrayStoreException
1. FileNotFoundException
1. NoSuchElementException
1. IOException
1. Any others you can think of or find!

Note that, aside from NoogieException and CoogieException, you must cause these exceptions "organically".  That is, you cannot simply create a new IOException and throw it (detailed later).  You must do something in normal Java which causes that exception to occur.

This lab will _not_ tell you _how_ to generate these exceptions - it is incumbent upon you to do the research.  I hear there are some excellent search engines out there nowadays.

After causing one of these exceptions to occur, you should enclose it in a try..catch block, like so:

```java
try {
   // Do something that causes an exception
} catch (KindOfException ex) {
   System.out.println(ex.toString());
}
```

You should print out the String representation of the exception for each exception caused.

There will be numerous instances of these try..catch blocks.  Each try..catch block should be indepedent; that is, the first exception should occur

You are required to create two of your own kinds of exceptions (these both should be subclasses of class Exception).

NoogieException will not override any methods.  You can then force the code to throw the exception by using the `throw` keyword.  An Exception is an object, so you must create it with the `new` keyword first, and then throw it.  For example:

```java
try {
    throw (new KindOfException());
} catch (KindOfException ex) {
    System.out.println(ex.toString());
}
```

CoogieException will allow the user to enter one argument, an `int`, in the constructor.  The relevant parameter will be named `numCats`.  CoogieException will also override the .toString() method.  .toString() will return the string `numCats + " is too many cats!".

The final output of the program should just be a list of all the exceptions that were caught in the catch blocks.

## Tips

1. First figure out what the exception means, then think backwards to what may cause it.  The Java API is helpful in helping you understand what causes an exception to occur.
2. Remember that when an exception occurs and is thrown, the rest of the block in which that exception occurs does not execute - it goes directly to the `catch` block.
3. If you do not catch the _specific_ kind of exception you cause, the exception will bubble up and cause the program to cease execution.  Be careful when copying and pasting!

## Grading Rubric
0 points - Generated no exceptions
1 point - Generated 7 or fewer kinds of exceptions and caught them, including a NoogieException
2 points - Generated 8 or more kinds of exceptions and caught them, including a NoogieException and a CoogieException

