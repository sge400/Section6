package inheritance.marvel.app;

import inheritance.marvel.animals.Cat;
import inheritance.marvel.animals.Dog;
import inheritance.marvel.base.Animal;

public class DownCastingDemo {

    public static void main(String[] args) {
        Animal anm;
        Dog dog = new Dog();
        anm = dog;  //upcasting
        dog = (Dog) anm;  //downcasting needs to done manually. Not every animal is a dog!

        //Cat cat = (Cat) anm; //throws a ClassCastException because a cat is not a dog.
    }
}
