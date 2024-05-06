package Bai3.Bai5;

public class NhanVienDemo {
	static java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			System.out.println("--> Nhap so luong nhan vien: ");
			n = in.nextInt();
		}while(0 >= n);
		
		NhanVien []list = new NhanVien[n];
		System.out.println("--> Nhap danh sach nhan vien:");
		for(int i = 0; i < n; i++) {
			System.out.println("Nhan vien " + (i + 1));
			list[i] = new NhanVien();
			list[i].nhapNhanVien();
		}
		
		NhanVien.inTieuDe();
		for (NhanVien nhanVien : list) {
			System.out.println(nhanVien.toString());
		}
	}

}
