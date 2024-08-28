package com.xworkz.inheritance;

import com.xworkz.inheritance.Halwa;
import com.xworkz.inheritance.Sweet;

public class SweetRunner {
    public static void main(String[] arg) {
        Sweet sweet = new Sweet();
        sweet.name = "Gulab Jamun";
        sweet.color="Brownish Red";
        sweet.weight=250;
        sweet.display();
        sweet.prepare();
        sweet.serve();

        Halwa halwa = new Sweet();
        halwa.name = "Carrot Halwa";
        halwa.color = "Orange";
        halwa.weight = 250;
        halwa.display();
        halwa.prepare();
        halwa.serve();
    }
}

