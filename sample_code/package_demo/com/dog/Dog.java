package com.dog;

import com.cat.CatFood;

public class Dog {

    Whiskers w = new Whiskers();

    CatFood c = new CatFood();
    
    public Dog() {
	w.snuffle();
	c.eat();
    }
    
}
