package Bai4.Bai12;

import java.util.ArrayList;
import java.util.List;

public class QuanLyHangHoa {
	static List<HangHoa> list = new ArrayList<>();
	static java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int choice;

		do {
			System.out.println("============================MENU===========================");
			System.out.println("\t1. Nhap hang hoa.");
			System.out.println("\t2. In danh sach hang hoa theo loai.");
			System.out.println("\t0. Thoat.");

			System.out.println("--> Nhap lua chon: ");
			choice = in.nextInt();
			in.nextLine();

			switch (choice) {
			case 1:
				nhap();
				break;
			case 2:
				inDs();
				break;
			default:
				System.out.println("KET THUC CHUONG TRINH!");
				in.close();
				System.gc();
			}
		} while (choice != 0);
	}

	public static void nhap() {
		int choice;
		do {
			System.out.println("=============CHON LOAI HANG=============");
			System.out.println("\t1. Hang dien may");
			System.out.println("\t2. Hang sanh su");
			System.out.println("\t3. Hang thuc pham");
			System.out.println("\t0. Huy");

			System.out.println("--> Nhap lua chon: ");
			choice = in.nextInt();
			in.nextLine();

			switch (choice) {
			case 1:
				HangHoa a = new HangDienMay();
				a.nhap();
				if (isIDExisted(a.maHang)) {
					System.out.println("MA HANG DA TON TAI, THEM KHONG THANH CONG!");
				} else {
					list.add(a);
					System.out.println("THEM THANH CONG 1 HANG DIEN MAY!");
				}
				break;
			case 2:
				HangHoa b = new HangSanhSu();
				b.nhap();
				if (isIDExisted(b.maHang)) {
					System.out.println("MA HANG DA TON TAI, THEM KHONG THANH CONG!");
				} else {
					list.add(b);
					System.out.println("THEM THANH CONG 1 HANG SANH SU!");
				}
				break;
			case 3:
				HangHoa c = new HangThucPham();
				c.nhap();
				if (isIDExisted(c.maHang)) {
					System.out.println("MA HANG DA TON TAI, THEM KHONG THANH CONG!");
				} else {
					list.add(c);
					System.out.println("THEM THANH CONG 1 HANG THUC PHAM!");
				}
				break;
			default:
				System.out.println("KET THUC NHAP!");
				break;
			}

		} while (choice != 0);
	}

	public static boolean isIDExisted(String id) {
		for (HangHoa hangHoa : list) {
			if (hangHoa.maHang.equalsIgnoreCase(id)) {
				return true;
			}
		}
		return false;

	}

	public static void inDs() {
		System.out.println("=============HANG DIEN MAY==============");
		HangDienMay.inTieuDe();
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangDienMay) {
				System.out.println(hangHoa.toString());
			}
		}
		System.out.println("=============HANG SANH SU==============");
		HangSanhSu.inTieuDe();
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangSanhSu) {
				System.out.println(hangHoa.toString());
			}
		}
		System.out.println("=============HANG THUC PHAM==============");
		HangThucPham.inTieuDe();
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangThucPham) {
				System.out.println(hangHoa.toString());
			}
		}
	}
}
