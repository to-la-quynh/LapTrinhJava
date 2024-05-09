package Bai4.Bai9;

public class KhachHangVN extends KhachHang {
	private DoiTuongKhachHang doiTuongKH;
	private int dinhMuc;

	public KhachHangVN() {
		super();
	}

	public KhachHangVN(String maKH, String hoTen, Date ngayRaHD, int soLuong, double donGia,
			DoiTuongKhachHang doiTuongKH, int dinhMuc) {
		super(maKH, hoTen, ngayRaHD, soLuong, donGia);
		this.doiTuongKH = doiTuongKH;
		this.dinhMuc = dinhMuc;
	}

	public DoiTuongKhachHang getDoiTuongKH() {
		return doiTuongKH;
	}

	public void setDoiTuongKH(DoiTuongKhachHang doiTuongKH) {
		this.doiTuongKH = doiTuongKH;
	}

	public int getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(int dinhMuc) {
		if (this.doiTuongKH == doiTuongKH.SINH_HOAT) {
			this.dinhMuc = 50;
		} else if (this.doiTuongKH == doiTuongKH.KINH_DOANH) {
			this.dinhMuc = 100;
		} else {
			this.dinhMuc = 125;
		}
	}

	public double thanhTien() {
		if (this.getSoLuong() < this.dinhMuc) {
			return this.getSoLuong() * this.getDonGia();
		}
		return this.getSoLuong() * this.getDonGia() * this.dinhMuc
				+ (this.getSoLuong() * this.dinhMuc) * this.getDonGia() * 2.5F;
	}

	@Override
	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		super.nhap();
		int dtkh;
		do {
			System.out.println("\t1. Sinh hoat");
			System.out.println("\t2. Kinh doanh");
			System.out.println("\t3. San xuat");
			System.out.println("--> Nhap lua chon: ");
			dtkh = in.nextInt();
			in.nextLine();
			switch (dtkh) {
			case 1:
				this.doiTuongKH = doiTuongKH.SAN_XUAT;
				break;
			case 2:
				this.doiTuongKH = doiTuongKH.KINH_DOANH;
				break;
			case 3:
				this.doiTuongKH = doiTuongKH.SAN_XUAT;
				break;
			}
		} while (dtkh < 1 || dtkh > 3);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("%15s %10.2f", this.doiTuongKH, this.thanhTien());
	}

}
