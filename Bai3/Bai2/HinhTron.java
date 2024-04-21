package Bai3.Bai2;

public class HinhTron {
	private float r;
	private float d;

	public HinhTron() {
		super();
	}

	public HinhTron(float r, float d) {
		this.r = r;
		this.d = d;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float getD() {
		return d;
	}

	public void setD(float d) {
		this.d = d;
	}

	public void nhapThongTin() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int choice;

		System.out.println("===============NHẬP THÔNG TIN HÌNH TRÒN=====================");
		System.out.println("\t1. Nhập bán kính.");
		System.out.println("\t2. Nhập đường kính.");
		System.out.println("--> Bạn muốn nhập: ");
		choice = in.nextInt();

		if (choice == 1) {
			do {
				System.out.println("--> r = ");
				this.r = in.nextFloat();
			} while (r < 0);
			this.d = this.r * 2;
		} else if (choice == 2) {
			do {
				System.out.println("--> d = ");
				this.d = in.nextFloat();
			} while (d < 0);
			this.r = this.d / 2;
		}
	}

	public float tinhChuVi() {
		return (float) (Math.PI * 2 * r);
	}

	public float tinhDienTich() {
		return (float) (Math.PI * r * r);
	}

	public static void inTieuDe() {
		System.out.printf("%10s %10s %10s %10s \n", "Bán kính", "Đường kính", "Chu vi", "Diện tích");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10.2f %10.2f %10.2f %10.2f", this.r, this.d, this.tinhChuVi(), this.tinhDienTich());
	}

}
