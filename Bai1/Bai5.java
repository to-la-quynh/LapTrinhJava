package Bai1;

/**
 * chương trình tìm UCLN của 2 số
 * 
 * @author CaoQuynh
 *
 */
public class Bai5 {

	public static int UCLN(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			while (b != 0) {
				int r = a % b;
				a = b;
				b = r;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int res = UCLN(a, b);
		System.out.println("UCLN(" + a + ", " + b + ") = " + res);
	}

}
