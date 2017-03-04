package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=46
 * @author hi@danielmaslo.com
 */
public class E046 {

    public static int solution() {
        int num = 9;
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> doubleSuares = new ArrayList<>();

        primes.add(2);
        doubleSuares.add(2);

        while (true) {
            boolean finish = false;

            if (!E046.isPrime(num)) {
                finish = true;

                while (num > primes.get(primes.size() - 1)) {
                    primes.add(E046.nextPrime(primes.get(primes.size() - 1)));
                }
                while (num > doubleSuares.get(doubleSuares.size() - 1)) {
                    doubleSuares.add(E046.nextDoubleSquare(doubleSuares.get(doubleSuares.size() - 1)));
                }

                for (int i = 0; i < primes.size(); i++) {
                    for (int j = 0; j < doubleSuares.size(); j++) {
                        if (num == (primes.get(i) + doubleSuares.get(j))) {
                            finish = false;
                            break;
                        }
                        else {
                            finish = finish && true;
                        }
                    }

                    if (!finish) {
                        break;
                    }
                }
            }

            if (finish) {
                return(num);
            }

            num += 2;
        }
    }

    public static int nextDoubleSquare(int n) {
        int base = (int) Math.sqrt(n / 2.0);

        return(2 * (base + 1) * (base + 1));
    }

    public static int nextPrime(int n) {
        int counter = 1;

        while (true) {
            if (E046.isPrime(n + counter)) {
                return(n + counter);
            }
            else {
                counter++;
            }
        }
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