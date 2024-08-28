package com.xworkz.inheritance;

import com.xworkz.inheritance.Chicken;
import com.xworkz.inheritance.SpecialChicken;

public class ChickenRunner {

    public static void main(String[] args)
    {
        SpecialChicken specialChicken = new SpecialChicken();
        specialChicken.name="Hen";
        specialChicken.age=2;
        specialChicken.weight=1.5;
        specialChicken.color="White";
        specialChicken.breed="Rhode island red";
        specialChicken.size="Medium";
        specialChicken.isOrganic=true;
        specialChicken.origin="USA";
        specialChicken.eggsLaid=12;
        specialChicken.featherType="Feathery";

        specialChicken.display();
        specialChicken.eat();
        specialChicken.sleep();
        specialChicken.layEggs();
        specialChicken.run();


        Chicken chicken = new SpecialChicken();
        chicken.name="Rooster";
        chicken.age=3;
        chicken.weight=2.0;
        chicken.color="Black";
        chicken.breed="Leghorn";
        chicken.size="Large";
        chicken.isOrganic=true;
        chicken.origin="France";
        chicken.eggsLaid=15;
        chicken.featherType="Golden Feathers";

        chicken.display();
        chicken.eat();
        chicken.sleep();
        chicken.layEggs();
        chicken.run();
    }
}
