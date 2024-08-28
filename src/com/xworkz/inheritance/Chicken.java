package com.xworkz.inheritance;

public class Chicken {
    public String name;
    public int age;
    public double weight;
    public String color;
    public String breed;
    public String size;
    public boolean isOrganic;
    public String origin;
    public int eggsLaid;
    public String featherType;


    public Chicken() {
        System.out.println("Chicken no-arg constructor");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void layEggs() {
        System.out.println(name + " is laying eggs.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Weight:"+weight);
        System.out.println("Color:"+color);
        System.out.println("Breed:"+breed);
        System.out.println("Size:"+size);
        System.out.println("IsOrganic:"+isOrganic);
        System.out.println("Origin:"+origin);
        System.out.println("EggsLaid:"+eggsLaid);
        System.out.println("FeatherType:"+featherType);
    }
}
