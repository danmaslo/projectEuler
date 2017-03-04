package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=43
 * @author hi@danielmaslo.com
 */
public class E043 {

    public static Long solution() {
        Long sum = new Long(0);

        ArrayList<String> permutations = E043.permutation("9876543210");

        for (int j = 0; j < permutations.size(); j++) {
            if (E043.isInterestingDividable(permutations.get(j))) {
                sum += Long.parseLong(permutations.get(j));
            }
        }

        return(sum);
    }

    public static boolean isInterestingDividable(String str) {
        int d24 = Integer.parseInt(str.substring(1, 4));
        int d35 = Integer.parseInt(str.substring(2, 5));
        int d46 = Integer.parseInt(str.substring(3, 6));
        int d57 = Integer.parseInt(str.substring(4, 7));
        int d68 = Integer.parseInt(str.substring(5, 8));
        int d79 = Integer.parseInt(str.substring(6, 9));
        int d810 = Integer.parseInt(str.substring(7, 10));

        if (d24 % 2 != 0) {
            return(false);
        }

        if (d35 % 3 != 0) {
            return(false);
        }

        if (d46 % 5 != 0) {
            return(false);
        }

        if (d57 % 7 != 0) {
            return(false);
        }

        if (d68 % 11 != 0) {
            return(false);
        }

        if (d79 % 13 != 0) {
            return(false);
        }

        if (d810 % 17 != 0) {
            return(false);
        }

        return(true);
    }

    public static ArrayList<String> permutation(String str) {
        ArrayList<String> result = new ArrayList<>();

        if (str == null) {
            return(null);
        }
        else if (str.length() == 0) {
            result.add("");
            return(result);
        }

        char firstChar = str.charAt(0);
        String rem = str.substring(1);
        ArrayList<String> words = permutation(rem);

        for (String newString : words) {
            for (int i = 0; i <= newString.length(); i++) {
                result.add(charAdd(newString, firstChar, i));
            }
        }

        return(result);
    }

    public static String charAdd(String str, char c, int j) {
        String first = str.substring(0, j);
        String last = str.substring(j);

        return(first + c + last);
    }

}