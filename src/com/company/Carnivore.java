package com.company;

/**
 * Created by joeha on 2017. 5. 8..
 */
public class Carnivore extends Animal {
    void hunt(){
        System.out.println("hunt!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("고기");
    }
}
