package problems;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=45
 * @author hi@danielmaslo.com
 */
public class E045 {

    public static BigInteger solution() {
        ArrayList<BigInteger> pentagonals = new ArrayList<>();
        ArrayList<BigInteger> hexagonals = new ArrayList<>();
        long n = 286;
        
        // fill in pentagonals and hexagonals
        for (int i = 1; i < n; i++) {
            pentagonals.add(E045.pentagonal(i));
            hexagonals.add(E045.hexagonal(i));
        }

        while (true) {
            BigInteger t = E045.triangular(n);

            if (pentagonals.contains(t)) {
                if (hexagonals.contains(t)) {
                    return(t);
                }
            }

            pentagonals.add(E045.pentagonal(n));
            hexagonals.add(E045.hexagonal(n));
            n++;
        }
    }

    public static BigInteger triangular(long n) {
        BigInteger n0 = BigInteger.valueOf(n);
        BigInteger n1 = n0.add(BigInteger.ONE);

        n0 = n0.multiply(n1);
        n0 = n0.divide(BigInteger.valueOf(2));

        //return(n * (n + 1) / 2);
        return(n0);
    }

    public static BigInteger pentagonal(long n) {
        BigInteger n0 = BigInteger.valueOf(n);
        BigInteger n3 = n0.multiply(BigInteger.valueOf(3));

        n3 = n3.subtract(BigInteger.ONE);
        n3 = n3.multiply(n0);
        n3 = n3.divide(BigInteger.valueOf(2));

        //return(n * (3 * n - 1) / 2);
        return(n3);
    }

    public static BigInteger hexagonal(long n) {
        BigInteger n0 = BigInteger.valueOf(n);
        BigInteger n2 = n0.multiply(BigInteger.valueOf(2));

        n2 = n2.subtract(BigInteger.ONE);
        n2 = n2.multiply(n0);

        //return(n * (2 * n - 1));
        return(n2);
    }

}