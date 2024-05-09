package Bai3.Bai7;

public class HinhChuNhat extends HinhPhang {
	private float a, b;

	public HinhChuNhat() {
		super();
	}

	public HinhChuNhat(float a, float b) {
		super();
		this.a = a;
		this.b = b;
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

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return (a + b) * 2;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
			System.out.println("--> Nhap chieu dai hcn: ");
			this.a = in.nextFloat();
		}while(this.a <= 0);
		
		do {
			System.out.println("--> Nhap chieu rong hcn: ");
			this.b = in.nextFloat();
		}while(this.b <= 0);
	}

}
