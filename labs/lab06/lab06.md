# Lab 5 - Excuse Me, I Believe You Have My Stapler

## Introduction

In this lab, we are going to create a game, Office Quest.  Office Quest simulates the thrilling life of an office worker (or should I say.. Office _Warrior_).  Delivery people come by once every twenty minutes, sometimes with papers to collate, but sometimes with more tape or even more staples.  The office worker's job is to survive eight hours without running out of tape or staples!

You will simulate the life of this office worker using multiple classes to represent objects, specifically the Office Worker's Tape Dispenser and a Stapler.

## Set-Up

You can use the same private repo as always.  We will be making three separate files in this repo, OfficeQuest.java, Stapler.java, and TapeDispenser.java.

## Lab 5 Directions

In this game, the player has a Tape Dispenser (create an object from the class) and a Stapler (ditto).  The Stapler starts with 10 staples and the Tape Dispenser starts with 50 inches of tape.  When papers require collating, the player can choose to either [S]taple them together by typing "S" (without the quotes) or [T]ape them together by typing "T" (without the quotes).  Other input should be ignored - keep asking whether they would like [S]taple or [T]ape the papers.

At each turn, which represents 20 minutes, a delivery person comes by with one of three items:

1. 10 more staples for the Stapler.  This will be _added_ to the number of staples already in the Stapler; for example, if a stapler has 5 staples, then receiving more staples means that the person will have 15 staples.  There is no upper bound for the number of staples allowed in the Stapler.
2. A refill of the tape in the Tape Dispenser.  This will _reset_ the amount of tape to 50 inches, no matter how much tape was originally in the tape dispenser.
3. A group of papers to collate.  There will be a random number (from 1 to 60) of pages.

At each turn, you should start by printing out the turn number, and what the status of the Stapler and Tape Dispenser are.  Just like real life, we won't count exactly how many inches of tape are left or how many staples are in the stapler, but we will give an approximation.  However, internally in the objects, the actual values will be stored as an instance variable.  This is a good example of why we do not always want to provide direct access to a variable; here the only information we want objects outside this class to know about will be presented by an instance method.

For the Tape Dispenser, have a method which displays the approximate amount of tape left, per the following instructions:

1. If the number of inches of tape left is 45 or over, say that the Tape Dispenser looks full.
2. If it is 35 or over, but less than 45, say that it is almost full.
3. If it is 15 or over, but less than 35, say that is is about halfway full.
4. If it is greater than 0, but less than 15, say that it is almost empty.
5. If it is exactly 0, say that it is empty.

