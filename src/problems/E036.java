package problems;

/**
 * @link http://projecteuler.net/problem=36
 * @author hi@danielmaslo.com
 */
public class E036 {
    public static int solution() {
        int sum = 0;

        for (int i = 0; i < 1000000; i++) {
            if (E036.isDoubleBasedPalindrom(i)) {
                sum += i;
            }
        }

        return(sum);
    }

    public static boolean isDoubleBasedPalindrom(int n) {
        if ((E036.isPalindrom(Integer.toString(n, 10))) && (E036.isPalindrom(Integer.toString(n, 2)))) {
            return(true);
        }
        else {
            return(false);
        }
    }

    public static boolean isPalindrom(String input) {
        boolean res = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(input.length() - i - 1)) {
                res = res && true;
            }
            else {
                res = false;
            }
        }

        return(res);
    }

}
