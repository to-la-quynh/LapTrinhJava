package Bai4.Bai2;

import java.util.ArrayList;

public class HinhTron {
	private float r;

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public HinhTron() {
		r = 0;
	}

	public HinhTron(float r) {
		this.r = r;
	}

	public double tinhChuVi() {
		return Math.PI * 2 * r;
	}

	public double tinhDienTich() {
		return Math.PI * r * r;
	}

	public static void printHeader() {
		System.out.printf("%15s%15s%15s%n", "Ban kinh ", " Chi vi", "Dien tich");
	}

	public void input() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("--> Nhap ban kinh hinh tron: ");
		r = in.nextFloat();
	}

	public void output() {
		System.out.printf("%15.3f%15.3f%15.3f%n", this.r, this.tinhChuVi(), this.tinhDienTich());
	}

}
