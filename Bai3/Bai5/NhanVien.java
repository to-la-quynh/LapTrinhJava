package Bai3.Bai5;

public class NhanVien {
	private String hoDem, ten;
	private Ngay ngaySinh = new Ngay();
	private Ngay ngayVaoLam = new Ngay();
	static java.util.Scanner in = new java.util.Scanner(System.in);

	public NhanVien() {
		super();
	}

	public NhanVien(String hoDem, String ten, Ngay ngaySinh, Ngay ngayVaoLam) {
		super();
		this.hoDem = hoDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.ngayVaoLam = ngayVaoLam;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Ngay getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Ngay getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(Ngay ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	public void nhapNhanVien() {
		System.out.println("--> Nhap ho dem: ");
		this.hoDem = in.nextLine();
		System.out.println("--> Nhap ten: ");
		this.ten = in.nextLine();
		do {
			System.out.println("--> Nhap ngay sinh: ");
			this.ngaySinh.nhapNgay();
		} while (!this.ngaySinh.checkDate());

		do {
			System.out.println("--> Nhap ngay vao lam: ");
			this.ngayVaoLam.nhapNgay();
		} while (!this.ngayVaoLam.checkDate());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-20s %-15s %10s %10s", this.hoDem, this.ten, this.ngaySinh, this.ngayVaoLam);
	}

	public static void inTieuDe() {
		System.out.printf("%-20s %-15s %10s %10s \n", "Ho dem", "Ten", "Ngay sinh", "Ngay vao lam");
	}

}
