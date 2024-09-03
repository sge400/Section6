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
        } else if (animal instanceof Cat) { //Java 16: } else if (animal instanceof Cat cat)  {
            Cat cat = (Cat) animal;         // this can be removed as downcasting happens automatically
            cat.meow();
        }

        String input = "Hello";

        //if (animal instanceof Engine) // compilation error!
        //instanceof Operator can only be used on classes that have an inheritance relationship!

    }
}
