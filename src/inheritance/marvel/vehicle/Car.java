package inheritance.marvel.vehicle;

import inheritance.marvel.base.Vehicle;

public class Car extends Vehicle {

    //field hiding
    public int horsePower = 150;
    public String color = "Black";
    public String turningRadius = "6.23"; //as long as var name is same, it's considered field hiding
    public boolean isAutomatic = true;

    public static void start(){
        System.out.println("Car starting...");  //method hiding
    }
    public void printCarDetails() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
