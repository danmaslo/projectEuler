package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=26
 * @author hi@danielmaslo.com
 */
public class E026 {

    public static int solution() {		
	int limit = 1000;
	int max = 0;
	int temp;
	int position = 0;
	
	for (int i = 1; i < limit; i++) {
	    temp = E026.divideCounts(i);
	    
	    if (temp > max ) {
		max = temp;
		position = i;
	    }
	}
	
	return(position);
    }
    
    public static int divideCounts(int num) {
	ArrayList dividers = new ArrayList<>();
	
	int temp = 1;
	
	while(true) {
	    temp = temp % num;
	    temp *= 10;
	    
	    for (int i = 0; i < dividers.size(); i++) {
		if (temp == (int) dividers.get(i)) {
		    return(dividers.size() - i);
		}
	    }
	    
	    dividers.add(temp);
	}
    }
            
}