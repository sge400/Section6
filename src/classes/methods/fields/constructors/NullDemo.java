package classes.methods.fields.constructors;

public class NullDemo {

    public static void main(String[] args) {
        String myString = null;
        Employee employeeObject = null;
        int age = employeeObject.age;
        System.gc(); //garbage collector, no guarantee your jvm is accepting your request
    }
}
