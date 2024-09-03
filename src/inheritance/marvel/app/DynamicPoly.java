package inheritance.marvel.app;

import inheritance.marvel.base.Person;
import inheritance.marvel.heroes.IronMan;

public class DynamicPoly {

    public static void main(String[] args) {
        Person person = new IronMan(); //upcasting
        person.walk(); //from Person class or IronMan class? -> IronMan!
        person.eat("Ice Cream");

        IronMan ironMan = new IronMan();
        ironMan.callOverriddenEatMethod();
    }
}
