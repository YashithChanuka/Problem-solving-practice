public class ReverseInteger {

    public static void main(String[] args) {
        int reverse = new ReverseInteger().reverse(123);
        System.out.println(reverse);
    }

    public int reverse(int x) {
        int res = 0;
        int t = (x < 0) ? -x : x;
        while (t > 0) {
            int n = t % 10;
            t /= 10;
            if (res > Integer.MAX_VALUE / 10) {
                return 0;
            } else if (x >= 0) {
                if (res == Integer.MAX_VALUE / 10 && n > Integer.MAX_VALUE % 10) return 0;
            } else {
                if (res == Integer.MAX_VALUE / 10 && n > Integer.MAX_VALUE % 10 + 1) return 0;
            }
            res = res * 10 + n;
        }
        return (x < 0) ? -res : res;
    }

}
