package problems;

/** 
 * @link http://projecteuler.net/problem=15
 * @author hi@danielmaslo.com
 */
public class E015 {

    public static long solution() {
        int input = 20;        
        long result = 0;
        
        input++; // number of points
        
        long[][] points = new long[input][input];

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                points[i][j] = 1;
            }
        }
        
        for (int p = 1; p < input; p++) {
            for (int i = 0+p; i < input; i++) {
                for (int j = 0+p; j < input; j++) {
                    points[i][j] = points[i-1][j] + points[i][j-1];
                }
            }
        }

        result = points[input-1][input-1];
        
        return(result);
    }
	
}
