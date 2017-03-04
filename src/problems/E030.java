package problems;

/**
 * @link http://projecteuler.net/problem=30
 * @author hi@danielmaslo.com
 */
public class E030 {

    public static int solution() {		
	int sum = 0;
	
	for (int i = 2; i < 1000000; i++) {
	    if (E030.isSumOfFifthPows(i)) {
		System.out.println(i);
		
		sum += i;
	    }
	}
	
	return(sum);
    }
    
    public static boolean isSumOfFifthPows(int number) {
	Integer num    = number;
	String snumber = num.toString();
	Integer temp;
	Double sum = 0.0;
	
	for (int i = 0; i < snumber.length(); i++) {
	    temp = Integer.parseInt(snumber.substring(i, i+1));
	    
	    sum += Math.pow(temp, 5.0);
	}
	
	if (sum == number) {
	    return(true);
	}
	else {
	    return(false);
	}
    }
                
}