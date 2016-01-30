### CS 0401 Intermediate Programming  
Assignment 1  
Topics: Review of expressions, conditions, loops and I/O

ASSIGNMENT DATE: 13 JAN 2016 (MW class), 14 JAN 2016 (TH class)  
DUE DATE: 1 FEB 2016 (MW class), 2 FEB 2016 (TH class)  
LATE DUE DATE: 3 FEB 2016 (MW class), 4 FEB (TH class)  

PLEASE SHARE YOUR REPOSITORY WITH THE FOLLOWING GITHUB USERNAMES:

1. laboon (Prof. Laboon)
2. jbriand12 (Briand)
3. nineilpitt (Nils)
4.  (Samanvoy)

You have opened a bookstore, and have decided to write your own point-of-sale system to sell books.  You sell several items:

1. Books ($5.00 each)
2. Bookmarks ($1.00 each, or a pack of six for $5.00)
3. Paintings of Books ($100.00 each)

Customers can purchase any number of each item.  However, if a customer purchases bookmarks, it will always give them packs if possible, thus allowing for a cheaper price.  For example, if somebody buys 3 bookmarks, they will not buy a pack - it will cost them $3.00.  However, if they buy 7, then they will automatically get one pack and one extra bookmark, for a total cost of $5.00 + $1.00 = $6.00 - _not_ $7.00.

We will assume that you are operating the bookstore in Oakland, so you will need to add 7% additional tax (Pennsylvania and Allegheny County taxes) on all sales.  For example, if somebody buys one book at $5.00, then the total cost should be $5.00 + $0.35 in tax, or $5.35.

All values should be rounded to the nearest cent.

Additionally, in order to attract business, you are running a promotion: every third customer will get 10% off their order (before tax).  This will start with the third customer; the first customer will not get a discount, the second customer will not get a discount, but the third one, sixth one, ninth one, etc. will.  For example, if the third customer buys a book, they would get $0.50 off (10% of $5.00), for a total of $4.50, and then tax would be added ($4.185, which would be rounded to $4.82).

If the customer does not get a discount, then along with the receipt, the message "You did not get a discount! Better luck next time!"  If the customer does get a discount, display the discount amount and the message "You won a 10% discount!"

You will write a Java program that runs a point-of-sale service for your bookstore.  The program should do the following:

1. Ask if another customer is waiting in line, and have the user enter an integer - 1 for yes and 2 for no.
2. If no customers are waiting in line, exit the program.
3. Show the customer a menu which has all items and their prices listed, as well as options to show the current order and check out.  Customers should be able to modify their order (for example, if they accidentally enter that they want to purchase four books, then put one back, they should be able to modify that to three books).
4. Showing the current order should show how many of each item the customer is going to purchase.
5. Checking out will consist of showing a tabulated receipt with how many of each item was purchased.  If an item was not purchased, it should not display (so there should be no "Books: 0   $0.00" lines.  If the "Third Customer Discount" was applied, it should show that as a separate (before tax) line.  It should include a subtotal (before tax), and then a total (after tax).
6. Finally, ask the user to pay for it.  The system should accept a floating-point number from the user.  If it is less than the cost of the customer's purchase, the system should print "Not enough money - please re-enter" and ask again.  The system should continue to do this until a valid amount of money (the cost of the total or greater) is entered.  Once a valid amount of money is entered, indicate the change given (for example, if the purchase is $96.50 and the customer gives $100.00, show that the change should be $3.50).

Sample output will be put in the file sample_output.txt (in this directory) and grading will be based on the rubric listed at official_rubric.md (also in this directory).

Tips:

1. You will need to use variables of different types!  You may experience some minor floating-point issues; this is why many official Java apps will use a special Currency data type, but we will not deal with that at this point.
2. You will use nested loops - loops within loops.  Don't be afraid of these, but remember that if you are using a `for` loop, you will need to use a different index variable name.
3. Code should be "good".  By this admittedly somewhat subjective metric, I mean:
  1. Variable names should indicate what they are storing.  While it is perfectly valid Java to have a variable `int schmeckle` which stores the number of books bought, it does not give information
  2. Code should be understandable and commented.  Add comments explaining in English what the code is doing.  If you have any question on what is enough commenting, feel free to ask me or look at the `Variables.java` file in the `sample_code` directory.  Be sure to explain what is happening at a higher abstraction, don't just say what the code is doing - for example, do not comment `x = x + 2` with the comment `// Add 2 to x variable`.  This does not tell the reader anything about what the code is doing or why.  Definitely include your name, course number, and what the project should do at the beginning of the Java file.
  3. Use the `Scanner` class for inputting data.  There are other methods, but only use this one for this assignment.
  4. Output should be nicely formatted.  Money values should be printed using the American standard, with a `$` in front, and rounded to nearest cent (1 / 100th of a dollar).  For example, `$1.17`, not `1.17`, `$1.17000000000`, and definitely not `1`.
  5. Code should be indented properly:

THIS:
```java
public int doSomething(int a) {
    if (a > 0) {
       a = a + 3;
    }
    return a;
}
```

**NOT**

```java
public
int doSomething(int
a) {
    if (a > 0) { a =
a + 3;    } return
a;
}
```

The latter will compile, but this is harder to read and not good coding style.

### Submission

Create a private repo and share it with me and the graders, by the time the program is due (see above).

If you do not yet have the ability to make a private repo (because your student pack has not yet come in, for example), please hold off on pushing to GitHub. You may want to work on the project, then copy it into a repo later.

Please include all source files (i.e., .java files) necessary for your program to compile and run. There should be no .class files, Eclipse-related files, etc. Remember you can use git rm _filename_ to remove files from git, if you accidentally add some.

You will need to turn in a submission sheet with your assignment (see submission_sheet.md). Please fill out all the required sections. This should be printed out and turned in in class - do not add it to the GitHub repo.

Extra credit is up to the discretion of the grader, but will not be more than five points.  Be sure to mention what the extra credit is on the submission sheet! Some ideas for extra credit, in order from "least impressive" to "most impressive" (and thus more points) are:

1. Add a "Bookworm Card" which will allow you to get an additional 25% off of all books.
2. Add the ability to personalize a book for an additional $1.00.  This would mean having the user enter a message (as a String), and listing that book separately for the receipt.
3. Add the ability to have an inventory - an internal listing of what books are available (for example, 5 copies of _Infinite Jest_ and 3 copies of _The Broom of the System_, allowing the user to select individual books, but not allowing users to purchase a book if there are no copies available).
4. Make that inventory persistent by writing to a file.
5. Other ideas?  Check with Prof. Laboon first to see if they are good candidates for extra credit.