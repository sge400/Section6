package inheritance.marvel.app;

import inheritance.marvel.animals.Cat;
import inheritance.marvel.animals.Dog;
import inheritance.marvel.base.Animal;

public class AnimalUtility {

    public static void printName(Animal animal) {
        System.out.println(animal.getName());
        animal.eat();
    }

    public static void performAction(Animal animal) {
        animal.eat();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        }

    }
}
