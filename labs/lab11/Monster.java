import java.util.*;

// This is an example Monster class.  You do NOT need to use
// it if you don't want to, but it's certainly a good start.

// Also note that you may need additional methods or attributes!

public class Monster {

    // Number of Hit Points the monster has
    
    public int _hp = 0;

    // Our random number generator
    
    public Random _rng = new Random();

    // The hoard of gold that monsters inevitably have
    
    public Hoard _hoard = new Hoard();

    // Return the name of the monster.  Subclasses will
    // override this method to return the name of the monster
    // of that subclass.
    
    public String getName() {
	return "Monster";
    }

    // If you hit a monster, then the number of points of damage
    // caused by the player should be subtracted from the
    // monster's hit points.

    // The return value from the monster is the amount of damage
    // dealt to the player.
    
    // If a monster's hit points go below 0, the monster is
    // vanquished.
    
    public int attack(int hit) {
	_hp -= hit;
	return 0;
    }

    // With a berserk attack, the damage to the monster is
    // tripled, but the damage to the player is doubled.
    
    public int berserk(int hit) {
	_hp -= (hit * 3);
	return 0 * 2;
    }
    
}
