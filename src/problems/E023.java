package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=23
 * @author hi@danielmaslo.com
 */
public class E023 {

    public static long solution() {	
	int res = 0;
	ArrayList<Integer> abundants = new ArrayList<>();
	
	for (int i = 0; i <= 28123; i++) {
	    if (E023.isAbundant(i)) {
		abundants.add(i);
	    }	    
	}
	    
	for (int i = 1; i <= 28123; i++) {
	    if (!E023.isAbundantSum(i, abundants)) {
		res += i;
	    }
	}
	
        return(res);
    }
    
    public static boolean isPerfect(int x) {
	int sum = 0;
	
	for (int i = 1; i <= x/2; i++) {
	    if (x % i == 0) {
		sum += i;
	    }
	}
	
	return(sum == x);
    }
	
    public static boolean isAbundant(int x) {
	int sum = 0;
	
	for (int i = 1; i <= x/2; i++) {
	    if (x % i == 0) {
		sum += i;
	    }
	}
	
	return(sum > x);
    }
    
    public static boolean isAbundantSum(int x, ArrayList<Integer> list) {
	boolean res = false;
	
	for (int i = 0; i < list.size(); i++) {
	    for (int j = 0; j < list.size(); j++) {
		if (x == (list.get(i) + list.get(j))) {
		    return(true);
		}
	    }	    
	}
	
	return(res);
    }
    
}