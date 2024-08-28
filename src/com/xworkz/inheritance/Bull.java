package com.xworkz.inheritance;

public class Bull {

        String name;
        int age;
        String color;
        String habitat;
        boolean isWild;

        // No-arg constructor
        public Bull() {
            System.out.println("Bull no-arg constructor ");
        }
        // Methods
        public void eat() {
            System.out.println(name + " is eating.");
        }

        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        public void makeSound() {
            System.out.println(name + " is making a sound.");
        }

        public void move() {
            System.out.println(name + " is moving.");
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Color: " + color);
            System.out.println("Habitat: " + habitat);
            System.out.println("Is Wild: " + isWild);
        }
    }

