package Bai3.Bai4;

public class PhuongTien {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double gia;
	
	public PhuongTien() {
		this.tenChuXe = null;
		this.loaiXe = null;
		this.dungTich = 0;
		this.gia = 0;
	}
	
	public PhuongTien(String tenChuXe, String loaiXe, int dungTich, double gia) {
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.gia = gia;
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public double getGia() {
		return gia;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
	
	public double tinhThue() {
		if(this.dungTich < 100) {
			return this.gia * 0.01;
		}else if(this.dungTich > 200) {
			return this.gia * 0.05;
		}else {
			return this.gia * 0.03;
		}
	}
	
	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("--> Nhap ten chu xe: ");
		this.tenChuXe = in.nextLine();
		System.out.println("--> Nhap loai xe: ");
		this.loaiXe = in.nextLine();
		do {
			System.out.println("--> Nhap dung tich: ");
			this.dungTich = in.nextInt();
		}while(this.dungTich <= 0);
		
		do {
			System.out.println("--> Nhap tri gia xe: ");
			this.gia = in.nextDouble();
		}while(this.gia <= 0);
	}
	
	public static void inTieuDe() {
		System.out.printf("%-20s%-20s%15s%20s%20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
	}
	
	public void in() {
		System.out.printf("%-20s%-20s%15d%20.2f%20.2f\n", this.tenChuXe, this.loaiXe, this.dungTich, this.gia, this.tinhThue());
	}

}
