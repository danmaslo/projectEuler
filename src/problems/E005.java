package problems;

/**
 * @link http://projecteuler.net/problem=5
 * @author hi@danielmaslo.com
 */
public class E005 {

    public static int solution() {
        int input = 20;

        while (true) {
            for (int j = 2; j <= input; j++) {
                if (input % j != 0) {
                    break;
                }
                else {
                    if (j == 20) {
                        return(input);
                    }
                }
            }

            input++;
        }
    }
}