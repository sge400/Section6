package inheritance.marvel.vehicle;

import inheritance.marvel.base.Vehicle;

public class Car extends Vehicle {

    public static void start(){
        System.out.println("Car starting...");  //method hiding
    }
}
