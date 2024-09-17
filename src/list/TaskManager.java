package list;

import java.util.ArrayList;
import java.util.List;

    public class TaskManager {

        public static List<Task> makeToDoList() {
            /* Write your code below */
            Task task1 = new Task("Complete assignment");
            Task task2 = new Task("Go for a run");
            Task task3 = new Task("Buy groceries");

            List<Task> taskList = new ArrayList<>();
            //taskList.add(new Task("Zo kan het dus ook"));
            taskList.add(task1);
            taskList.add(task2);
            taskList.add(task3);

            taskList.get(1).setCompleted(true);

            for (int i = 0; i < taskList.size(); i++) {
                Task task = taskList.get(i);
                System.out.println((i+1) + ". " + task.getDescription() + " - Completed: " + task.isCompleted());
            }
            return taskList;

        }
}
