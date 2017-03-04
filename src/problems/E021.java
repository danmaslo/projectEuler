package problems;

/**
 * @link http://projecteuler.net/problem=21
 * @author hi@danielmaslo.com
 */
public class E021 {
    
    public static int solution() {
	int result = 0;
	
	//System.out.println(E021.d(E021.d(220)));
		
	for (int i = 1; i < 10000; i++) {	    
	    if (E021.d(E021.d(i)) == i) {
		//System.out.println(i + "\t" + E021.d(i) + "\t" + E021.d(E021.d(i)));
		
		if (E021.d(i) != i) {
		    result += i;
		}
	    }    
	}
	
	return(result);
    }
    
    public static int d(int x) {
	int d = 0;
	
	for (int i = 1; i <= x-1; i++) {	    
	    if (x % i == 0) {
		d += i;
	    }
	}
	
	return(d);
    }
	
}
