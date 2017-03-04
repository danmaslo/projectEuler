package problems;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @link http://projecteuler.net/problem=29
 * @author hi@danielmaslo.com
 */
public class E029 {

    public static int solution() {		
	int aMin = 2;
	int aMax = 100;
	int bMin = 2;
	int bMax = 100;
	int result;    
	
	ArrayList pows = new ArrayList<>(); 
	
	for (int a = aMin; a <= aMax; a++) {
	    for (int b = bMin; b <= bMax; b++) {
		pows.add(Math.pow(a, b));
	    }
	}
	
	Comparator c = (Comparator) (Object o1, Object o2) -> {
	    if ((double) o1 > (double) o2) {
		return 1;
	    }
	    else if (((double) o1 < (double) o2)) {
		return -1;
	    }
	    else {
		return 0;
	    }
	};
	
	pows.sort(c);
	
	result = pows.size();
	
	for (int i = 1; i < pows.size(); i++) {
	    if (pows.get(i).equals(pows.get(i - 1))) {
		result--;
	    }
	}
	
	return(result);
    }
                
}