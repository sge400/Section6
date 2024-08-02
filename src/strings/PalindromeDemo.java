package strings;

public class PalindromeDemo {

    public static void main(String[] args) {
        String input = "mom";
        StringBuilder sb = new StringBuilder(2); //or StringBuffer
        sb.append(input);
        sb.reverse();
        String output = sb.toString();

        boolean isPalindrome = input.equals(output);

        System.out.printf("The word %s is a palindrome: %b\n", input, isPalindrome);
    }
}
