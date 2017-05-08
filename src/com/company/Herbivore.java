package com.company;

/**
 * Created by joeha on 2017. 5. 8..
 */
public class Herbivore extends Animal{
   void runAway(){
      System.out.println("run run");
   }

   @Override
   void eat() {
      super.eat();
      System.out.println("풀");
   }
}
