package problems;

/**
 * @link http://projecteuler.net/problem=9
 * @author hi@danielmaslo.com
 */
public class E009 {

    public static int solution() {
        int input = 1000;
        int res   = 0;

        for (int i = 1; i < input; i++) {
            for (int j = i + 1; j < input; j++) {
                for (int k = j + 1; k < input; k++) {
                    if ((i * i + j * j) == (k * k)) {
                        if ((i + j + k) == input) {
                            return(i * j * k);
                        }
                    }
                }
            }
        }

        return(res);
    }

}