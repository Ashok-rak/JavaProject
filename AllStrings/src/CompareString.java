
public class  CompareString{
    public static void main(String[] args) {
        // Two sample strings
        String string1 = "Hello";
        String string2 = "hello";

        // Compare using equals()
        if (string1.equals(string2)) {
            System.out.println("The strings are equal (case-sensitive).");
        } else {
            System.out.println("The strings are not equal (case-sensitive).");
        }

        // Compare using equalsIgnoreCase()
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("The strings are equal (case-insensitive).");
        } else {
            System.out.println("The strings are not equal (case-insensitive).");
        }

        // Compare using compareTo()
        int result = string1.compareTo(string2);
        if (result == 0) {
            System.out.println("The strings are equal using compareTo.");
        } else if (result < 0) {
            System.out.println("string1 is less than string2 using compareTo.");
        } else {
            System.out.println("string1 is greater than string2 using compareTo.");
        }
    }
}

