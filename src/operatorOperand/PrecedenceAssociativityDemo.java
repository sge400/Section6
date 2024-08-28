package operatorOperand;

public class PrecedenceAssociativityDemo {

    public static void main(String[] args) {
        int calNum = (16 - 8) * 2; //0
        System.out.println(calNum);

        calNum = 16 * 5 / 2; //40
        System.out.println(calNum);
    }
}
