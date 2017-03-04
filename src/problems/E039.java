package problems;

/**
 * @link http://projecteuler.net/problem=39
 * @author hi@danielmaslo.com
 */
public class E039 {
    public static int solution() {
        int result = 0;
        int max = 0;

        for (int i = 3; i <= 1000; i++) {
            int triangles = 0;
            int maxA = (int) Math.floor(i / 2);
            int maxB = (int) Math.floor(i / 2);

            for (int a = 1; a < maxA; a++) {
                for (int b = a; b < maxB; b++) {
                    int c = i - a - b;

                    if (E039.isRightAngleTriangle(a, b, c)) {
                        triangles++;
                    }
                }
            }

            if (triangles > max) {
                max = triangles;
                result = i;
            }
        }

        return(result);
    }

    public static boolean isRightAngleTriangle(int a, int b, int c) {
        return(a * a + b * b == c * c);
    }
}
