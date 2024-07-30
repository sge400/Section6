public class PalindromeDemo {

    public static void main(String[] args) {
        String input = "mom";
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        String output = sb.toString();

        boolean isPalindrome = input.equals(output);
    }
}
