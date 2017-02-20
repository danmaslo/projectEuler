package problems;

import java.math.BigInteger;

/**
 * @link http://projecteuler.net/problem=16
 * @author hi@danielmaslo.com
 */
public class E016 {

    public static long solution() {
        int input = 1000;        
        long result = 0;
        
        BigInteger bi  = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);
        
        for (int i = 0; i < input; i++) {                        
            bi = bi.multiply(two);
        }                
        
        result = E016.digiSum(bi.toString());
        
        return(result);        
    }
    
    public static long digiSum(String digits) {        
        int sum = 0;
        for (char c: digits.toCharArray())            
            sum += c - '0';
        return sum;
    }
	
}
