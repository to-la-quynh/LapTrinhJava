package Bai4.Bai12;

import java.util.Calendar;
import java.util.Date;

public class HangSanhSu extends HangHoa {
	private String nhaSX;
	private NgayThang ngayNK = new NgayThang();

	public HangSanhSu() {
		super();
	}

	public HangSanhSu(String maHang, String tenHang, int slCon, double donGia, double vAT, String nhaSX,
			NgayThang ngayNK) {
		super(maHang, tenHang, slCon, donGia, vAT);
		this.nhaSX = nhaSX;
		this.ngayNK = ngayNK;
	}

	public String getNhaSX() {
		return nhaSX;
	}

	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}

	public NgayThang getNgayNK() {
		return ngayNK;
	}

	public void setNgayNK(NgayThang ngayNK) {
		this.ngayNK = ngayNK;
	}

	@Override
	public String danhGiaMucDoBan() {
		// TODO Auto-generated method stub
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		d = c.getTime();
		c.set(ngayNK.getNam(), ngayNK.getThang(), ngayNK.getNgay());
		c.roll(Calendar.DAY_OF_MONTH, 10);

		if (this.slCon > 50 && d.compareTo(c.getTime()) > 0)
			return "Ban cham";
		return "Binh thuong";
	}

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		super.nhap();
		System.out.println("--> Nhap nha san xuat: ");
		this.nhaSX = in.nextLine();
		System.out.println("--> Nhap ngay nhap kho");
		this.ngayNK.nhap();
		this.VAT = 0.01;
	}

	public static void inTieuDe() {
		HangHoa.inTieuDe();
		System.out.printf("%20s %10s %15s \n", "Nha SX", "Ngay NK", "Ghi chu");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("%20s %10s %15s", this.nhaSX, this.ngayNK, this.danhGiaMucDoBan());
	}
}
