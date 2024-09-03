package inheritance.marvel.app;

import inheritance.marvel.animals.Cat;
import inheritance.marvel.animals.Dog;
import inheritance.marvel.base.Animal;

public class UpcastingDemo {

    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.setName("Scooby");
        AnimalUtility.printName(anm);
        //anm.eat(); //eat() from SuperClass

        anm = new Dog(); //Upcasting, a dog is an animal
        anm.setName("Charlie");
        AnimalUtility.printName(anm);
       // anm.eat(); //eat() from subclass Dog

        Cat cat = new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat);
    }
}
