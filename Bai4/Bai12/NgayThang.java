package Bai4.Bai12;

public class NgayThang {
	private int ngay, thang, nam;

	public int getNgay() {
		return ngay;
	}

	public int getThang() {
		return thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public NgayThang() {
	}

	public NgayThang(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		ngay = in.nextInt();
		thang = in.nextInt();
		nam = in.nextInt();
	}

	@Override
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}

}
