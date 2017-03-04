package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @link http://projecteuler.net/problem=67
 * @author hi@danielmaslo.com
 */
public class E067 {

	public static long solution() {

		int[][] matrix = new int[100][100];
		String filename = "./src/input/E067.dat";

		// convert file to matrix
		try {
			matrix = E067.importTriangleMatrix(100, filename);
		} catch (FileNotFoundException e) {
			System.out.println("There is no file " + filename);
		}

		// solving
		int rows = matrix[0].length;

		for (int i = rows - 2; i >= 0; i--) {
			for (int j = 0; j < matrix.length - 1; j++) {
				matrix[i][j] += Math.max(matrix[i+1][j], matrix[i+1][j+1]);
			}
		}

		return(matrix[0][0]);
	}

	public static int[][] importTriangleMatrix(int size, String filename) throws FileNotFoundException {
		Scanner cin = new Scanner(new File(filename));
		int [][] result = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j > i) {
					result[i][j] = 0;
				}
				else {
					result[i][j] = cin.nextInt();
				}
			}
		}

		return(result);
	}

}