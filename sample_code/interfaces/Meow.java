import java.util.ArrayList;

public class Meow {

    public static void main(String[] args) {
	Cat c = new Cat();
	c.moo();
	System.out.println(c.toString());
    }


}

class Cat {
    public void moo() {
	System.out.println("moo!");
    }
}
