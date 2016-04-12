public class MultiReturn {

    public static MonkeyStatus getMonkeyStatus() {
	MonkeyStatus x = new MonkeyStatus();
	x.numBananas = 5;
	x.bananasRipe = true;
	return x;
    }
    
    public static void main(String[] args) {
	MonkeyStatus foo = getMonkeyStatus();
        System.out.println(foo.numBananas + " / " + foo.bananasRipe);
    }
}

class MonkeyStatus {

    public int numBananas = 0;

    public boolean bananasRipe = false;
    
}
