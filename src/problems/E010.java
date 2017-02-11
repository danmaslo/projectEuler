package problems;

/**
 * @link http://projecteuler.net/problem=10
 * @author hi@danielmaslo.com
 */
public class E010 {

    public static long solution() {
        int input = 2000000;
        long sum = 0;

        boolean[] numbers = new boolean[input];
        numbers[0] = true;
        numbers[1] = true;

        for (int i = 2; i <= input/2; i++) {
            if (numbers[i]) {
                continue;
            }

            for (int j = 2*i; j < numbers.length; j += i) {
                numbers[j] = true;
            }
        }

        for (int i = 2; i < numbers.length; i++) {
            if (!numbers[i]) {
                sum += i;
            }
        }

        return(sum);
    }

}