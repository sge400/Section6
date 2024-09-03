package control.flow.statements;

public class Exercise {

    public static int findDivisibleNumber (int num1, int num2) {
        int i =1;

        while (true) { //as long as the condition = true, the loop runs.
            if (i% num1 ==0 && i% num2 ==0) {
                break;
            } else {
                i++;

            }
        }
        return i;

    }

}
