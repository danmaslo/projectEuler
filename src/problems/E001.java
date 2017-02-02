package problems;

/**
 * @see http://projecteuler.net/problem=1
 *
 * @author Daniel Maslo <http://www.danielmaslo.com>
 */
public class E001 {
    public static int solution() {
        int input = 1000;

        int sum3 = 0;
        int sum5 = 0;

        for (int i = 3; i < input; i += 3) {
            sum3 += i;
        }

        for (int i = 5; i < input; i += 5) {
            if ((i % 3) != 0) {
                sum5 += i;
            }
        }

        return(sum3 + sum5);
    }
}