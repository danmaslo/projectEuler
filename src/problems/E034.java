package problems;

/**
 * @link http://projecteuler.net/problem=34
 * @author hi@danielmaslo.com
 */
public class E034 {

    public static int solution() {
        int sum = 0;
        int limit = 7 * E034.factorial(9);

        for (int i = 3; i < limit; i++) {
            if (E034.isCurious(i)) {
                sum += i;
            }
        }

        return(sum);
    }

    public static boolean isCurious(int number) {
        int sum = 0;
        int num = number;

        while (number > 0) {
            int temp = number % 10;
            number = number / 10;

            sum += E034.factorial(temp);
        }

        if (sum == num) {
            return(true);
        }
        else {
            return(false);
        }
    }

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return(result);
    }

}