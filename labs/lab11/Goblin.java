import java.util.*;

// This is an example Goblin class.  You do NOT need to use
// it if you don't want to, but it's certainly a good start.

// Also note that you may need additional methods or attributes!

public class Goblin extends Monster {

    // Total number of all Goblins defeated
    // Note that this is a STATIC variable as it applies
    // to the whole class of Goblins, not one particular one.
    
    public static int _defeats = 0;

    // Constructor.  Goblins have ten hit points.

    // Note that we are re-using the _hp variable from the
    // superclass Monster.
    
    public Goblin() {
	_hp = 10;
    }

    // Here, we are overriding the getName() method in Monster
    // by having it return "Goblin".
    
    public String getName() {
	return "Goblin";
    }

    // Calculate damage from a regular attack
    
    public int attack(int hit) {
	_hp -= hit;

	if (_hp < 0) {
	    _defeats++;
	}

	int damage = _rng.nextInt(5) + 1;
	
	return damage;
    }

    // Calculate damage from a berserk attack

    public int attack(int hit) {
	_hp -= (hit * 3);

	if (_hp < 0) {
	    _defeats++;
	}

	int damage = _rng.nextInt(5) + 1;
	
	return damage * 2;
    }

    
}
