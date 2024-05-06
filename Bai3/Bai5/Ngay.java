package Bai3.Bai5;

public class Ngay {
	static java.util.Scanner in = new java.util.Scanner(System.in);
	private int ngay, thang, nam;

	public Ngay() {

	}

	public Ngay(int ngay, int thang, int nam) {
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ngay + "/" + thang + "/" + nam;
	}

	public boolean checkDate() {
		if (this.thang > 12 || this.thang < 1) {
			return false;
		}

		if (this.ngay > 31 || this.ngay < 1) {
			return false;
		} else {
			if (this.thang == 4 || this.thang == 6 || this.thang == 9 || this.thang == 11) {
				if (this.ngay > 30) {
					return false;
				}
			} else if (this.thang == 2) {
				if ((this.nam % 4 == 0 && this.nam % 100 != 0) || this.nam % 400 == 0) {
					if (this.ngay > 29) {
						return false;
					}
				} else {
					if (this.ngay > 28) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public void nhapNgay() {
		System.out.println("--> Nhap ngay: ");
		this.ngay = in.nextInt();
		in.nextLine();
		System.out.println("--> Nhap thang: ");
		this.thang = in.nextInt();
		in.nextLine();
		System.out.println("--> Nhap nam: ");
		this.nam = in.nextInt();
		in.nextLine();
	}
}
