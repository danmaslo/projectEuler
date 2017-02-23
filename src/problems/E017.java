package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=17
 * @author hi@danielmaslo.com
 */
public class E017 {

    public static long solution() {
        int input = 1000;        
        long result = 0;
        
        ArrayList<Integer> s = new ArrayList<Integer>();
               
        for (int i = 0; i < input + 1; i++) {
            s.add(i, 0);           
        }
        
        s.set(0, 0);
        
        s.set(1, 3);
        s.set(2, 3);
        s.set(3, 5);
        s.set(4, 4);
        s.set(5, 4);
        s.set(6, 3);
        s.set(7, 5);
        s.set(8, 5);
        s.set(9, 4);
        
        s.set(10, 3);
        s.set(11, 6);
        s.set(12, 6);
        s.set(13, 8);
        s.set(14, 8);
        s.set(15, 7);
        s.set(16, 7);
        s.set(17, 9);
        s.set(18, 8);
        s.set(19, 8);
        
        s.set(20, 6);        
        s.set(30, 6);
        s.set(40, 5);
        s.set(50, 5);
        s.set(60, 5);
        s.set(70, 7);
        s.set(80, 6);
        s.set(90, 6);
        
        int hundred = 7;
        
        s.set(1000, 8 + 3);
        
        
        // 20 < define < 100
        for (int i = 2; i < 10; i++) {             
            for (int j = 1; j < 10; j++) {
                s.set(10*i + j, s.get(i*10) + s.get(j));                
            }
        }
                
        // 101 < define < 999
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int temp = 0;
                    
                    if ( (j > 0) || (k > 0) ) {
                        temp += 3;
                    }
                                        
                    temp += s.get(10*j + k);
                                        
                    s.set(100*i + 10*j + k, s.get(i) + hundred + temp);
                }                
            }
        }
        
        
        // sum
        for (int i = 1; i < input + 1; i++) {
            System.out.println(i + ": " + s.get(i));
            result += s.get(i);            
        }
        
        return(result);
    }
	
}
