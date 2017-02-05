package problems;

/**
 * @link http://projecteuler.net/problem=4
 * @author hi@danielmaslo.com
 */
public class E004 {
    public static int solution() {
        int res = 0;

        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                if (E004.isPalindrom(i * j)) {
                    if (i * j > res) {
                        res = i * j;
                    }
                }
            }
        }

        return(res);
    }

    public static boolean isPalindrom(Integer x) {
        boolean res = true;

        String num = x.toString();

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(num.length() - i - 1)) {
                res = res && true;
            }
            else {
                res = false;
            }
        }

        return(res);
    }
}
