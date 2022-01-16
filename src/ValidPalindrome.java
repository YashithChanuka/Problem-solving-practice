public class ValidPalindrome {

    public static void main(String[] args) {
        boolean isPalindrome = ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String s) {

        String fixed_string = "";

        for (char c  : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixed_string += c;
            }
        }

        fixed_string = fixed_string.toLowerCase();

        int forward_pointer = 0;
        int backward_pointer = fixed_string.length() - 1;

        while (forward_pointer <= backward_pointer) {

            if (fixed_string.charAt(forward_pointer) != fixed_string.charAt(backward_pointer)) {
                return false;
            }

            forward_pointer += 1;
            backward_pointer -= 1;
        }

        return true;
    }
}
