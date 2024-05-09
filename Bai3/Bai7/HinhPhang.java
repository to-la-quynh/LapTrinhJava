package Bai3.Bai7;

public abstract class HinhPhang {
	public abstract void nhap();

	public abstract double tinhChuVi();

	public abstract double tinhDienTich();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10.2d %10.2d", tinhChuVi(), tinhDienTich());
	}
}
