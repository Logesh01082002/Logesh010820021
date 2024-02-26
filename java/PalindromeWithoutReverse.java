class PalindromeWithoutReverse {

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        int left = 0;
        int right = length - 1;

        while (left < right) {
            // Compare characters at left and right indices
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters are not equal, not a palindrome
            }

            // Move the pointers towards the center
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }
}