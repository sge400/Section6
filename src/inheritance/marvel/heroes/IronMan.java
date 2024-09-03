package inheritance.marvel.heroes;

import inheritance.marvel.base.Person;

public class IronMan extends Person {

    public void usePower() {
        System.out.println("IronMan is using his power");
    }

    @Override
    public void walk(){ //method override with same method name, return type and parameters
        System.out.println("IronMan walking with his suit"); //access modifier can't be more restrictive than original method
    }

}
