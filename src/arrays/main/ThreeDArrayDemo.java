package arrays.main;

import java.util.Arrays;

public class ThreeDArrayDemo {

    public static void main(String[] args) {

        int noOfStudents = 2;
        int subjects = 4;
        int totalSemesters = 5;


        int[][][] studentArray = new int[noOfStudents][subjects][totalSemesters];

        //Student1 data
        int[][] student1 = {
                {88, 76, 90, 82, 98},
                {82, 96, 92, 72, 99},
                {86, 66, 94, 93, 100},
                {85, 86, 97, 92, 97},
        };

        //Student2 data
        int[][] student2 = {
                {78, 85, 70, 72, 88},
                {62, 92, 82, 91, 91},
                {76, 72, 93, 87, 82},
                {55, 83, 87, 71, 100},
        };

        studentArray[0] = student1;
        studentArray[1] = student2;

        System.out.println(Arrays.deepToString(studentArray));

        for(int i = 0; i < studentArray.length; i++) {
            for(int j = 0; j < studentArray[i].length; j++) {
                for(int k = 0; k < studentArray[i][j].length; k++) {
                    System.out.print(studentArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
