## Lab 11

### Dungeons and Dragons and Objects

## Introduction

_“Fairy tales are more than true: not because they tell us that dragons exist, but because they tell us that dragons can be beaten.”_   
   ― Neil Gaiman, _Coraline_  

The townsfolk of Javania have been living in dread for years, as a powerful dragon has moved into a cave nearby.  Along with its Goblin and Troll minions, it has lain waste to the surrounding area, destroying the livelihoods of many, and plunging the region into a deep economic depression.

Using your arcane knowledge of the obscure branch of Magick known as "object-oriented programming", you can defeat this scourge!

## Setup

You may use the same private repo as used in the lab last week.  You may want to put the files this week under a special "Lab11" subdirectory, as we will be creating several Java files.  Remember to add, commit, and push them to your repository!

## Instructions

You will need to create several classes: Player, Monster, Hoard, Goblin, Troll, and Dragon.  Goblins, Trolls, and Dragons are all subclasses of class Monster.

At each iteration, the Player will face a randomly selected Monster, chosen by taking a random integer from 0 to 10.  If the integer is 0, 1, 2, 3, or 4, the Player will encounter a Goblin.  If a 5, 6, 7 or 8, a Troll.  Finally, if a 9 or 10 is selected, the Player will encounter the Dragon.

The Player starts the game with 100 Hit Points and 3 Magic Points.  These should be properties (attributes) of the Player.

During each encounter, the Player has several options:
1. (R)un away - The player leaves the encounter, but the Monster gets one free attack.
2. (A)ttack - The player attacks the monster while still maintaining a defense, causing a random number of hit points damage (between 1 and 15).
3. (B)erserk - The player attacks the monster while ignoring their own defense, causing triple damages (1 to 15, multiplied by 3) to the monster, but causing double damage to be done by the Monster to the Player.
4. (M)agic - The player casts a Magic Heal Spell.  This reduces the number of Magic Points by one.  The Magic Heal Spell resets the Player's Hit Points to 100.  However, the monster has a free attack. 

Monsters will only ever attack.  A Goblin has 10 Hit Points and causes between 1 and 5 points of damage; a Troll has 30 Hit Points and causes between 1 and 10 points of damage; a Dragon has 100 Hit Points and causes between 1 and 20 points of damage.  The same method name should be called for each of these monsters to attack.

All Monsters have a Hoard of gold (if there's one thing I learned from role-playing games, it is that monsters are *always* hoarding gold).  This Hoard is a separate class, which consists only of a random number of gold pieces (between 1 and 100).

Encounters will continue until either the Player has 0 or fewer Hit Points, or when the Player defeats the Dragon.  After defeating the Dragon, the game will display statistics: specifically, how many gold pieces were collected (this should be stored in the Player class), and how many Goblins, Trolls, and Dragons were defeated (this information should be stored in their respective classes).  If the Player did not defeat the Dragon, there is no need to display the statistics.

This should all be done in proper object-oriented style; you should have a Player class, a Monster class, a Hoard class, and the three subclasses of Monster (Goblin, Troll, and Dragon).

When subclassing, methods in the subclass override methods in the superclass.  However, you can call them on a superclass reference that actually contains a subclass.  For example, if you have the following:

```java
Monster m = new Dragon();
m.attack();
```

It will call the attack method in the Dragon class, not the one in the Monster class.  This is an example of polymorphism, as discussed in class.  These attacks should cause different amounts of damage (as explained above).  

## Example Code

See Monster.java and Goblin.java in the Lab11 directory.  These can be good templates for your Monster and Goblin classes.  Note that you use the `extends` keyword to show that something is a subclass (e.g., Goblin is a subclass of Monster).

## Sample Output

See sample_output.md for several sample runs of the program.

## Tips
1. Remember the difference between static and instance variables.
2. Methods are overridden when subclassing, but variables are not.  Be sure to set values you want for specific kinds of monsters in their constructors!
3. We can use a generic Monster reference to call the same method, but by creating different kinds of Monsters (Dragons, Trolls, etc.), we can use the same technique (e.g. attack or berserk) with different kinds of monsters without repeating ourselves too much.

## Extending the Game
You may want to add different kinds of monsters, allow regeneration of Hit Points or Magic Points, or allow more kinds of attacks.  How about adding some different kinds of interfaces, such as Attackable or Healable?  The world is your oyster!

## To Think About..

Perhaps there was a better way to deal with the Dragon than simply attacking all of its minions and itself.  Games are often two-dimensional and ignore subtleties in life.  Alas, this lab was no different.  Perhaps one day, Dragons and Humans can live together in harmony.

## Grading Rubric
1 point - Proper Goblin, Dragon, Troll classes
1 point - Game can be played (incl. Magic, Attack, Berserk, Run) and won