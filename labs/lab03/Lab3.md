# Lab 2 - Git Private Repos, Nested Loops, and Floating-Point Issues

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
4. Give it the name Lab3
5. Click on the "Private" radio box.
  * NOTE: If you don't see this, your Student Developer pack may not have come through.  Let your TA know when turning it that this is the case.
6. Click on the option to initialize the repository with a README
7. In the right-hand column, click on Settings (it has a little "gear" icon next to it)
8. Click on "Collaborators" (in the left-hand column)
9. In the textbox labeled "Search by username, full name or email address", type your TA's GitHub username (will be given at beginning of lab)
9. Click "Add collaborator"
8. Clone this repo to your local computer as per last week

Congratulations, you now have a private git repo which only you and the TA have access to!  Make a link to it on your local machine, just as you did lab #2 - feel free to look at last week's lab to refresh your memory.

We are going to add two files to this repo.  Remember to:

1. `git add` both files.
2. `git commit -a` to commit all files.
3. `git push origin master` to put them on your GitHub repo.

## Lab 3a - Why Java Is Not The Choice of Professional Philosophers

Zeno of Elea's _Dichotomy Paradox_ states that motion is impossible.  Let us assume that Paris is trying to run to Helen, who is standing still 10 meters away.  Paris must first go halfway to her (5 meters).  Then he must go halfway again (2.5 meters).  Then halfway again (1.25 meters).  Then halfway again... all the way to infinity.  Since nobody can move an infinite distance in a finite amount of time, Paris will never get to Helen (and presumably the Trojan War would never start).

However, if we lived in the world of Java, this may not be the case.  Using an appropriate loop, keep halving the distance (starting from 10 meters) until Paris and Helen are in the same spot (defined as the distance being equal to 0.0).  For output, print the number of steps it took to disprove Zeno.

Tips:
1. You will need multiple variables.
2. What is the most appropriate primitive type for the distance?  Which of the primitive types is the most precise?

## Lab 3b - _n_ Bottles of Root Beer, Where _n_ > 98 && _n_ < 100

In this section, we will represent the famous song, "99 Bottles of Root Beer".  First, we will ask the user to enter a number from 1 to 99 (inclusive).  If the value entered is _not_ an integer, inform the user that they need to enter an integer.  If the entered integer is not greater than 0 and less than 100, inform the user that the integer needs to be greater than 0 and less than 100.

```
Enter number bottles of root beer on wall > kitten
Enter an integer!
Enter number bottles of root beer on wall > 9999
Num must be > 0 and < 100 !
Enter number bottles of root beer on wall > 5
```

After this, for each "round" of the song, print out that many R's to the screen.  Once there are no more bottles of root beer, print out this fact.  This should look like a right triangle on the screen, for example:

```
Enter number bottles of root beer on wall > 5
RRRRR
RRRR
RRR
RR
R
NO MORE BOTTLES OF ROOT BEER ON THE WALL!
```

Tips:
0. To avoid run-time errors, remember to use the .hasNext() methods.
1. If an invalid value is entered, you should "clear" the Scanner by just getting the `.next()` value and not doing anything with it.  That is, each iteration of the loop should get some value from the Scanner, even if you are not going to use it.
2. You will need to have a nested loop.
3. Remember that the expressions in a for loop can be as complex as you need them to be.

## Final Steps

1. Add the two Java files to the git repo
2. Commit and leave an appropriate commit message
4. Push to origin
5. Inform your TA

## Grading Rubric
* Worth: two points overall
  * _1 point_ - Created a repo and shared with TA
  * _0.5 point_ - Lab 3a
  * _0.5 point_ - Lab 3b

If you do not complete this by end of class, you may show your TA at the _beginning_ of lab next week for credit.