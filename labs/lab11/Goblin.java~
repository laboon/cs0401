import java.util.*;

public class Goblin extends Monster {

    public static int _defeats = 0;

    public Goblin() {
	_hp = 10;
    }
    
    public String getName() {
	return "Goblin";
    }
    
    public int attack(int hit) {
	_hp -= hit;

	if (_hp < 0) {
	    _defeats++;
	}

	int damage = _rng.nextInt(5) + 1;
	
	return damage;
    }
    
}
