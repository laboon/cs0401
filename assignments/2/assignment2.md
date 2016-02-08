### CS 0401 Intermediate Programming  
Assignment 2 - Infinite Blackjack
Topics: Classes and Methods

ASSIGNMENT DATE: 1 FEB 2016 (MW class), 2 FEB 2016 (TH class)  
DUE DATE: 22 FEB 2016 (MW class), 23 FEB 2016 (TH class)  
LATE DUE DATE: 24 FEB 2016 (MW class), 25 FEB (TH class)  

The finite world of Blackjack can be so boring.  We're going to take it to infinity in this assignment.

The game should start with a user entering their name.  We will have a simple "game save" mechanism of writing the information of a user to a file.  If this is name of a user who already exists, then we should load their information from a file.  If the name does not exist, a new file should be created with that user's information.  At the beginning of each hand, you should ask if the player wants to continue playing, and if so, how much they would like to bet on this hand.  If the player does not want to play, the player's information should be saved to a file.

The game of Blackjack is relatively simple.  Players are dealt two cards.  The goal is to get closest to 21 points without going over.  Having 22 points or more means that you lose.  If the dealer has more points than you, you lose.  If you have more points than the dealer, you win.  If either you or the dealer goes over 21 points, that player loses.  If you have exactly 21 points with only two cards, you have a "blackjack", and win back your own money plus 1.5 times your bet.

At the beginning of the hand, the player can decide how much they would like to bet.  This can be anywhere from $0.01 to the amount of money they have on hand.  If they try to bet a negative amount or more than they have on hand, the system should not allow them to do so, and ask for a valid amount.

Points are determined in the following way:

1. Non-face cards (2, 3, 4, 5, 6, 7, 8, 9, or 10 of any suit) are worth as many points as the number on the card.  For example, a 2 of Clubs is worth 2 points, and a 8 of Diamonds is worth 8 points.  The suit does not make any difference when it comes to calculating the point total.
2. Face cards (Jack, Queen, or King of any suit) are worth 10 points.
3. An Ace can be worth either 1 points or 11 points, whichever is better for the current hand.

The player can do one of two things (actually, in a real game of Blackjack, there are several other options, but we are playing a simplified version of the game).  The first thing they can do is "stay" - that is, accept their current hand.  The second thing they can do is "hit" - accept another card.  If, at any point, the player's score goes over 21, the player automatically loses the round.

Once the player stays, the "house" (that is, the dealer) will turn over their cards.  The house player will follow a simple set of rules:

1. If the score is greater than 21, the house loses
1. Otherwise, if the score is greater than or equal to 18 but less than or equal to 21, the house will stay
2. If the score is exactly 17, and at least one card is an ace (a "soft" 17), the house will hit. If no cards are aces (a "hard" 17), the house will stay.
3. Otherwise, the house will hit

