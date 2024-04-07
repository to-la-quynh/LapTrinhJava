package Bai3.Bai4;

public class DemoPhuongTien {
	static PhuongTien list[];
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("=============LUA CHON================");
			System.out.println("1. Nhap thong tin xe");
			System.out.println("2. Xuat bang ke thue");
			System.out.println("3. Sap xep danh sach xe theo ten chu xe");
			System.out.println("4. Dua ra xe phai nop thue lon nhat");
			System.out.println("5. Thoat");
			System.out.println("=====================================");
			System.out.println("--> Nhap lua chon: ");
			choice = in.nextInt();
			in.nextLine();
			switch (choice) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				sapXep();
				break;
			case 4:
				timMax();
				break;
			case 5:
				System.out.println("KET THUC CHUONG TRINH!");
				break;
			}
		} while (choice != 5);
	}

	static void nhap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
			System.out.println("--> Nhap so luong xe: ");
			n = in.nextInt();
		} while (n <= 0);
		in.nextLine();
		list = new PhuongTien[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin phuong tien thu " + (i + 1));
			list[i] = new PhuongTien();
			list[i].nhap();
		}
	}

	static void xuat() {
		PhuongTien.inTieuDe();
		for(int i = 0; i < n; i++) {
			list[i].in();
		}
	}

	static void sapXep() {
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(list[j].getTenChuXe().compareToIgnoreCase(list[j+1].getTenChuXe()) > 0) {
					PhuongTien tmp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = tmp;
				};
			}
		}

		xuat();
	}

	static void timMax() {
		PhuongTien max = list[0];
		for(int i = 1; i < n; i++) {
			if(list[i].tinhThue() > max.tinhThue()) {
				max = list[i];
			}
		}
		max.in();
	}

}
