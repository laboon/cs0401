import java.util.*;

public class Monster {

    public int _hp = 0;

    public Random _rng = new Random();
    
    public Hoard _hoard = new Hoard();
    
    public String getName() {
	return "Monster";
    }
    
    public int attack(int hit) {
	return 0;
    }
    
}
