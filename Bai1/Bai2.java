package Bai1;

/**
 * chương trình giải phương trình bậc 2, có tính tới nghiệm phức
 * 
 * @author CaoQuynh
 *
 */
public class Bai2 {

	public static void giaiPTB2(float a, float b, float c) {
		float delta = b * b - 4 * a * c;
		if (delta == 0) {
			float x = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x);
		} else {
			float phanThuc = -b / (2 * a);
			float phanAo = (float) (Math.sqrt(Math.abs(delta)) / (2 * a));
			if (delta > 0) {
				System.out.println("Phương trình có 2 nghiệm thực:");
				System.out.println("\tx1 = " + (phanThuc + phanAo));
				System.out.println("\tx2 = " + (phanThuc - phanAo));
			} else {
				System.out.println("Phương trình có 2 nghiệm phức:");
				System.out.println("\tx1 = " + phanThuc + " + " + phanAo + "i");
				System.out.println("\tx2 = " + phanThuc + " - " + phanAo + "i");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c;
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Nhập hệ số a, b, c của phương trình bậc 2");
		do {
			System.out.print("--> Nhập a (a!=0): ");
			a = in.nextFloat();
		} while (a == 0);
		System.out.print("--> Nhập b: ");
		b = in.nextFloat();
		System.out.print("--> Nhập c: ");
		c = in.nextFloat();
		System.out.println("Phương trình vừa nhập: " + a + "x^2 + " + b + "x + " + c + " = 0");
		giaiPTB2(a, b, c);
	}

}
