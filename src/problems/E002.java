package problems;

/**
 * @link http://projecteuler.net/problem=2
 * @author hi@danielmaslo.com
 */
public class E002 {
    public static int solution() {
        int input = 4000000;

        int sum  = 0;
        int f    = 2;
        int pref = 1;
        int temp;
        int counter = 0;

        while (f < input) {
            if ((counter % 3) == 0) {
                sum += f;
            }

            counter++;

            temp = f;
            f = f + pref;
            pref = temp;
        }

        return(sum);
    }
}