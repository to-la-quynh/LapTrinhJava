package Bai1;

/**
 * chương trình tính C(m,n)
 * 
 * @author CaoQuynh
 *
 */
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int) (Math.random() * 20);
		int m = (int) (Math.random() * 20);
		if (n < m) {
			System.out.println("DỮ LIỆU KHÔNG HỢP LỆ!");
		} else {
			Bai3 a = new Bai3();
			long n_giaiThua = a.factorial(n);
			long m_giaiThua = a.factorial(m);
			long n_m_giaiThua = a.factorial(n - m);
			long cmn = n_giaiThua / (m_giaiThua * n_m_giaiThua);
			System.out.println("C(" + m + ", " + n + ") = " + cmn);
		}
	}

}
