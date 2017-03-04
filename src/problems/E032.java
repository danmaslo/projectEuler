package problems;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @link http://projecteuler.net/problem=32
 * @author hi@danielmaslo.com
 */
public class E032 {

	public static int solution() {
		int sum = 0;

		ArrayList products = new ArrayList<>();

		// 1 digit • 4 digits
		for (int i = 1; i < 10; i++) {
			for (int j = 1000; j < 10000; j++) {
				if (E032.isUnusualProduct(i, j)) {
					products.add(i * j);
				}
			}
		}

		// 2 digits • 3 digits
		for (int i = 10; i < 100; i++) {
			for (int j = 100; j < 1000; j++) {
				if (E032.isUnusualProduct(i, j)) {
					products.add(i * j);
				}
			}
		}

		Comparator c = (Comparator) (Object o1, Object o2) -> {
			if ((int) o1 > (int) o2) {
				return 1;
			} else if (((int) o1 < (int) o2)) {
				return -1;
			} else {
				return 0;
			}
		};

		products.sort(c);

		for (int i = 0; i < products.size(); i++) {
			if (i > 0) {
				if (products.get(i).equals(products.get(i - 1))) {

				} else {
					sum += (int) products.get(i);
				}
			} else {
				sum += (int) products.get(i);
			}
		}

		return (sum);
	}

	public static boolean isUnusualProduct(int i, int j) {
		Integer x = i;
		Integer y = j;
		long preP = i * j;
		Integer p;

		if (preP < Integer.MAX_VALUE) {
			p = i * j;
		} else {
			return (false);
		}

		String sx = x.toString();
		String sy = y.toString();
		String sp = p.toString();

		String all = sx.concat(sy).concat(sp);

		ArrayList digits = new ArrayList<>();

		for (int k = 0; k < all.length(); k++) {
			Integer temp = Integer.parseInt(all.substring(k, k + 1));

			if (digits.contains(temp)) {
				return (false);
			} else {
				digits.add(temp);
			}
		}

		Comparator c = (Comparator) (Object o1, Object o2) -> {
			if ((int) o1 > (int) o2) {
				return 1;
			} else if (((int) o1 < (int) o2)) {
				return -1;
			} else {
				return 0;
			}
		};

		digits.sort(c);

		for (int k = 0; k < digits.size(); k++) {
			if ((int) digits.get(k) != (k + 1)) {
				return (false);
			}
		}

		return (true);
	}

}