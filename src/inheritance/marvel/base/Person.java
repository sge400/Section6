package inheritance.marvel.base;

public class Person {

    protected String name;
    protected int age;

    public void eat(String food) {
        System.out.println("Person is eating the food: " + food);
    }

    public void walk() {
        System.out.println("Person is walking");
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }
}

