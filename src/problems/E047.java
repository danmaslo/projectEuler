package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=47
 * @author hi@danielmaslo.com
 */
public class E047 {

    public static int solution() {
        int num = 600;
        int dpf = 0;
        int distinctPrimeFactors = 3;
        ArrayList<Integer> primes = new ArrayList<>();

        while (dpf < distinctPrimeFactors) {
            
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