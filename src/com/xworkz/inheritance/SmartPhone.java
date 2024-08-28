package com.xworkz.inheritance;

public class SmartPhone {

    String brand;
    String model;
    int storage;
    int batteryCapacity;

    public SmartPhone() {
        System.out.println("created smartphone");
    }

    public void makeCall() {
        System.out.println("Making a call from " + brand + " " + model);
    }

    public void sendText() {
        System.out.println("Sending a text from " + brand + " " + model);
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
    }
}