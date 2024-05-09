package Bai4.Bai12;

import java.util.Calendar;
import java.util.Date;

public class HangThucPham extends HangHoa {
	private NgayThang ngaySX = new NgayThang();
	private NgayThang ngayHH = new NgayThang();
	private String nhaCC;

	public HangThucPham() {
		super();
	}

	public HangThucPham(String maHang, String tenHang, int slCon, double donGia, double vAT, NgayThang ngaySX,
			NgayThang ngayHH, String nhaCC) {
		super(maHang, tenHang, slCon, donGia, vAT);
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
		this.nhaCC = nhaCC;
	}

	public NgayThang getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(NgayThang ngaySX) {
		this.ngaySX = ngaySX;
	}

	public NgayThang getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(NgayThang ngayHH) {
		this.ngayHH = ngayHH;
	}

	public String getNhaCC() {
		return nhaCC;
	}

	public void setNhaCC(String nhaCC) {
		this.nhaCC = nhaCC;
	}

	@Override
	public String danhGiaMucDoBan() {
		// TODO Auto-generated method stub
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		d = c.getTime();
		c.set(ngayHH.getNam(), ngayHH.getThang(), ngayHH.getNgay());
		if (this.slCon > 0 && d.compareTo(c.getTime()) > 0) {
			return "Kho ban";
		}

		return "Binh thuong";
	}

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		super.nhap();
		System.out.println("--> Nhap nha cung cap: ");
		this.nhaCC = in.nextLine();

		System.out.println("--> Nhap ngay san xuat");
		this.ngaySX.nhap();
		do {
			System.out.println("--> Nhap ngay het han");
			this.ngayHH.nhap();
		} while (this.ngayHH.getThang() < this.ngaySX.getThang()
				|| (this.ngayHH.getThang() == this.ngaySX.getThang() && this.ngayHH.getNgay() < this.ngaySX.getNgay()));
		this.VAT = 0.05;
	}

	public static void inTieuDe() {
		HangHoa.inTieuDe();
		System.out.printf("%10s %10s %15s %15s\n", "Ngay sx", "Ngay hh", "Nha cc", "Ghi chu");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()
				+ String.format("%10s %10s %15s %15s", this.ngaySX, this.ngayHH, this.nhaCC, this.danhGiaMucDoBan());
	}
}
