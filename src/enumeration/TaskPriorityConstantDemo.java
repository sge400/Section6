package enumeration;

public class TaskPriorityConstantDemo {

    public static void main(String[] args) {
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.LOW));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.MEDIUM));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.HIGH));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.URGENT));
        System.out.println(PriorityEnum.URGENT);
    }
}
