package problems;

import java.math.BigDecimal;

/**
 * @link http://projecteuler.net/problem=25
 * @author hi@danielmaslo.com
 */
public class E025 {

    public static int solution() {		
	int input = 1000;
	BigDecimal f1 = new BigDecimal(1);
	BigDecimal f2 = new BigDecimal(1);
	int counter = 2;
	
	while (!E025.hasSameOrMoreDigits(f1, input) && !E025.hasSameOrMoreDigits(f2, input)) {
	    f1 = f1.add(f2);
	    f2 = f2.add(f1);
	    	    
	    counter += 2;
	}
	
	if (E025.hasSameOrMoreDigits(f1, input)) {
	    counter--;
	}
	
	return(counter);
    }
    
    public static boolean hasSameOrMoreDigits(BigDecimal d, int n) {
	BigDecimal ten = new BigDecimal(10);
	BigDecimal pow = ten.pow(n-1);
	
	if (d.compareTo(pow) >= 0) {
	    return(true);
	}
	else {
	    return(false);
	}
    }
        
}