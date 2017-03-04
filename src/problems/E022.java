package problems;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @link http://projecteuler.net/problem=22
 * @author hi@danielmaslo.com
 */
public class E022 {

    public static int solution() {
        int res = 0;
        String filename = "./src/input/E022.dat";

        String[] splitted = E022.readNames(filename);

        // remove quotes
        for (int i = 0; i < splitted.length; i++) {
            splitted[i] = E022.removeFirstChar(splitted[i]);
            splitted[i] = E022.removeLastChar(splitted[i]);
        }

        Arrays.sort(splitted);

        for (int i = 0; i < splitted.length; i++) {
            res += E022.valueOf(splitted[i]) * (i + 1);
        }

        return (res);
    }

    public static String[] readNames(String pathToFile) {
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
