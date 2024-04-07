package Bai1;

/**
 * chương trình tính n!
 * 
 * @author CaoQuynh
 *
 */
public class Bai3 {

	public static long factorial(int n) {
		long res = 1l;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int) (Math.random() * 50);
		long res = factorial(n);
		System.out.println(n + "! = " + res);
	}

}
