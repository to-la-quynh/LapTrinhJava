package Bai4.Bai12;

public class HangDienMay extends HangHoa {
	private float thoiGianBaoHang;
	private double congSuat;

	public HangDienMay() {
		super();
	}

	public HangDienMay(String maHang, String tenHang, int slCon, double donGia, double vAT, float thoiGianBaoHang,
			double congSuat) {
		super(maHang, tenHang, slCon, donGia, vAT);
		this.thoiGianBaoHang = thoiGianBaoHang;
		this.congSuat = congSuat;
	}

	public float getThoiGianBaoHang() {
		return thoiGianBaoHang;
	}

	public void setThoiGianBaoHang(float thoiGianBaoHang) {
		this.thoiGianBaoHang = thoiGianBaoHang;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	@Override
	public String danhGiaMucDoBan() {
		if (this.slCon < 3)
			return "Ban duoc";
		return "Binh thuong";
	}

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		super.nhap();
		do {
			System.out.println("--> Nhap thoi gian bao hanh: ");
			this.thoiGianBaoHang = in.nextFloat();
			in.nextLine();
		} while (this.thoiGianBaoHang < 0);

		do {
			System.out.println("--> Nhap cong xuat: ");
			this.congSuat = in.nextDouble();
			in.nextLine();
		} while (this.congSuat <= 0);
		this.VAT = 0.01;
	}

	public static void inTieuDe() {
		HangHoa.inTieuDe();
		System.out.printf("%15s %10s %15s\n", "Thoi gian BH", "Cong suat", "Ghi chu");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("%15.1f thang %10.2f KW %15s", this.thoiGianBaoHang, this.congSuat, this.danhGiaMucDoBan());
	}
}
