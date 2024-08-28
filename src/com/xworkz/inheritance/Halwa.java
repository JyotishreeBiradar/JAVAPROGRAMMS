package com.xworkz.inheritance;

public class Halwa {
    String name;
    String color;
    double weight;

    public Halwa()
    {
        System.out.println("craeated halwa using no arg cons----");
    }

    public void prepare() {
        System.out.println(name + " is being prepared.");
    }

    public void serve() {
        System.out.println(name + " is being served.");
    }

    // Method to display properties of Halwa
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " grams");
    }
}
