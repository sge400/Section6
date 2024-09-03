package inheritance.marvel.app;

import inheritance.marvel.base.Person;
import inheritance.marvel.heroes.IronMan;

public class MarvelsMain {

    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.walk();
        ironMan.eat("Pasta");
        ironMan.sleep();
        ironMan.usePower();

        Person person = new Person();
        int hc = person.hashCode();
        String str = person.toString();
    }
}
