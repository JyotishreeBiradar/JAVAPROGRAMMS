package com.xworkz.inheritance;

import com.xworkz.inheritance.Bull;
import com.xworkz.inheritance.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Bully";
        animal.age = 5;
        animal.color = "Brown";
        animal.habitat = "Farm";
        animal.isWild = true;
        animal.display();
        animal.eat();
        animal.sleep();
        animal.makeSound();
        animal.move();

        Bull bull = new Animal();
        bull.name = "Natraj";
        bull.age = 8;
        bull.color = "White";
        bull.habitat = "indoor";
        bull.isWild = false;
        bull.display();
        bull.eat();
        bull.sleep();
        bull.makeSound();
        bull.move();
    }
}
