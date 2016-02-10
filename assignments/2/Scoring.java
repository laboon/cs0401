public class Scoring {
    public static void main(String[] args) {
	// 20 points, no aces (e.g. Kh + Ts)
	System.out.println("Should be 20: " + getScore(20, 0));

	// 21 points, 1 ace (e.g. Ks + As)
	System.out.println("Should be 21: " + getScore(21, 1));

	// 15 points, no aces (e.g. Ts + 5s)
	System.out.println("Should be 15: " + getScore(15, 0));

	// 31 points, 2 aces (e.g. Ks + Td + As)
	System.out.println("Should be 21: " + getScore(31, 2));

	// 31 points, 2 aces (e.g. Ad + Ah + 9d)
	System.out.println("Should be 21: " + getScore(31, 2));

	// 5 points, 1 ace (e.g. 4s + As)
	System.out.println("Should be  5:  " + getScore(5, 1));

	// 42 points, 2 ace (e.g. Ks + Kd + As + Ah)
	System.out.println("Should be 22: " + getScore(42, 2));

	// 21 points, 4 aces (e.g. Ks + As)
	System.out.println("Should be 21: " + getScore(21, 0));

	// 17 points, 1 ace (e.g. Ks + 5h + As)
	System.out.println("Should be 17: " + getScore(17, 1));


	
    }

    /**
     * This method accepts the number of base points and the number
     * of aces and calculates a final Blackjack score. 
     * It assumes that all aces are originally calculated as 11 points
     * each!
     * @param points - Total number of points in hand
     * @param numAces - number of ace cards in hand
     * @return int - Correct Blackjack score of hand
     */
    
    private static int getScore(int points, int numAces) {
	int score = 0;

	// If there are no aces, or if score is less than 21 with aces at
	// 11 points each, then the actual score is just
	// equal to the number of points.
	
	if (numAces == 0 || points <= 21) {
	    score = points;
	} else {

	    // Otherwise, we need to check what is the BEST score is,
	    // and that gets a little complicated.  We set a placeholder
	    // -1 for best score, and a placeholder potential score.
	    // We will keep track of what the best score is, and try
	    // different potential scores against it.  Whatever is
	    // highest without going over 21 will win as the best score.
	    
	    int bestScore = -1;
	    int potentialScore = points;

	    // Loop through _number of aces_ times.  Each time, try an
	    // increasing number of aces as a 1 value instead of an
	    // 11 value (thus, subtract 10 * j from the total points
	    // value, which assumes all Aces are equal to 11 points).
	    
	    for (int j = 0; j <= numAces; j++) {
		potentialScore = (points - (10 * j));

		// For each iteration, if the potential score is
		// better than the already-best score, but it is NOT
		// over 21 (causing us to bust), then the
		// potential score should count as our new best score.
		
		if (potentialScore > bestScore && potentialScore <= 21) {
		    bestScore = potentialScore;
		}
	    }

	    // We could have busted even when all of our aces were set
	    // to one point.  In this case, we might never have gotten a
	    // valid "best" score.  But our best potential score is the closest
	    // to a best score we have, so we will replace our placeholder -1
	    // best with the best potential score we got.

	    // Otherwise, just set the score to the best score.
	    
	    if (bestScore == -1) {
		score = potentialScore;
	    } else {
		score = bestScore;
	    }
	}
	return score;
    }
}
