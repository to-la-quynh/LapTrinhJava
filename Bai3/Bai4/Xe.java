package Bai3.Bai4;

public class Xe {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	public double triGia;

	public Xe() {
		super();
	}

	public Xe(String tenChuXe, String loaiXe, int dungTich, double triGia) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public double tinhThue() {
		if (this.dungTich < 100) {
			return this.triGia * 0.01;
		} else if (this.dungTich > 200) {
			return this.triGia * 0.05;
		} else {
			return this.triGia * 0.03;
		}
	}

	public void nhapXe() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("--> Nhập tên chủ xe: ");
		this.tenChuXe = in.nextLine();

		System.out.println("--> Nhập loại xe: ");
		this.loaiXe = in.nextLine();

		do {
			System.out.println("--> Nhập dung tinh xe (dung tích xe > 0): ");
			this.dungTich = in.nextInt();
		} while (this.dungTich <= 0);
		in.nextLine();
		do {
			System.out.println("--> Nhập trị giá xe (trị giá xe > 0): ");
			this.triGia = in.nextDouble();
		} while (this.triGia <= 0);
		in.nextLine();
	}

	public static void inTieuDe() {
		System.out.printf("%-20s %-20s %15s %15s %15s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		System.out.println("-------------------------------------------------------------------------------");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-20s %-20s %15d %15.2f %15.2f", this.tenChuXe, this.loaiXe, this.dungTich, this.triGia,
				this.tinhThue());
	}

	public void xuatThue() {
		System.out.printf("%-20s %-15d %15.2f %15.2f \n", this.loaiXe, this.dungTich, this.triGia, this.tinhThue());
	}

}
