package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @link http://projecteuler.net/problem=11
 * @author hi@danielmaslo.com
 */
public class E011 {

    public static long solution() {
        int result = 0;
        String filename = "./src/input/E011.dat";
        int[][] matrix = new int[20][20];

        // convert file to matrix
        try {
            matrix = E011.importMatrix(20, filename);
        } catch (FileNotFoundException e) {
            System.out.println("There is no file " + filename);
        }

        // find max prod in lines
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                int temp = matrix[i][j] * matrix[i][j+1] * matrix[i][j+2] * matrix[i][j+3];
                result = Math.max(result, temp);
            }
        }

        // find max prod in cols
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 20; j++) {
                int temp = matrix[i][j] * matrix[i+1][j] * matrix[i+2][j] * matrix[i+3][j];
                result = Math.max(result, temp);
            }
        }

        // find max in main diagonal direction
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                int temp = matrix[i][j] * matrix[i+1][j+1] * matrix[i+2][j+2] * matrix[i+3][j+3];
                result = Math.max(result, temp);
            }
        }

        // find max in secondary diagonal direction
        for (int i = 3; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                int temp = matrix[i][j] * matrix[i-1][j+1] * matrix[i-2][j+2] * matrix[i-3][j+3];
                result = Math.max(result, temp);
            }
        }

        return(result);
    }

    public static int[][] importMatrix(int size, String filename) throws FileNotFoundException {
        Scanner cin = new Scanner(new File(filename));
        int [][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = cin.nextInt();
            }
        }

        return(result);
    }

}