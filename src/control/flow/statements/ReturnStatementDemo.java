package control.flow.statements;

public class ReturnStatementDemo {
    public static void main(String[] args) {
        String result = getStudentGrade(90);
        System.out.println(result);

        int [] arrayOfInt = {43, 455, 4376, 343, 6 };
        int lookingFor  = 455;
        int index = findAndReturnNumber(arrayOfInt, lookingFor);
        System.out.println(index);

    }

    public static String getStudentGrade (int marks) {
        if (marks >= 40) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
    public static int findAndReturnNumber(int [] arrayOfNums, int target) {
        for(int i = 0; i < arrayOfNums.length; i++) {
            if(arrayOfNums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
