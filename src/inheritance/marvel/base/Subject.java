package inheritance.marvel.base;

public abstract class Subject {

    public Subject() {
        //no private constructors in your abstract classes (at least not all!
    }

    public int marks;
    public static int MIN_MARKS = 0;

    //concrete methods
    public int totalMarks() {
        return 100;
    }

    public abstract void teach(); //an abstract method without a body, needs to be defined in an abstract class


}
