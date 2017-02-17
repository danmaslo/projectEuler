package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=14
 * @author hi@danielmaslo.com
 */
public class E014 {
    private static ArrayList<Long> cache = new ArrayList<>();
    private static long cacheSize = 1000000;

    public static int solution() {
        int result = 0;
        long max = 0;

        // init cache
        for (int i = 0; i < E014.cacheSize; i++) {
            E014.cache.add((long) 0);
        }

        // solving
        for (int i = 1; i < 1000000; i++) {
            long temp = E014.collatzLength(i);

            // add to cache
            E014.cache.set(i, temp);

            if (temp > max) {
                max = temp;
                result = i;
            }
        }

        return(result);
    }

    public static long collatzLength(long start) {
        int steps = 1;

        while (true) {
            // cache
            if ((start < E014.cacheSize) && (E014.cache.get((int) start) != 0)) {
                return(steps + E014.cache.get((int) start));
            }

            // finish
            if (start == 1) {
                return(steps);
            }

            // computing
            if ((start) % 2 == 0) {
                start /= 2;
            }
            else {
                start *= 3;
                start += 1;
            }

            steps++;
        }
    }
}