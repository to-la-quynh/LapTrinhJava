package Bai4.Bai3;

public class PTB2 {
	private float a, b, c;

	public float getA() {
		return a;
	}

	public float getB() {
		return b;
	}

	public float getC() {
		return c;
	}

	public void setA(float a) {
		this.a = a;
	}

	public void setB(float b) {
		this.b = b;
	}

	public void setC(float c) {
		this.c = c;
	}

	public PTB2() {
		a = 1;
		b = c = 0;
	}

	public PTB2(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void input() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Nhap he so a, b, c (a != 0):");
		do {
			a = in.nextFloat();
		} while (a == 0);
		b = in.nextFloat();
		c = in.nextFloat();
	}

	public void solve() {
		float delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else if (delta == 0) {
			float x = -b / (2 * a);
			System.out.println("Phuong trinh co nghiem kep: x = " + x);
		} else {
			float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
			float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phuong trinh co 2 nghiem phan biet:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}

	public static void printHeader() {
		System.out.printf("%10s%10s%10s%n", "a", "b", "c");
	}

	public void printRes() {
		System.out.printf("%10f%10f%10f%n", this.a, this.b, this.c);
		this.solve();
	}
}
