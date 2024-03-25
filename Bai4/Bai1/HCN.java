package Bai4.Bai1;

public class HCN {
	private float length;
	private float width;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public HCN() {
		this.length = 0;
		this.width = 0;
	}

	public HCN(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}

	public float tinhChuVi() {
		return (this.length + this.width) * 2;
	}

	public float tinhDienTich() {
		return this.length * this.width;
	}

	public void input() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("--> Nhap chieu dai HCN: ");
		length = in.nextFloat();
		System.out.println("Nhap chieu rong HCN: ");
		width = in.nextFloat();
	}

	public static void printHeader() {
		System.out.printf("%15s%15s%15s%15s%n", "Chieu dai ", "Chieu rong ", " Chi vi", "Dien tich");
	}

	public void output() {
		System.out.printf("%15.1f%15.1f%15.1f%15.1f%n", this.width, this.length, this.tinhChuVi(), this.tinhDienTich());

	}

}
