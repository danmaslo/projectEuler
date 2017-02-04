package problems;

import java.math.BigInteger;

/**
 * @link http://projecteuler.net/problem=3
 * @author hi@danielmaslo.com
 */
public class E003 {
    public static BigInteger solution() {
        BigInteger input = new BigInteger("600851475143");
        BigInteger i     = new BigInteger("2");
        BigInteger zero  = new BigInteger("0");

        while (i.compareTo(input) < 0) {
            if (input.mod(i).compareTo(zero) == 0) {
                input = input.divide(i);
            }

            i = i.add(new BigInteger("1"));
        }

        return(input);
    }
}