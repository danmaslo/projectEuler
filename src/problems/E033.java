package problems;

/**
 * @link http://projecteuler.net/problem=33
 * @author hi@danielmaslo.com
 */
public class E033 {

    public static int solution() {
        int n = 1;
        int d = 1;

        for (int i = 10; i < 99; i++) {
            for (int j = i + 1; j < 100; j++) {
                // avoid primitives
                if (!((i % 10 == 0) && (j % 10 == 0))) {
                    if (E033.isCuriousFraction(i, j)) {
                        n *= i;
                        d *= j;
                    }
                }
            }
        }

        for (int i = 2; i < d/2; i++) {
            if ((n % i == 0) && (d % i == 0)) {
                n /= i;
                d /= i;

                i = 2;
                continue;
            }
        }

        return(d);
    }

    public static boolean isCuriousFraction(int numerator, int denumerator) {
        int n1 = (int) Math.floor(numerator / 10.0);
        int n2 = numerator - 10 * n1;

        int d1 = (int) Math.floor(denumerator / 10.0);
        int d2 = denumerator - 10 * d1;

        int n = 0;
        int d = 1;
        boolean check = false;

        if (n1 == d1) {
            n = n2;
            d = d2;

            check = true;
        }

        if (n2 == d2) {
            n = n1;
            d = d1;

            check = true;
        }

        if (n1 == d2) {
            n = n2;
            d = d1;

            check = true;
        }

        if (n2 == d1) {
            n = n1;
            d = d2;

            check = true;
        }

        if (check) {
            double a = (double) numerator / (double) denumerator;
            double b = (double) n / (double) d;

            if (a == b) {
                return (true);
            } else {
                return (false);
            }
        }
        else {
            return(false);
        }
    }

}