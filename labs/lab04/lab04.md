# Lab 4 - Switch Statements, Static Methods, Morality and Needs

## Introduction

In this lab, we will study the ethical theory of utilitarianism and Maslow's Hierarchy of Needs, as well as switch statements and static methods.

## Set-Up

You can use the same private repo as used in Lab3 last week.  We will be making a separate file in this repo, Lab04.java.

## Lab 4a

Utilitarianism is the belief that the goal of a moral system should be causing the greatest amount of happiness for the greatest number of people.  This happiness is often abstracted into "utils" (one unit of "utility").  A "util" does not mean anything in itself, but can be used for comparison.  For example, if dancing tonight gives me 10 utils of happiness and my partner 5 utils, but doing homework only gives me 2 utils of happiness and my partner none, then I should go out dancing because that would increase the happiness of the world by 13 ((10 + 5) - (2 + 0)) utils compared to doing homework.  Of course, you may end up having fewer utils of happiness overall if you _never_ do your homework.

An action can also have negative utility, for one or more people.  For example, stealing candy from a baby gives me 1 util of happiness, but causes -5 utils of happiness for the baby.  If I develop a candy-stealing machine and steal candy from 100 babies, this action has caused (-5 * 100), or -500 utils.  I can only eat one piece of candy, so I still only receive 1 util from this action.  Since -500 + 1 = -499, I have caused a net decrease in the amount of happiness in the world.  We have mathematically proven that stealing candy from one hundred babies is not a moral action.

Although one of many different ethical theories, utilitarianism has the advantage of being computable.


1. Create a new Java program, Lab04.java, and add it to your repository.
2. Write a program to calculate whether somebody lived a morally good, neutral, or evil life.  For our purposes, any life which ends with a positive number of utils caused is morally good, a negative number morally evil, and exactly zero, morally neutral.
3. First ask for and store the person's name.
4. The program will now iterate, showing 4 options:
```
(1) - Buy people ice cream
(2) - Steal ice cream from people
(3) - Dream about people eating ice cream
(4) - Die
```
  1. If any of options 1 - 3 are chosen, ask how many people were impacted, then calculate and display the number of utils caused by this action.  For each person who has ice cream bought for them, they receive 3 utils.  For every person who has ice cream stolen from them, they receive -5 utils.  As dreaming about people eating ice cream has no effect, each person receives 0 utils for dreaming about them eating ice cream.  After the number of people has been entered, display the number of utils caused by this action and loop back to showing the menu.
  2. If option 4 is selected, the person's life is over.  Display the total number of utils caused by this person in their life.  Finally, display whether or not their life was morally good (a positive number of utils), morally evil (a negative number), or neutral (exactly 0).
  3. For our purposes, the only morally relevant actions in a person's life are related to ice cream.
5. You may assume that only valid input will be entered (no need for .hasNextInt() or similar checks).
6. You should use a switch statement when determining the number of utils based on the action.
7. You should use several different methods -
  1. At least one _function_ (accepts an argument, returns a value)
  2. At least one _function with multiple parameters_ (accepts multiple arguments, returns a value)
  3. At least one _procedure with no parameters_ (accepts no arguments, returns no value)

### Sample Output
```
(624) $ javac Lab4a.java ; java Lab4a
Enter name > Foo
(1) - Buy people ice cream
(2) - Steal ice cream from people
(3) - Dream about people eating ice cream
(4) - Die
Enter next action of Foo > 1
How many people? > 10
This action caused 30 utils of happiness.
(1) - Buy people ice cream
(2) - Steal ice cream from people
(3) - Dream about people eating ice cream
(4) - Die
Enter next action of Foo > 2
How many people? > 1
This action caused -5 utils of happiness.
(1) - Buy people ice cream
(2) - Steal ice cream from people
(3) - Dream about people eating ice cream
(4) - Die
Enter next action of Foo > 3
How many people? > 5
This action caused 0 utils of happiness.
(1) - Buy people ice cream
(2) - Steal ice cream from people
(3) - Dream about people eating ice cream
(4) - Die
Enter next action of Foo > 4
Foo caused 25 utils of happiness.
This was a morally good life.
```

```
(625) $ javac Lab4a.java ; java Lab4a
Enter name > Bar
(1) - Buy people ice cream
(2) - Steal ice cream from people
(3) - Dream about people eating ice cream
(4) - Die
Enter next action of Bar > 3
How many people? > 10000
This action caused 0 utils of happiness.
(1) - Buy people ice cream
(2) - Steal ice cream from people
(3) - Dream about people eating ice cream
(4) - Die
Enter next action of Bar > 4
Bar caused 0 utils of happiness.
This was a morally neutral life. 
```

## Lab 4b

In his paper "A Theory of Human Motivation", Abraham Maslow speculated that humans have a hierarchy of needs.  That is, certain "lower level" needs must be met before "higher level" ones can be met.  For instance, if you lack oxygen (a lower level need), you will not be worried about your self-esteem (a higher level need).  If you do have self-esteem, on the other hand, then you most likely have enough oxygen.  Thus, having a higher level need implies that you have all of the lower-level needs met.

Write a program which accepts an integer corresponding to the current level of the person.  The levels are:

```
5. Self-actualization (achieving your total potential)
4. Esteem (e.g., respect from others, self-respect)
3. Love and Belonging (e.g., friendship and family)
2. Safety (e.g., personal and financial security)
1. Physiological (e.g., oxygen, food, water)
```

Using a _single_ `switch` statement, print out all of the levels of need that a person has met based on the level ( 1 - 5 ) that is currently being met.  For example:

```
(626) $ javac Lab4b.java ; java Lab4b
Level > 4
Esteem
Love and Belonging
Safety
Physiological
```

or

```
(627) $ javac Lab4b.java ; java Lab4b
Level > 2
Safety
Physiological
```

You may assume that a valid integer (1 through 5) will be passed in as input.

## Grading

This lab is not graded.
