package com.dog;

import com.cat.CatFood;

import com.human.Whiskers;

public class Dog {

    Whiskers w = new Whiskers();

    CatFood c = new CatFood();
    
    public Dog() {
	// w.snuffle();
	w.stubble();
	c.eat();
    }

    public static void main(String[] args) {
	Dog d = new Dog();
	System.out.println("made a dog yo");
    }
    
}
