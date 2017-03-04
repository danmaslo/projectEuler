package problems;

/**
 * @link http://projecteuler.net/problem=31
 * @author hi@danielmaslo.com
 */
public class E031 {

    public static int solution() {		
	int sum = 0;
	
	for (int i = 0; i <= 1; i++) { // 200
	    for (int j = 0; j <= 2; j++) { // 100
		for (int k = 0; k <= 5; k++) { // 50
		    for (int l = 0; l <= 10; l++) { // 20
			for (int m = 0; m <= 20; m++) { // 10
			    for (int n = 0; n <= 50; n++) { // 5
				for (int o = 0; o <= 100; o++) { // 2
				    for (int p = 0; p <= 200; p++) { // 1
				        if (i * 200 + j * 100 + k * 50 + l * 20 + m * 10 + n * 5 + o * 2 + p == 200) {
					    sum++;
					}
				    }				    
				}
			    }
			}
		    }
		}
	    }
	}
	
	return(sum);
    }
                
}