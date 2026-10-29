package BasicString;

public class StringPractice {

    // 1. Reverse a string
    static String reverseString(String str) {
        String rev = "";

        // Start from the last character and move backward
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    // 2. Count the number of characters in a string
    static int countCharacters(String str) {
        return str.length();
    }

    // 3. Count vowels (a, e, i, o, u)
    static int countVowels(String str) {
        int count = 0;

        // Convert to lowercase to handle uppercase vowels too
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    // 4. Count consonants
    static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Count only English letters, excluding vowels
            if (ch >= 'a' && ch <= 'z'
                    && ch != 'a' && ch != 'e'
                    && ch != 'i' && ch != 'o'
                    && ch != 'u') {
                count++;
            }
        }

        return count;
    }

    // 5. Count digits in a string
    static int countDigits(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check whether the character is a digit from 0 to 9
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }

        return count;
    }

    // 6. Count spaces in a string
    static int countSpaces(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    // 7. Check whether a string is a palindrome
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // 8. Count occurrences of a particular character
    static int countCharacter(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    // 9. Remove all spaces from a string
    static String removeSpaces(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Add only characters that are not spaces
            if (ch != ' ') {
                result = result + ch;
            }
        }

        return result;
    }

    // 10. Convert a string to uppercase without using toUpperCase()
    static String convertToUpperCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Convert lowercase English letters to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result = result + ch;
        }

        return result;
    }

    // 11. Count words in a string
    static int countWords(String str) {
        str = str.trim();

        // An empty string contains zero words
        if (str.isEmpty()) {
            return 0;
        }

        // Split on one or more whitespace characters
        return str.split("\\s+").length;
    }

    // 12. Check whether two strings are equal, ignoring case
    static boolean compareStrings(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    // Main method: execution starts here
    public static void main(String[] args) {
        String str = "Hello Java 123";

        System.out.println("Original String: " + str);
        System.out.println("Reverse: " + reverseString(str));
        System.out.println("Character count: " + countCharacters(str));
        System.out.println("Vowels: " + countVowels(str));
        System.out.println("Consonants: " + countConsonants(str));
        System.out.println("Digits: " + countDigits(str));
        System.out.println("Spaces: " + countSpaces(str));
        System.out.println("Is Palindrome: " + isPalindrome("madam"));
        System.out.println("Occurrences of 'a': "
                + countCharacter(str, 'a'));
        System.out.println("Without spaces: " + removeSpaces(str));
        System.out.println("Uppercase: " + convertToUpperCase(str));
        System.out.println("Word count: " + countWords(str));
        System.out.println("Strings equal: "
                + compareStrings("Java", "JAVA"));
    }
}