This can repeat for several iterations (e.g., the house has a 2 of Clubs and a 5 of Clubs (score = 7), hits and gets a 6 of Clubs (score = 13), hits and get a 2 of Diamonds (score = 15), and then hits and gets a 5 of Diamonds (score = 20).  Once the house stays, the hand is over.  The following possibilities should be coded for:

0. The player has a Blackjack (exactly 21 points from only two cards, e.g., an Ace and a King).  The player receives all of their money back, plus 1.5 times their bet.  For example, if the player bet 5 dollars, they would receive back $12.50 (original $5.00 + won $7.50).
1. The house has a higher score than the player.  In this case, the player loses.  All of the money bet by the player this hand is lost.
2. The player has a higher score than the house.  In this case, the player wins, and receives all of their money back, plus wins that exact same amount.  For example, if the player bet 5 dollars, they would receive back 10 dollars (original $5.00 + won $5.00).
3. The house and the player have equal hands.  This is called a "push", and the player does not lose or gain any money.

At each round of betting, the player has the option to (H)it or (S)tay.  If the player enters "H", "h", "Hit", or "hit", the player will hit.  If the player enters "S", "s", "Stay", or "stay", the player will stay.  The player always has the option to do either (even if they have 21 points!).  If the player goes over 21 points, however, they automatically lose that hand.  The dealer (house) should not do anything after that.

That comprises one hand of Blackjack.

At the beginning of each hand, the system should display the name of the user, the number of hands played, the number of blackjacks the user has has had, and the amount of money they have remaining, as in the following format:

```
Name:         Sammy
Total Hands:     10
Hands Won:        5
Money:       $50.00
```

All values shall be right-justified.

At the end of each hand, the amount of money won or lost, along with the result, should be displayed - one of the following:

1. Push
2. Dealer busted (went over 21 points)
3. Player busted (went over 21 points)
4. Player won
5. Dealer won
6. Blackjack 

Cards should be indicated by Value/Suit, according to the following chart:

1. Card values should be in uppercase (or numeric) and located in the first position
1. Numbers 2 through 9 should be printed as is 
1. A 10 should be printed as T, a J for a Jack, a Q for a Queen, a K for a King, and an A for an Ace
1. Suits should be in lowercase and located in the second position - s for Spades, d for Diamonds, c for Clubs, h for Hearts

Examples:

1. As - Ace of Spaces
2. 5d - Five of Diamonds
3. Tc - Ten of Clubs

Please see the sample_output.txt file to see exactly what the output should look like!

What makes the game "infinite" is that we assume that any card is possible to come up, instead of shuffling a deck.  So every time a card is generated, it can be of any possible suit and any possible card value.  All card values and suits should always be equally likely to come up (no card counters can work in our Infinite Casino)

Remember that quitting the program saves the current user's information.  The file should be a simple textfile of the format:

```
_money_
_number of hands played_
_number of hands won_
```

The file will be named `NAME.txt`, where `NAME` is equal to the username.  Assume that all names will be only one name with no spaces (so don't worry about saving "Joe Schmoe.txt").  Money will be a floating-point value, and the number of hands played and won will be integers.

If the file `NAME.txt` does not exist for a given name, then you can assume that the player's file does not exist and that it is a new player.  You can use the `File.exists()` method for this functionality.

Unlike the first assignment, input may not be of the appropriate type!  That is, the grader may enter "poodle" or "kwyjibo" for a floating-point value, or 7.3333 when you are expecting an integer.  For all inputs, any data of the wrong type can be considered an invalid value.

You will need to use methods and classes appropriately, as well as comment appropriately, for full credit.

### Implementation Details

You must use at least the following classes:

1. Player, which contains all player information
2. Card, which contains all of the information about a particular card
3. Blackjack, which contains the `main` method for the program

The Player class should contain information related to the player, including the current amount of money, number of hands played, and number of hands won.  It should include accessors and mutators for these three attributes.  It should also contain methods to load information from a file and to save the information to a file.

The Card class should contain information about the card value (2, 8, King, etc.) and suit (clubs, diamonds, etc.).  Upon instantation of a Card, both of these should be randomly generated using a Random object.  This Random object should be instantiated once - at the class level - and not each time that a Card object is instantiated (that is, do not assign the Random object in the constructor!  There should be accessors for both of these, as well as a `.toString()` method which will return a string following the display for cards mentioned above (e.g. Tc for Ten of Clubs).

The Blackjack class should be the main class of the program.  By running `java Blackjack`, I should be able to start the program up.  No other names for this main class are acceptable!

### Submission

You may use a subdirectory on the same repository as you used for Assignment 1, or create a new private repo and share it with me and the graders, by the time the program is due (see above).  Since you have already shared your previous repository with the graders for Assignment 1, it's usually better to just use a subdirectory.

Please include all source files (i.e., .java files) necessary for your program to compile and run. There should be no .class files, Eclipse-related files, etc. Remember you can use `git rm _filename_` to remove files from git, if you accidentally add some.

You will need to turn in a submission sheet with your assignment (see submission_sheet.md). Please fill out all the required sections. This should be printed out and turned in in class - do not add it to the GitHub repo.

Extra credit is up to the discretion of the professor, but will not be more than five points.  Be sure to mention what the extra credit is on the submission sheet! Some ideas for extra credit, in order from "least impressive" to "most impressive" (and thus more points) are:

1. Add a "bank" from which you can borrow money, then pay it back with interest.
1. Add the ability for more advanced Blackjack options, such as doubling down and insurance (you can look these up on Wikipedia or other sources).
1. Create a graphical user interface for the project
1. Other ideas?  Check with Prof. Laboon first to see if they are good candidates for extra credit.