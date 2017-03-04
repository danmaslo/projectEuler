package problems;

/**
 * @link http://projecteuler.net/problem=38
 * @author hi@danielmaslo.com
 */
public class E038 {
    public static int solution() {
        int result = 0;

        for (int i = 1; i < 10000; i++) {
            for (int j = 2; j < 10; j++) {
                int temp = 0;
                String tempString = "";

                for (int k = 1; k <= j; k++) {
                    temp = i * k;
                    tempString += Integer.toString(temp);
                }

                if (E038.isConcated(tempString)) {
                    int number = Integer.parseInt(tempString);

                    if (number > result) {
                        result = number;
                    }
                }
            }
        }

        return(result);
    }

    public static boolean isConcated(String input) {
        if (input.length() != 9) {
            return(false);
        }
        else {
            if (input.contains("1")) {
                if (input.contains("2")) {
                    if (input.contains("3")) {
                        if (input.contains("4")) {
                            if (input.contains("5")) {
                                if (input.contains("6")) {
                                    if (input.contains("7")) {
                                        if (input.contains("8")) {
                                            if (input.contains("9")) {
                                                return(true);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return(false);
    }

}
