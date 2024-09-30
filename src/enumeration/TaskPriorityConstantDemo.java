package enumeration;

public class TaskPriorityConstantDemo {

    public static void main(String[] args) {
        System.out.println(TaskUtil.getEstimatedCompletionTime(10));
        System.out.println(TaskUtil.getEstimatedCompletionTime(1));
        System.out.println(TaskUtil.getEstimatedCompletionTime(2));
        System.out.println(TaskUtil.getEstimatedCompletionTime(3));
    }
}
