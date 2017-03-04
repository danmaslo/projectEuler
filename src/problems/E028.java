package problems;

/**
 * @link http://projecteuler.net/problem=28
 * @author hi@danielmaslo.com
 */
public class E028 {

    public static int solution() {		
	int input = 1001;
	int sum = 0;
	
	for (int i = 1; i <= input; i += 2) {
	    if (i == 1) {
		sum += 1;
	    }
	    else {
		sum += i*i + (i*i - (i-1)) + (i*i - 2*(i-1)) +  (i*i - 3*(i-1));
	    }
	}
	
	return(sum);
    }
                
}