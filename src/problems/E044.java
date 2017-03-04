package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=44
 * @author hi@danielmaslo.com
 */
public class E044 {

    public static int solution() {
        ArrayList<Integer> pentagonals = new ArrayList<>();
        int n = 1;
        int d = 0;

        while (true) {
            int pj = E044.pentagonal(n);

            for (int i = 0; i < pentagonals.size(); i++) {
                int p = pentagonals.get(i);
                int pk = pj - p;

                if (pentagonals.contains(pk)) {
                    d = pk - p;

                    if (pentagonals.contains(d)) {
                        return(d);
                    }
                }
            }

            pentagonals.add(pj);
            n++;
        }
    }

    public static int pentagonal(int n) {
        return(n * (3 * n - 1) / 2);
    }

}