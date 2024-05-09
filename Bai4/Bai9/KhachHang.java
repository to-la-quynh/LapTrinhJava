package Bai4.Bai9;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private Date ngayRaHD = new Date();
	private int soLuong;
	private double donGia;

	public KhachHang() {
		super();
	}

	public KhachHang(String maKH, String hoTen, Date ngayRaHD, int soLuong, double donGia) {
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayRaHD = ngayRaHD;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgayRaHD() {
		return ngayRaHD;
	}

	public void setNgayRaHD(Date ngayRaHD) {
		this.ngayRaHD = ngayRaHD;
	}

	public double getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("--> Nhap ma khach hang: ");
		this.maKH = in.nextLine();
		System.out.println("--> Nhap ten khach hang: ");
		this.hoTen = in.nextLine();
		this.ngayRaHD.nhap();
		do {
			System.out.println("--> Nhap so luong: ");
			this.soLuong = in.nextInt();
			in.nextLine();
		}while(this.soLuong < 0);
		
		do {
			System.out.println("--> Nhap don gia: ");
			this.donGia = in.nextDouble();
			in.nextLine();
		}while(this.donGia < 0);
	};

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10s %20s %10d %15.2f", this.maKH, this.hoTen, this.soLuong, this.donGia);
	}
}
