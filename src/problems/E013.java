package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @link http://projecteuler.net/problem=13
 * @author hi@danielmaslo.com
 */
public class E013 {

    public static String solution() {
        BigDecimal result = new BigDecimal(0);
        String filename = "./src/input/E013.dat";
        BigDecimal[] matrix = new BigDecimal[100];

        // convert file to matrix
        try {
            matrix = E013.importMatrix(100, filename);
        } catch (FileNotFoundException e) {
            System.out.println("There is no file " + filename);
        }

        for (int i = 0; i < 100; i++) {
            result = result.add(new BigDecimal(String.valueOf(matrix[i])));
        }

        return(result.toString().substring(0, 10));
    }

    public static BigDecimal[] importMatrix(int size, String filename) throws FileNotFoundException {
        Scanner cin = new Scanner(new File(filename));
        BigDecimal[] result = new BigDecimal[size];

        for (int i = 0; i < size; i++) {
            result[i] = cin.nextBigDecimal();
        }

        return(result);
    }

}