package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=24
 * @author hi@danielmaslo.com
 */
public class E024 {

    public static String solution() {		
	int counter = 1;
	
	ArrayList<String> perms = new ArrayList<>();
	
	//for (i = 123456789; i <= 9876543210; i++) {
	
	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		for (int k = 0; k < 10; k++) {		    
		    for (int l = 0; l < 10; l++) {
			for (int m = 0; m < 10; m++) {
			    for (int n = 0; n < 10; n++) {
				for (int o = 0; o < 10; o++) {
				    for (int p = 0; p < 10; p++) {
					for (int q = 0; q < 10; q++) {
					    for (int r = 0; r < 10; r++) {
						if (E024.isUnique(i, j, k, l, m, n, o, p, q, r)) {
						    perms.add(new String(i + "" + j + "" + k + "" + l + "" + m + "" + n + "" + o + "" + p + "" + q + "" + r));
						    
						    if (counter++ == 1000000) {
							return(new String(i + "" + j + "" + k + "" + l + "" + m + "" + n + "" + o + "" + p + "" + q + "" + r));
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
	    }	    
	}
	
	return("FAIL");
    }
    
    public static boolean isUnique(int... args) {
	boolean res = true;
	
	for (int i = 1; i < args.length; i++) {	    
	    for (int j = 0; j < i; j++) {
		if (args[i] == args[j]) {
		    return(false);
		}		
	    }
	}
	
	return(res);
    }
        
}