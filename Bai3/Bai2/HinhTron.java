package Bai3.Bai2;

public class HinhTron {
	private float r, d; // r:ban kinh, d: duong kinh

	public HinhTron() {
		this.r = 0;
	}

	public HinhTron(float r) {
		this.r = r;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float tinhChuVi() {
		return (float) (2 * Math.PI * this.r);
	}

	public float tinhDienTich() {
		return (float) (Math.PI * r * r);
	}

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
			System.out.println("--> Nhap ban kinh hinh tron: ");
			this.r = in.nextFloat();
		} while (this.r < 0);
	}

	public static void inTieuDe() {
		System.out.printf("%15s%15s%15s\n", "Ban kinh", "Chu vi", "Dien tich");
	}

	public void in() {
		System.out.printf("%15.2f%15.2f%15.2f\n", this.r, this.tinhChuVi(), this.tinhDienTich());
	}

}
