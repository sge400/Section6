package classes.methods.fields.constructors;

public class CarMain {

    static {
        System.out.println("Static block from the same class"); //gets executed before the main method (only once)
    }

    public static void main(String[] args) {
        System.out.println("Main method invocation started");
        Car car1 = new Car();
        Car car2 = new Car("Camry", "Black", 200);
        System.out.println(Car.noOfEngines);

    }
}
