package control.flow.statements;

public class ForLoopDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int result = i * 5;
            System.out.println("5 * " + i + " = " + result);
        }

//        for (; ;){
//            System.out.println("This is an infinite for loop!");
//        }

//        for (;;); //another for loop
    }
}
