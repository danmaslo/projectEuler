package problems;

import java.util.ArrayList;

/**
 * @link http://projecteuler.net/problem=19
 * @author hi@danielmaslo.com
 */
public class E019 {

    public static int solution() {
	int result = 0;
	
	for (int y = 1901; y < 2001; y++) {
	    for (int m = 1; m < 13; m++) {
		if (E019.whatDay(1, m, y) == 7) {
		    result++;
		}
	    }	    
	}
	
	return(result);
    }
    
    public static int whatDay(int day, int month, int year) {
	return((E019.dayDistance(day, month, year) % 7) + 1);
    }
    
    public static int dayDistance(int day, int month, int year) {
	int result = 0;
	
	ArrayList<Integer> m = new ArrayList<>();
	
	m.add(31);
	m.add(28);
	m.add(31);
	m.add(30);
	m.add(31);
	m.add(30);
	m.add(31);
	m.add(31);
	m.add(30);
	m.add(31);
	m.add(30);
	m.add(31);
	
	// years
	for (int i = 1900; i < year; i++) {
	    if (E019.isLeapYear(i)) {
		result += 366;
	    }
	    else {
		result += 365;
	    }
	}
	
	// months
	if (E019.isLeapYear(year)) {
	    for (int i = 0; i < (month - 1); i++) {
		result += m.get(i);
	    }
	    
	    if (month > 2) {
		result++; // leap year February
	    }
	}
	else {
	    for (int i = 0; i < (month - 1); i++) {
		result += m.get(i);
	    }
	}
	
	// days
	result += day;
	
	return(--result);
    }
    
    public static boolean isLeapYear(int year) {
	if (year % 4 == 0) {
	    if (year % 100 == 0) {
		if (year % 400 == 0) {
		    return(true);
		}
		else {
		    return(false);
		}
	    }
	    else {
		return(true);
	    }
	}
	else {
	    return(false);
	}
    }
    	
}
