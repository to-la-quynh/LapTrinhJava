package Bai8.Bai2;

public class HinhTron {
	private double r;

	public HinhTron() {
		super();
	}

	public HinhTron(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double tinhDienTich() {
		return Math.PI * r * r;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10.2f %10.2f", this.r, this.tinhDienTich());
	}

}
