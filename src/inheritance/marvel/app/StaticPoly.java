package inheritance.marvel.app;

import inheritance.marvel.heroes.IronMan;

public class StaticPoly {

    public static void main(String[] args) {

        IronMan ironMan = new IronMan();
        ironMan.eat("Pasta");
        ironMan.eat("Pasta", 1);

    }
}
