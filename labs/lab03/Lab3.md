# Lab 3 - Why Java Is Not the Choice of Professional Philosophers

## Introduction

This lab will teach you about setting up a private Git repo, loops and conditionals, and why you shouldn't use floating-point variables when studying philosophy.

## Setting Up and Sharing A Private Git Repo

We will be creating a new repo on your account called "Lab3". There will be two major differences from last week:

1. The repo will be _private_
2. The repo will be shared with your TA

## Instructions

1. Go to https://github.com/_YourUserName_
2. Click on "Repositories" tab
3. Click the green "New" button
4. Give it the name Labs
5. Click on the "Private" radio box.
  * NOTE: If you don't see this, your Student Developer pack may not have come through.  Let your TA know when turning it that this is the case.
6. Click on the option to initialize the repository with a README
7. In the right-hand column, click on Settings (it has a little "gear" icon next to it)
8. Click on "Collaborators" (in the left-hand column)
9. In the textbox labeled "Search by username, full name or email address", type your TA's GitHub username (will be given at beginning of lab)
9. Click "Add collaborator"
8. Clone this repo to your local computer as per last week

Congratulations, you now have a private git repo which only you and the TA have access to!  Make a link to it on your local machine, just as you did lab #2 - feel free to look at last week's lab to refresh your memory.

We are going to add one file to this repo.  Remember to:

1. `git add` the file.
2. `git commit -a` to commit all files.
3. `git push origin master` to put them on your GitHub repo.

## Lab 3 - Why Java Is Not The Choice of Professional Philosophers

Zeno of Elea's _Dichotomy Paradox_ states that motion is impossible.  Let us assume that Paris is trying to run to Helen, who is standing still 10 meters away.  Paris must first go halfway to her (5 meters).  Then he must go halfway again (2.5 meters).  Then halfway again (1.25 meters).  Then halfway again... all the way to infinity.  Since nobody can move an infinite distance in a finite amount of time, Paris will never get to Helen (and presumably the Trojan War would never start).

However, if we lived in the world of Java, this may not be the case.  Using an appropriate loop, keep halving the distance (starting from 10 meters) until Paris and Helen are in the same spot (defined as the distance being equal to 0.0).  For output, print the number of steps it took to disprove Zeno.

You can do this with the simplest of all loops, a `while` loop.  A `while` loop will continue to execute the same group of statements (a block) or a single statement while a condition is true.  For example,

```java
int j = 0;
while (j < 10) {
    j++;
    System.out.println(j);
}
```

will print out the numbers 1 through 10.  Why is this?  Let's look at it line by line.  We declare a variable `j`, and assign it the value 0.  Then we get to the while loop.  Each time through the while loop, we check if the Boolean expression `j < 10` is true or false.  If it is true, then the loop is executed once, and then check the expression again.  You should be sure to do something - usually inside the loop - which will change some of the variables in the expression to ensure that eventually it is false and the loop will stop executing.

If the Boolean expression is _never_ true, then the loop will not execute at all!  Conversely, if it always true, such as the following, it will never _stop_ executing, thus making it an __infinite loop__.  Consider the following - only a slight change from our earlier example:

```java
int j = 0;
while (j < 10) {
   System.out.println(j);
}
```

Since `j` will _always_ be less than 10 (since it never changes from being 0), this loop will go on forever printing out "0".

Tips:
1. You may need multiple variables.
1. Watch out for infinite loops!  You may want to add some "debug" System.out.println() statements if the program seems to be running for a long time without actually achieving its purpose.
2. Question: What is the most appropriate primitive type for the distance?  Answer: Which of the primitive types is the most precise?

## Final Steps

1. Add the Java file to the git repo using `git add`
2. Commit and leave an appropriate commit message
4. Push to origin
5. Inform your TA

## Grading Rubric
* Worth: two points overall
  * _1 point_ - Created a repo and shared with TA
  * _1 point_ - Lab completed and answered

If you do not complete this by end of class, you may show your TA at the _beginning_ of lab next week for credit.