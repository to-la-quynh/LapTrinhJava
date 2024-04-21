package Bai3.Bai3;

public class PTB2 {
	private float a, b, c;

	public PTB2() {
		super();
	}

	public PTB2(float a, float b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public void nhapPTB2() {
		java.util.Scanner in = new java.util.Scanner(System.in);

		do {
			System.out.println("--> Nhập hệ số a (a != 0): ");
			this.a = in.nextFloat();
		} while (a <= 0);

		System.out.println("--> Nhập hệ số b: ");
		this.b = in.nextFloat();
		System.out.println("--> Nhập hệ số c: ");
		this.c = in.nextFloat();
	}

	public String giaiPTB2() {
		float delta = b * b - 4 * a * c;
		String res = "";
		if (delta < 0) {
			res = "Phương trình vô nghiệm";
		} else if (delta == 0) {
			res = "Phương trình có nghiệm kép x1 = x2 = " + (-b) / (2 * a);
		} else {
			float x1 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			float x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			res = "Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + "\tx2 = " + x2;
		}
		return res;
	}

	public static void inTieuDe() {
		System.out.printf("%10s %10s %10s %20s \n", "a", "b", "c", "Kết quả");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10.2f %10.2f %10.2f %50s", this.a, this.b, this.c, this.giaiPTB2());
	}
}
