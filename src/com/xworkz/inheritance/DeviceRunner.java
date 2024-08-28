package com.xworkz.inheritance;

import com.xworkz.inheritance.SmartPhone;
import com.xworkz.inheritance.Device;

public class DeviceRunner {
    public static void main(String[] arg) {
        Device device = new Device();
        device.brand = "Samsung";
        device.model = "Galaxy S21";
        device.storage = 256;
        device.batteryCapacity = 3880;
        device.display();
        device.makeCall();
        device.sendText();


        SmartPhone smartPhone = new SmartPhone();
        smartPhone.brand = "Apple";
        smartPhone.model = "iphone 14";
        smartPhone.storage = 128;
        smartPhone.batteryCapacity = 2568;
        smartPhone.display();
        smartPhone.makeCall();
        smartPhone.sendText();
    }
}