For the Stapler, have a method which displays the approximate weight of the stapler (let's assume they are heavy staples).

1. If it has more than 10 staples, say that it feels really heavy.
2. If it has more than five staples, up to 10 staples, say that it feels heavy.
3. If it has more than zero staples, say it feels light.
4. If it has exactly zero staples, say it feels really light.

The Tape Dispenser and Stapler should have methods that fill them up.  They will be called when the delivery person delivers staples of tape.  For the Tape Dispenser, refilling will always bring the number of inches of tape back to 50.  However, when adding staples, it will add 10 staples to the current number existing.

During each turn, there should be a 5% chance that the delivery person comes by with staples, a 5% chance that they come by with tape, and a 90% chance that they will have papers for you to collate.  Any of these events will take up 20 minutes (= 1 turn), and no user response is necessary.  However, if there are papers to collate, then the user should be prompted on whether they want to [S]taple or [T]ape them.

Taping takes up 0.25" of tape per page, and stapling takes up 1 staple up to 50 pages.  However, if the number of pages is over 50 and the person staples it, the stapler will jam, and that turn will take up 3 staples.  

There should be a `tape` method on the Tape Dispenser and a `staple` method on stapler.  Calling either should update the amount of tape left or staples remaining, respectively, in their objects.  A boolean value should be returned stating whether or not the user has tried to use more staples or tape than they have. 

If at any point, a player tries to use more tape or staples than they have, the game should end, and the player informed that they have lost at Office Quest.  Otherwise, the game continues until 24 turns have been completed.

At the end of each round, the amount of time remaining (in hours and minutes) should be displayed (see sample output, below).

### Sample Output

Losing Game:

```
(3334) $ java OfficeQuest
OFFICE QUEST
Turn Number: 0
The stapler feels... heavy.
The tape dispenser looks... full.
The delivery person dropped off 44 pages to collate!
[T]ape or [S]taple > foo
[T]ape or [S]taple > -19
[T]ape or [S]taple > T
7 hour(s) and 40 minutes to go...
Turn Number: 1
The stapler feels... heavy.
The tape dispenser looks... almost full.
The delivery person dropped off 3 pages to collate!
[T]ape or [S]taple > T
7 hour(s) and 20 minutes to go...
Turn Number: 2
The delivery person came by with more staples!
7 hour(s) and 0 minutes to go...
Turn Number: 3
The stapler feels... really heavy.
The tape dispenser looks... almost full.
The delivery person dropped off 10 pages to collate!
[T]ape or [S]taple > T
6 hour(s) and 40 minutes to go...
Turn Number: 4
The stapler feels... really heavy.
The tape dispenser looks... almost full.
The delivery person dropped off 11 pages to collate!
[T]ape or [S]taple > T
6 hour(s) and 20 minutes to go...
Turn Number: 5
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 55 pages to collate!
[T]ape or [S]taple > T
6 hour(s) and 0 minutes to go...
Turn Number: 6
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 4 pages to collate!
[T]ape or [S]taple > T
5 hour(s) and 40 minutes to go...
Turn Number: 7
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 8 pages to collate!
[T]ape or [S]taple > T
5 hour(s) and 20 minutes to go...
Turn Number: 8
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 43 pages to collate!
[T]ape or [S]taple > T
5 hour(s) and 0 minutes to go...
Turn Number: 9
The stapler feels... really heavy.
The tape dispenser looks... almost empty.
The delivery person dropped off 54 pages to collate!
[T]ape or [S]taple > T
You have run out of tape!
You could not survive the ordeal of the OFFICE QUEST.
```

Winning Game

```
(3337) $ java OfficeQuest
OFFICE QUEST
Turn Number: 0
The stapler feels... heavy.
The tape dispenser looks... full.
The delivery person dropped off 50 pages to collate!
[T]ape or [S]taple > S
7 hour(s) and 40 minutes to go...
Turn Number: 1
The delivery person came by with more staples!
7 hour(s) and 20 minutes to go...
Turn Number: 2
The stapler feels... really heavy.
The tape dispenser looks... full.
The delivery person dropped off 22 pages to collate!
[T]ape or [S]taple > S
7 hour(s) and 0 minutes to go...
Turn Number: 3
The stapler feels... really heavy.
The tape dispenser looks... full.
The delivery person dropped off 38 pages to collate!
[T]ape or [S]taple > S
6 hour(s) and 40 minutes to go...
Turn Number: 4
The stapler feels... really heavy.
The tape dispenser looks... full.
The delivery person dropped off 5 pages to collate!
[T]ape or [S]taple > T
6 hour(s) and 20 minutes to go...
Turn Number: 5
The stapler feels... really heavy.
The tape dispenser looks... full.
The delivery person dropped off 55 pages to collate!
[T]ape or [S]taple > S
Stapler jammed!
6 hour(s) and 0 minutes to go...
Turn Number: 6
The stapler feels... really heavy.
The tape dispenser looks... full.
The delivery person dropped off 51 pages to collate!
[T]ape or [S]taple > S
Stapler jammed!
5 hour(s) and 40 minutes to go...
Turn Number: 7
The stapler feels... really heavy.
The tape dispenser looks... full.
The delivery person dropped off 15 pages to collate!
[T]ape or [S]taple > T
5 hour(s) and 20 minutes to go...
Turn Number: 8
The stapler feels... really heavy.
The tape dispenser looks... full.
The delivery person dropped off 59 pages to collate!
[T]ape or [S]taple > S
Stapler jammed!
5 hour(s) and 0 minutes to go...
Turn Number: 9
The stapler feels... heavy.
The tape dispenser looks... full.
The delivery person dropped off 1 pages to collate!
[T]ape or [S]taple > T
4 hour(s) and 40 minutes to go...
Turn Number: 10
The stapler feels... heavy.
The tape dispenser looks... almost full.
The delivery person dropped off 56 pages to collate!
[T]ape or [S]taple > T
4 hour(s) and 20 minutes to go...
Turn Number: 11
The stapler feels... heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 3 pages to collate!
[T]ape or [S]taple > T
4 hour(s) and 0 minutes to go...
Turn Number: 12
The stapler feels... heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 10 pages to collate!
[T]ape or [S]taple > T
3 hour(s) and 40 minutes to go...
Turn Number: 13
The stapler feels... heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 25 pages to collate!
[T]ape or [S]taple > S
3 hour(s) and 20 minutes to go...
Turn Number: 14
The delivery person came by with more staples!
3 hour(s) and 0 minutes to go...
Turn Number: 15
The delivery person came by with more staples!
2 hour(s) and 40 minutes to go...
Turn Number: 16
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 24 pages to collate!
[T]ape or [S]taple > S
2 hour(s) and 20 minutes to go...
Turn Number: 17
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 38 pages to collate!
[T]ape or [S]taple > S
2 hour(s) and 0 minutes to go...
Turn Number: 18
The delivery person came by with more staples!
1 hour(s) and 40 minutes to go...
Turn Number: 19
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 56 pages to collate!
[T]ape or [S]taple > S
Stapler jammed!
1 hour(s) and 20 minutes to go...
Turn Number: 20
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 13 pages to collate!
[T]ape or [S]taple > S
1 hour(s) and 0 minutes to go...
Turn Number: 21
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 42 pages to collate!
[T]ape or [S]taple > S
0 hour(s) and 40 minutes to go...
Turn Number: 22
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 57 pages to collate!
[T]ape or [S]taple > S
Stapler jammed!
0 hour(s) and 20 minutes to go...
Turn Number: 23
The stapler feels... really heavy.
The tape dispenser looks... about halfway full.
The delivery person dropped off 49 pages to collate!
[T]ape or [S]taple > S
Congratulations, the day is done.  You survived your OFFICE QUEST.
```

## Grading

1 point - TapeDispenser and Stapler classes work correct (can dispense or staple / refill)
1 point - Game works entirely correctly
