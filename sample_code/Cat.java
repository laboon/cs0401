public class Cat {

    public String name = "DEFAULT";

    public int level = 0;

    private Face face = new Face();

    private Cat[] friends;
    
    public Cat(String kittyName, int fluffinessLevel) {
	name = kittyName;
	level = fluffinessLevel;
    }

    // Cat c --> Face f --> Whiskers w
    
    public void twitchWhiskers() {
	Whiskers w = face.getWhiskers();
	w.twitch();
    }
    
    public static void main(String[] args) {
	Cat c = new Cat("Fluffernins", 9001);

	System.out.println("Created cat named " + c.name + "!");

	System.out.println("Fluffiness level: " + c.level + "!");
	
	c.twitchWhiskers();
    
    }
}
