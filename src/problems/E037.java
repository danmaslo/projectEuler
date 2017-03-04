package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=37
 * @author hi@danielmaslo.com
 */
public class E037 {
    public static int solution() {
        int sum = 0;
        int start;
        int end;

        ArrayList<Integer> primes = new ArrayList<>();

        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);

        start = 0;
        end = primes.size();

        while (start != end) {
            for (int i = 1; i < 10; i += 2) {
                for (int j = start; j < end; j++) {
                    int temp = 10 * primes.get(j) + i;

                    if (E037.isPrime(temp)) {
                        primes.add(temp);

                        if (E037.isReduceablePrime(temp)) {
                            sum += temp;
                        }
                    }
                }
            }

            start = end;
            end = primes.size();
        }

        return(sum);
    }

    public static boolean isReduceablePrime(long n) {
        // avoid one digits
        if (n < 10) {
            return(false);
        }

        ArrayList<Long> numbers = new ArrayList<>();

        // split to digits
        while (n > 0) {
            long temp = n % 10;

            numbers.add(temp);

            n /= 10;
        }

        // left to right
        int counter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int temp = 0;
            int power = 0;

            for (int j = 0; j < numbers.size() - counter; j++) {
                temp += Math.pow(10, power) * numbers.get(j);
                power++;
            }

            counter++;

            if (!E037.isPrime(temp)) {
                return(false);
            }
        }

        // right to left
        counter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int temp = 0;
            int power = 0;

            for (int j = counter; j < numbers.size(); j++) {
                temp += Math.pow(10, power) * numbers.get(j);
                power++;
            }

            counter++;

            if (!E037.isPrime(temp)) {
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
