package problems;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @link http://projecteuler.net/problem=42
 * @author hi@danielmaslo.com
 */
public class E042 {

    public static int solution() {
        int res = 0;
        int max = 0;
        String filename = "./src/input/E042.dat";

        String[] splitted = E042.readWords(filename);
        int[] values = new int[splitted.length];

        // remove quotes
        for (int i = 0; i < splitted.length; i++) {
            splitted[i] = E042.removeFirstChar(splitted[i]);
            splitted[i] = E042.removeLastChar(splitted[i]);
        }

        for (int i = 0; i < splitted.length; i++) {
            values[i] = E042.valueOf(splitted[i]);

            if (values[i] > max) {
                max = values[i];
            }
        }

        ArrayList<Integer> triangleNumbers = new ArrayList<>();
        int n = 0;

        while (true) {
            n++;

            int temp = (int) (0.5 * n * (n + 1));
            triangleNumbers.add(temp);

            if (temp > max) {
                break;
            }
        }

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < triangleNumbers.size(); j++) {
                if (values[i] == triangleNumbers.get(j)) {
                    res++;
                }
            }
        }

        return (res);
    }

    public static String[] readWords(String pathToFile) {
        String[] splitted = null;

        try {
            // Open the file
            FileInputStream fstream = new FileInputStream(pathToFile);

            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // split the line on your splitter(s)
                splitted = strLine.split(","); // here - is used as the delimiter
            }
            //Close the input stream
            in.close();
        }
        catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        return (splitted);
    }

    public static String removeFirstChar(String s) {
        return s.substring(1);
    }

    public static String removeLastChar(String s) {
        return s.substring(0, s.length() - 1);
    }

    public static int valueOf(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            sum += ch - 64;
        }

        return (sum);
    }

}
