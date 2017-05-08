package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Animal();
        dog.name = "name";

        animal.eat();
        dog.eat();

        Carnivore lion = new Carnivore();
        Herbivore lamb = new Herbivore();

        lion.name = "Lion";
        lion.color = "red";
        lamb.name = "Lamb";
        lamb.color = "yellow";

        lion.hunt();
        lamb.runAway();

        lamb.eat();
    }
}