public class PalindromeDemo {

    public static void main(String[] args) {
        String input = "mom";
        StringBuilder sb = new StringBuilder(); //or StringBuffer
        sb.append(input);
        sb.reverse();
        String output = sb.toString();

        boolean isPalindrome = input.equals(output);

        System.out.printf("The word %s is a palindrome: %b", input, isPalindrome);
    }
}
