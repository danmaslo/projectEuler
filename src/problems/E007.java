package problems;

/**
 * @link http://projecteuler.net/problem=7
 * @author hi@danielmaslo.com
 */
public class E007 {

    public static int solution() {
        int input = 10001;
        int counter = 0;
        int num = 0;

        while (counter < input) {
            num++;

            if (E007.isPrime(num)) {
                counter++;
            }
        }

        return(num);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return(false);
        }

        if (n == 2) {
            return(true);
        }

        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return(false);
            }
        }

        return(true);
    }

}