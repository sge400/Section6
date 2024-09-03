package inheritance.marvel.app;

import inheritance.marvel.base.Vehicle;
import inheritance.marvel.vehicle.Car;

public class TestFieldHiding {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        System.out.println(car.horsePower);
        System.out.println(car.turningRadius);
        System.out.println(car.isAutomatic);
        //Car datatype -> fields from Car subclass
        car.printCarDetails();

        Vehicle vehicle = car; //down casting
        System.out.println(vehicle.color);
        System.out.println(vehicle.horsePower);
        System.out.println(vehicle.turningRadius);
        //Vehicle datatyp -> fields from Vehicle SuperClass

    }
}
