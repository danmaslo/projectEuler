package problems;

/**
 * @link http://projecteuler.net/problem=40
 * @author hi@danielmaslo.com
 */
public class E040 {
    public static int solution() {
        int result = 1;

        result *= E040.getDigit(1);
        result *= E040.getDigit(10);
        result *= E040.getDigit(100);
        result *= E040.getDigit(1000);
        result *= E040.getDigit(10000);
        result *= E040.getDigit(100000);
        result *= E040.getDigit(1000000);

        return(result);
    }

    public static int getDigit(int n) {
        // how many digits has the number with n-th digit
        int digits = 0;
        int digitsSum = 0;

        while (true) {
            digitsSum += digits * E040.getNumbers(digits);

            if (n <= digitsSum) {
                break;
            }

            digits++;
        }

        digitsSum = 0;

        for (int i = 1; i < digits; i++) {
            digitsSum += i * E040.getNumbers(i);
        }

        int number = (int) Math.ceil((double) (n - digitsSum) / (double) digits);
        int numberNumber = digits - (int) Math.round(digits * (number - (double) (n - digitsSum) / (double) digits));

        //System.out.println(number + " (" + numberNumber + " cislice). cislo v " + digits + " mistnych = " + E040.getNumber(digits, number));

        return(E040.getDigitInNumber(numberNumber, E040.getNumber(digits, number)));
    }

    public static int getDigitInNumber(int n, int number) {
        String temp = Integer.toString(number);

        return(Integer.parseInt(String.valueOf(temp.charAt(n - 1))));
    }

    public static int getNumbers(int digits) {
        if (digits < 1) {
            return(0);
        }
        else {
            int start = (int) Math.pow(10, digits - 1);
            int end = (int) Math.pow(10, digits);

            return(end - start);
        }
    }

    public static int getNumber(int digits, int order) {
        int pow = digits - 1;
        int base = (int) Math.pow(10, pow);

        return(base + order - 1);
    }
}
