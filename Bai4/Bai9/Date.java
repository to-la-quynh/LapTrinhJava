package Bai4.Bai9;

public class Date {
	private int ngay, thang, nam;

	public Date() {
		super();
	}

	public Date(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
			System.out.println("--> Nhap ngay: ");
			this.ngay = in.nextInt();
		} while (this.ngay <= 0);
		in.nextLine();
		do {
			System.out.println("--> Nhap thang: ");
			this.thang = in.nextInt();
		} while (this.thang <= 0 || this.thang > 12);
		in.nextLine();
		do {
			System.out.println("--> Nhap nam: ");
			this.nam = in.nextInt();
		} while (this.nam <= 0);
		in.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ngay + "/" + this.thang + "/" + this.nam;
	}

}
