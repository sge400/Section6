package generics;

import generics.model.Developer;
import generics.model.Employee;
import generics.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class CovarianceDemo {

    public static void main(String[] args) {

        Employee[] employees = {new Employee(), new Employee()};
        printArray(employees);
        Developer[] developers = {new Developer(), new Developer()};
        printArray(developers);
        Manager[] managers = {new Manager(), new Manager()};
        printArray(managers);

        String s = "Generics"; //string is a subtype of object
        Object o = s;

        String[] sArray = {"Generics", "Collections"};
        Object[] objArray = sArray;

        List<String> sList = new ArrayList<>();
        List<Object> oList = new ArrayList<>();
        //oList = sList; //covariance not supported in collections

        Number[] numArray = {1, 2, 3};
        Object[] objectArray = numArray; //Covariance accepted
        //objectArray[0] = "String";      //ArrayStoreException

        List<Employee> employees1 = List.of(new Employee(), new Employee());
        printArray1(employees1);
        List<Developer> developers1 = List.of(new Developer(), new Developer());
        //printArray1(developers1); //inside collections covariance is not accepted


    }

    public static void printArray(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
    public static void printArray1(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
