package chapter05;
/**
 * Prevent a division by zero using ?
 * @author maxwilson
 *05 Jun 2020
 */

public class NoZeroDiv {
	public static void main(String args[]) {
		int result;
		for (int i = -5; i < 6; i++) {
			result = i != 0 ? 100 / i : 0;
			System.out.println("100 / " + i + " is " + result); 
		}
	}

}
