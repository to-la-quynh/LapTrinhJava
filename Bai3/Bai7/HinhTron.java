package Bai3.Bai7;

public class HinhTron extends HinhPhang {
	private float r;

	public HinhTron() {
		super();
	}

	public HinhTron(float r) {
		super();
		this.r = r;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
			System.out.println("--> Nhap ban kinh hinh tron: ");
			this.r = in.nextFloat();
		} while (this.r <= 0);
	}

}
