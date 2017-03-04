package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=41
 * @author hi@danielmaslo.com
 */
public class E041 {

    public static int solution() {
        int res = 0;
        String base = "987654321";

        for (int i = 0; i < base.length(); i++) {
            String temp = base.substring(i, base.length());

            ArrayList<String> permutations = E041.permutation(temp);

            for (int j = 0; j < permutations.size(); j++) {
                int number = Integer.parseInt(permutations.get(j));

                if (E041.isPrime(number)) {
                    if (number > res) {
                        res = number;
                    }
                }
            }
        }

        return(res);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return(false);
        }

        if (n == 2) {
            return(true);
        }

        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return(false);
            }
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