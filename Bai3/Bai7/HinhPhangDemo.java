package Bai3.Bai7;

public class HinhPhangDemo {
	static java.util.Scanner in = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		HinhPhang hv = new HinhVuong();
		HinhPhang hcn = new HinhChuNhat();
		HinhPhang ht = new HinhTron();
		
		System.out.println("Nhap thong tin:");
		hv.nhap();
		hcn.nhap();
		ht.nhap();
		
		System.out.printf("%15s %15s %15s\n", "Hinh", "Chu vi", "Dien tich");
	}
}
