package Bai4.Bai4;

public class Xe {
	private String tenChuXe;
	private String loaiXe;
	int dungTich;
	double triGia;

	public Xe() {
		this.tenChuXe = "";
		this.loaiXe = "";
		this.dungTich = 0;
		this.triGia = 0;
	}

	public Xe(String tenChuXe, String loaiXe, int dungTich, double triGia) {
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
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

	public double getTriGia() {
		return triGia;
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

	public void input() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("--> Nhap ten chu xe: ");
		tenChuXe = in.nextLine();
		System.out.println("--> Nhap loai xe: ");
		loaiXe = in.nextLine();
		System.out.println("--> Nhap dung tich xe: ");
		dungTich = in.nextInt();
		System.out.println("--> Nhap tri gia xe: ");
		triGia = in.nextDouble();
	}

	public static void printHeader() {
		System.out.printf("%-20s%-15s%15s%15s%15s%n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
		System.out.println("=========================================================");
	}

	public void print() {
		System.out.printf("%-20s%-15s%15d%15.2f%15.2f%n", this.tenChuXe, this.loaiXe, this.dungTich, this.triGia, this.tinhThue());
	}

}
