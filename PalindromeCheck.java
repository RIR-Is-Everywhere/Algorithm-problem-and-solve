// problem 2Check if a String is a Palindrome

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "hello";
        System.out.println(s1 + " -> " + isPalindrome(s1));
        System.out.println(s2 + " -> " + isPalindrome(s2));
    }
}

