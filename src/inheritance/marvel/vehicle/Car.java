package inheritance.marvel.vehicle;

import inheritance.marvel.base.Vehicle;

public class Car extends Vehicle {

    //field hiding
    public int horsePower;
    public String color;
    public String turningRadius;   //= "6.23"; //as long as var name is same, it's considered field hiding
    public boolean isAutomatic;

    public Car() {
        super(); //this gets done automatically, even if you remove this statement (only for default constructors)
        System.out.println("Inside Car default constructor");
        horsePower = 150;
        color = "Black";
        turningRadius = "6.23";
        isAutomatic = true;

    }

    public static void start(){
        System.out.println("Car starting...");  //method hiding
    }
    public void printCarDetails() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
