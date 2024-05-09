package Bai3.Bai7;

public class HinhVuong extends HinhPhang {
	private float a;

	public HinhVuong() {
		super();
	}

	public HinhVuong(float a) {
		super();
		this.a = a;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 4 * a;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return a * a;
	}

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
			System.out.println("--> Nhap do dai canh hinh vuong: ");
			this.a = in.nextFloat();
		} while (a <= 0);
	}


}
