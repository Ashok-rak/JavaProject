public class Palindrome {
    public static void main(String[] args) {
        // Example strings to test
        String originalString = "madam";
        String anotherString = "Hello";

        // Check if the strings are palindromes
        System.out.println(originalString + " is a palindrome: " + isPalindrome(originalString));
        System.out.println(anotherString + " is a palindrome: " + isPalindrome(anotherString));
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove any whitespace and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Get the length of the string
        int length = str.length();

        // Compare characters from the beginning and end of the string
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // If any characters don't match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }
}
