package Bai3.Bai1;

public class HCN {
	private float chieuDai;
	private float chieuRong;
	
	public HCN() {
		this.chieuDai = 0;
		this.chieuRong = 0;
	}
	
	public HCN(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public float getChieuDai() {
		return chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	public float tinhChuVi() {
		return (this.chieuDai + this.chieuRong)*2;
	}
	
	public float tinhDienTich() {
		return this.chieuDai*this.chieuRong;
	}
	
	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
			System.out.println("--> Nhap chieu rong: ");
			this.chieuRong = in.nextFloat();
		}while(this.chieuRong < 0);
		
		do {
			System.out.println("--> Nhap chieu dai: ");
			this.chieuDai = in.nextFloat();
		}while(this.chieuDai < 0);
	}
	
	public void in() {
		System.out.println("Chieu dai HCN = " + this.chieuDai);
		System.out.println("Chieu rong HCN = " + this.chieuRong);
		System.out.println("Chu vi = " + tinhChuVi());
		System.out.println("Dien tich = " + tinhDienTich());
	}

}
