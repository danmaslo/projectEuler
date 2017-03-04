package problems;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @link http://projecteuler.net/problem=35
 * @author hi@danielmaslo.com
 */
public class E035 {
    public static int solution() {
        int sum = 0;

        for (int i = 0; i < 1000000; i++) {
            if (E035.isCircularPrime(i)) {
                sum++;
            }
        }
        
        return(sum);
    }

    public static boolean isCircularPrime(int n) {
        // one digital primes
        if ( (n < 10) && E035.isPrime(n)) {
            return(true);
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        // split to digits
        while (n > 0) {
            int temp = n % 10;

            numbers.add(temp);

            n /= 10;
        }

        // make it ordered as number
        Collections.reverse(numbers);

        // build and check cycles
        for (int i = 0; i < numbers.size(); i++) {
            int temp = 0;
            int counter = numbers.size();

            for (int j = i; j < i + numbers.size(); j++) {
                temp += Math.pow(10, --counter) * numbers.get(j % numbers.size());
            }

            if (!E035.isPrime(temp)) {
                return(false);
            }
         }

        return(true);
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
