package problems;

/**
 * @link http://projecteuler.net/problem=6
 * @author hi@danielmaslo.com
 */
public class E006 {

    public static int solution() {
        int input = 100;
        int sum   = 0;
        int sumSq = 0;

        for (int i = 1; i <= input; i++) {
            sum   += i * i;
            sumSq += i;
        }

        sumSq *= sumSq;

        return(sumSq - sum);
    }
}