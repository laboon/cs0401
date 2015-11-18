package com.cat;

public class Kitty {

    Whiskers w = new Whiskers();

    CatFood c = new CatFood();
    
    public Kitty() {
	w.twitch();
	c.eat();
    }
    
}
