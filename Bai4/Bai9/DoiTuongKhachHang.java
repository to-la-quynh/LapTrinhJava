package Bai4.Bai9;

public enum DoiTuongKhachHang {
	SINH_HOAT("Sinh hoat"), KINH_DOANH("Kinh doanh"), SAN_XUAT("San xuat");

	private String name;

	private DoiTuongKhachHang(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
