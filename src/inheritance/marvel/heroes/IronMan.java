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

    @Override
    public void eat(String food) {
        super.eat("Pasta");
        System.out.println("IronMan is eating the food: " + food);
    }

    //Method overloading 1
    private void eat(){
        System.out.println("Method overloading 1");
    }

    //method overloading 2
    public void eat(String food, int quantity) {
        System.out.println("Method overloading 2");
    }

    public void callOverriddenEatMethod() {
        super.eat("Pasta");
    }

}
