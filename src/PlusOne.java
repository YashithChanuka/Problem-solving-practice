import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] ints = new PlusOne().plusOne(new int[]{4, 3, 2, 1});
        System.out.println(Arrays.toString(ints));
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
