// This is a potential solution for Assignment 1

import java.util.Scanner;

public class Assignment1 {

    // Execution starts here
    
    public static void main(String[] args) {

	// Represents if there are more customers in line or not
	
	boolean moreCustomers = true;

	// The customer number.  Used for determining the customer
	// discount for every third customer.
	
	int customerNum = 0;
	
	Scanner sc = new Scanner(System.in);

	// Loop while there are more customers
	
	while (moreCustomers) {

	    // Set up local variables - used only in customer loop
	    // Put in here so they aren't kept from customer to customer -
	    // they will reset every time the loop ends
	    
	    int moreCustomersInput = 0; // Are there more customers?
	    int mainInput = 0; // Menu selection value
	    int numBooks = 0; // Number of books for customer
	    int numBookmarks = 0; // Number of bookmarks for customer
	    int numPaintings = 0; // Number of paintings for customer 
	    boolean notCheckedOut = true; // Whether or not customer is checked out

	    // Check to see if another customer is in line.  If an invalid
	    // input is given, loop around until it is valid (1 or 2)
	    
	    moreCustomersInput = 0;
	    while (moreCustomersInput != 1 && moreCustomersInput != 2) {
		System.out.print("More customers in line? (1 = Yes, 2 = No) ");
		moreCustomersInput = sc.nextInt();
	    }

	    // If no more customers, close the shop (exit program).
	    
	    if (moreCustomersInput == 2) {
		System.out.println("No more customers! Closing!");
		System.exit(0);
	    }

	    // Increment the customer number, since we have a new one
	    
	    customerNum++;

	    // Keep looping until the customer checks out.

	    notCheckedOut = true;
	    
	    while (notCheckedOut) {

		// Print main menu
		
		System.out.println("1 - Buy Books - $5.00 each");
		System.out.println("2 - Buy Bookmarks - $1.00 each, $5.00 for a six-pack");
		System.out.println("3 - Buy Paintings of Books - $100.00 each");
		System.out.println("4 - See current order");
		System.out.println("5 - Checkout");
		mainInput = 0;

		// Get menu option.  Loop until valid input is given.
		
		while (mainInput < 1 || mainInput > 5) {
		    System.out.print("Please enter a valid option (1 through 5) > ");
		    mainInput = sc.nextInt();
		}

		// Buy books (Option 1)
		
		if (mainInput == 1) {
		    System.out.println("Currently in cart: " + numBooks + " books.");
		    System.out.print("How many do you want to buy? > ");

		    // Loop until a valid number of books given
		    
		    do {
			numBooks = sc.nextInt();
			if (numBooks < 0) {
			    System.out.println("Enter a valid number of books - 0 or more");
			}
		    } while (numBooks < 0);		    
		} else if (mainInput == 2) {

		    // Buy bookmarks
		    
		    System.out.println("Currently in cart: " + numBookmarks + " bookmarks.");
		    System.out.print("How many do you want to buy? > ");

		    // Loop until a valid number is given
		    
		    do {
			numBookmarks = sc.nextInt();
			if (numBookmarks < 0) {
			    System.out.println("Enter a valid number of bookmarks - 0 or more");
			}
		    } while (numBookmarks < 0);
		} else if (mainInput == 3) {
		    // Buy paintings
		    
		    System.out.println("Currently in cart: " + numPaintings + " paintings.");
		    System.out.print("How many do you want to buy? > ");

		    // Loop until a valid number is given
		    
		    do {
			numPaintings = sc.nextInt();
			if (numPaintings < 0) {
			    System.out.println("Enter a valid number of paintings - 0 or more");
			}
		    } while (numPaintings < 0);
		} else if (mainInput == 4) {
		    // Display current contents of cart
		    System.out.println("Currently in cart: ");
		    System.out.println("Books: " + numBooks);
		    System.out.println("Bookmarks: " + numBookmarks);
		    System.out.println("Paintings of books: " + numPaintings);
		} else if (mainInput == 5) {
		    // Otherwise, check out.  This will end the main loop.
		    notCheckedOut = false;
		}
	    }

	    // First ensure that they actually bought something.  If not,
	    // just move on to the next customer.
	    
	    if (numBooks == 0 && numBookmarks == 0 && numPaintings == 0) {
		System.out.println("Not buying anything? Have a nice day!");
	    } else {
		
		// Otherwise, prepare receipt.
		// Variables for receipt calculation
		
		double booksPrice = 0.0; // price of books
		double bookmarkPacksPrice = 0.0; // price of bookmark packs
		double singleBookmarksPrice = 0.0; // price of single bookmarks
		int numBookmarkPacks = 0; // number of bookmark packs
		int numSingleBookmarks = 0; // number of single bookmarks
		double paintingsPrice = 0.0; // price of paintings
		boolean thirdCustomer = false; // whether or not 3rd customer
		double subtotal = 0.0; // subtotal of receipt
		double total = 0.0; // total cost of order
		double amountSaved = 0.0;
		double tax = 0;
	    
		// Calculate bookmark packs and singles
		numBookmarkPacks = numBookmarks / 6;
		numSingleBookmarks = numBookmarks % 6;
	    
		// Print out receipt
		System.out.println("--------------------------------------");

		// Check if customer is third customer; if so, give discount
		
		if (customerNum % 3 == 0) {
		    thirdCustomer = true;
		    System.out.println("You won a 10% discount!");
		} else {
		    System.out.println("You did not get a discount! Better luck next time!");
		}

		// Calculate prices of individual items
		
		booksPrice = numBooks * 5.00;
		bookmarkPacksPrice = numBookmarkPacks * 5.00;
		singleBookmarksPrice = numSingleBookmarks * 1.00;
		paintingsPrice = numPaintings * 100.00;
		
		// Calculate subtotal (price of everything).
		// If they won the third-customer discount, also calculate
		// discount.

		subtotal = booksPrice
		    + bookmarkPacksPrice
		    + singleBookmarksPrice
		    + paintingsPrice;
		if (thirdCustomer) {
		    amountSaved = subtotal * 0.1;
		    subtotal -= amountSaved;
		}

		// Calculate tax on subtotal for total
		tax = subtotal * 0.07;
		total = subtotal + tax;

		// Print out individual receipt elements.
		// For each, if number of items is 0, do not print out
		// that line.
		
		if (numBooks > 0) {
		    System.out.printf("%5d Book(s):                $%.2f\n", numBooks, booksPrice);
		}
		if (numBookmarkPacks > 0) {
		    System.out.printf("%5d Bookmark Pack(s):       $%.2f\n", numBookmarkPacks, bookmarkPacksPrice);
		}
		
		if (numSingleBookmarks > 0) {
		    System.out.printf("%5d Single Bookmark(s):     $%.2f\n", numSingleBookmarks, singleBookmarksPrice);
		}
		
		if (numPaintings > 0) {
		    System.out.printf("%5d Painting(s):            $%.2f\n", numPaintings, paintingsPrice);
		}
		if (thirdCustomer) {
		    System.out.printf("Discount! Saved:             -$%.2f\n", amountSaved);
		}
		System.out.printf("\nSubtotal:                     $%.2f\n", subtotal);
		System.out.printf("Tax:                          $%.2f\n", tax);
		System.out.printf("\nTotal:                        $%.2f\n", total);
		System.out.println();
		System.out.println("--------------------------------------");

		// Get payment information.  Loop until valid (> cost)
		// value given.
		
		System.out.print("\nEnter amount paid (no dollar sign) > ");
		double paidCash = sc.nextDouble();
		while (paidCash < total) {
		    System.out.println("Not enough money, please re-enter.");
		    System.out.print("Enter amount paid (no dollar sign) > ");
		    paidCash = sc.nextDouble();
		}

		// Calculate and give change.
		
		double change = paidCash - total;
		System.out.printf("\nYour change is: $%.2f\n", change);
	    
		System.out.println("Thanks for shopping!");
	    }
	}
    }
}
