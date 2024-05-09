package Bai4.Bai12;

public abstract class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected int slCon;
	protected double donGia;
	protected double VAT;

	public HangHoa() {
		super();
	}

	public HangHoa(String maHang, String tenHang, int slCon, double donGia, double vAT) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.slCon = slCon;
		this.donGia = donGia;
		VAT = vAT;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public int getSlCon() {
		return slCon;
	}

	public void setSlCon(int slCon) {
		this.slCon = slCon;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getVAT() {
		return VAT;
	}

	public void setVAT(double vAT) {
		VAT = vAT;
	}

	public abstract String danhGiaMucDoBan();

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {

			System.out.println("--> Nhap ma hang: ");
			this.maHang = in.nextLine();
		} while (this.maHang.equals(""));

		do {
			System.out.println("--> Nhap ten hang: ");
			this.tenHang = in.nextLine();
		} while (this.tenHang.equals(""));

		do {
			System.out.println("--> Nhap so luong con: ");
			this.slCon = in.nextInt();
			in.nextLine();
		} while (this.slCon < 0);

		do {
			System.out.println("--> Nhap don gia: ");
			this.donGia = in.nextDouble();
			in.nextLine();
		} while (this.donGia <= 0);
	}

	public static void inTieuDe() {
		System.out.printf("%10s %15s %10s %10s %10s", "Ma hang", "Ten hang", "SL con", "Don gia", "VAT");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10s %15s %10d %10.2f %10.2f", this.maHang, this.tenHang, this.slCon, this.donGia,
				this.VAT);
	}

}
