/**
 * Project Euler
 *
 * @link https://projecteuler.net/
 * @author hi@danielmaslo.com
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int problem = 0;

        if (args.length > 0) {
            // grab terminal parameter
            problem = Integer.parseInt(args[0]);
        }
        else {
            // ask for problem number
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a problem number: ");
            problem = reader.nextInt();
        }

        if (problem > 0) {
            // build classname
            String className = "problems.E" + String.format("%03d", problem);

            // find solution method
            try {
                Method m = Class.forName(className).getMethod("solution");

                // print solution to terminal
                System.out.println((int) m.invoke(null));
            }
            catch (ClassNotFoundException e) {
                System.out.println("Problem not solved (yet...)");
            }
        }
        else {
            System.out.println("Invalid problem number");
        }
    }
}
