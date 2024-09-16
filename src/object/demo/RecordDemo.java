package object.demo;

public class RecordDemo {

    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("John", "Doctor");
        System.out.println(personRecord.name()); // no getter needed
        System.out.println(personRecord.occupation());
        System.out.println(personRecord);
        Class personClass = personRecord.getClass();
    }
}
