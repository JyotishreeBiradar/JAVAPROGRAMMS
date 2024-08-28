package com.xworkz.inheritance;

import com.xworkz.inheritance.Bulb;
import com.xworkz.inheritance.LightUp;

public class BulbRunner {

    public static void main(String[] arg) {
        LightUp lightUp = new LightUp();
        lightUp.type = "LED";
        lightUp.turnon();

        Bulb bulb = new LightUp();
        bulb.type = "Incandescent";
        bulb.turnon();
    }
}