public class PalindromeNumber {

    public static void main(String[] args) {

        // test cases
        // 121 -> true
        // 123 -> false
        // -121 -> false
        // 2**32 -> false

        // Algorithm
        // 123%10 = 3
        // 3 * 10 + 2 = 32
        // 32 * 10 + 1 = 321

        boolean palindrome = new PalindromeNumber().isPalindrome(121);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int num) {

        int n = num;

        // check question constraints
        if (num < 0) {
            return false;
        }

        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // return true or false
        return reverse == n;
    }
}
