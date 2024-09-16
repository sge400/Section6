package object.demo;

public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("John", 25, 'M', 234323235);
        Person p2 = p1; //will both point to the same object in the same memory location
        p2.setName("John Doe");
        System.out.println(p1.getName());
        Person p3 = (Person)p1.clone();
        System.out.println(p3.getName());
        p3.setName("Will Smith");
        System.out.println(p1.getName());
        System.out.println(p3.getName());
    }
}
