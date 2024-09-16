package object.demo;

public class GetClassDemo {

    public static void main(String[] args) {
        Person person = new Person();
        Class prsnClass = person.getClass(); //return type is class
        System.out.println(prsnClass.getName());
        System.out.println(prsnClass.getSimpleName());
        System.out.println(prsnClass.getPackageName());
    }
}
