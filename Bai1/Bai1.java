package Bai1;

/**
 * chương trình kiểm tra một số n có phải nguyên tố hay không?
 * 
 * @author CaoQuynh
 *
 */
public class Bai1 {

	public static boolean isPrime(int n) {
		boolean flag = true;
		if (n < 2) {
			flag = false;
		} else {
			for (int i = 2; i < (int) Math.sqrt(n); i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int) (Math.random() * 100); // Sinh ngau nhien 1 so nguyen trong khoan [0 - 100);

		if (isPrime(n)) {
			System.out.println(n + " là số nguyên tố.");
		} else {
			System.out.println(n + " không là số nguyên tố.");
		}
	}

}
