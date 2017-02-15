package problems;

/**
 * @link http://projecteuler.net/problem=12
 * @author hi@danielmaslo.com
 */
public class E012 {

    public static long solution() {
        int number = 0;
        int iteration = 0;

        while (true) {
            number += ++iteration;

            if (E012.getDivisorCount(number) > 500) {
                break;
            }
        }

        return(number);
    }

    public static int getDivisorCount(int number) {
        int result = 0;

        for (int i = 1; i < Math.floor(Math.sqrt(number)); i++) {
            if ((number % i) == 0) {
                result++;
            }
        }

        result *= 2;

        if (Math.floor(Math.sqrt(number)) == Math.ceil(Math.sqrt(number))) {
            result++;
        }

        return(result);
    }

}