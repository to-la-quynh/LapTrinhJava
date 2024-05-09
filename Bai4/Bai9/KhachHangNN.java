package Bai4.Bai9;

public class KhachHangNN extends KhachHang {
	private String quocTich;

	public KhachHangNN() {
		super();
	}

	public KhachHangNN(String maKH, String hoTen, Date ngayRaHD, int soLuong, double donGia, String quocTich) {
		super(maKH, hoTen, ngayRaHD, soLuong, donGia);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public double thanhTien() {
			return this.getSoLuong() * this.getDonGia();
	}

	public void nhap() {
		super.nhap();
		System.out.println("--> Nhap quoc tich: ");
		this.quocTich = (new java.util.Scanner(System.in)).nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("%15s %10.2f", "Nuoc ngoai", this.thanhTien());
	}
}
