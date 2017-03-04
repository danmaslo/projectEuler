package problems;

import java.math.BigInteger;

/**
 * @link http://projecteuler.net/problem=20
 * @author hi@danielmaslo.com
 */
public class E020 {
    
    public static int solution() {
	int result = 0;
	BigInteger num = new BigInteger("1");
	
	// factorial
	for (int i = 1; i < 101; i++) {
	    num = num.multiply(BigInteger.valueOf(i));
	}
	
	String s = num.toString();		
		
	Integer.parseInt(String.valueOf(s.charAt(0)));
	
	for (int i = 0; i < s.length(); i++) {
	    result += Integer.parseInt(String.valueOf(s.charAt(i)));	    
	}
	
	return(result);
    }
	
}
