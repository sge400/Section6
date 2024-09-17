package list;

import java.util.ArrayList;
import java.util.List;

public class TaskMain {

    public static void main(String[] args) {
        List<Task> listOfTasks = TaskManager.makeToDoList();
        System.out.println(listOfTasks);
    }
}
