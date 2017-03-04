package problems;

/**
 * @link http://projecteuler.net/problem=27
 * @author hi@danielmaslo.com
 */
public class E027 {

    public static int solution() {		
	int aMin = -999;
	int aMax = 999;
	int bMin = -1000;
	int bMax = 1000;
	
	int bestA = -10000;
	int bestB = -10000;
	int bestN = 0;
	
	for (int i = aMin; i <= aMax; i++) {
	    for (int j = bMin; j < bMax; j++) {
	
		int n = 0;
		int temp = 0;
		
		while(true) {
		    temp = E027.formula(i, j, n++);
		    
		    if (!E027.isPrime(temp)) {
			if (n > bestN) {
			    bestN = n;
			    bestA = i;
			    bestB = j;
			}
			
			//System.out.println(i + "\t" + j + "\t" + n);
			
			break;
		    }
		}
		
	    }
	}
	
	//System.out.println(bestA + "\t" + bestB + "\t" + bestN);
	
	return(bestA * bestB);
    }
    
    public static int formula(int a, int b, int n) {
	return(n*n + a*n + b);
    }

	public static boolean isPrime(int n) {
		if (n < 2) {
			return(false);
		}

		if (n == 2) {
			return(true);
		}

		for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
			if (n % i == 0) {
				return(false);
			}
		}

		return(true);
	}
            
}