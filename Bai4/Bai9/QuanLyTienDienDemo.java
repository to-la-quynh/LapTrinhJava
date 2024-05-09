package Bai4.Bai9;

import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class QuanLyTienDienDemo {
	static ArrayList<KhachHang> list = new ArrayList<>();
	static java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int choice;

		do {
			System.out.println("====================MENU======================");
			System.out.println("\t1. Nhap hoa don.");
			System.out.println("\t2. Xuat danh sach hoa don.");
			System.out.println("\t3. Tinh so luong tung loai khach hang.");
			System.out.println("\t4. Tinh trung binh thanh tien khach hang nuoc ngoai.");
			System.out.println("\t5. Xuat hoa don thang 09 nam 2013. (ca 2 loai khach hang)");
			System.out.println("\t0. Ket thuc.");
			System.out.println("--> Nhap lua chon: ");
			choice = in.nextInt();
			in.nextLine();
			switch (choice) {
			case 1:
				System.out.println("=================NHAP HOA DON===================");
				nhapHoaDon();
				break;
			case 2:
				xuatHoaDon();
				break;
			case 3:
				tinhSoLuongKH();
				break;
			case 4:
				double tb = tinhTrungBinh();
				if(tb != -1) {
					System.out.println("Trung binh thanh tien khach hang nuoc ngoai: " + tb);
				}else {
					System.out.println("Khong co khach hang nuoc ngoai nao!");
				}
				break;
			case 5:
				xuatHoaDon2013();
				break;
			case 0:
				System.out.println("KET THUC CHUONG TRINH!");
				in.close();
				System.gc();
			}
		} while (choice != 0);
	}

	public static void nhapHoaDon() {
		int choice1;
		String choice2;

		do {
			do {
				System.out.println("\t1. Nhap hoa don cho nguoi nuoc ngoai.");
				System.out.println("\t2. Nhap hoa don cho nguoi Viet Nam.");
				System.out.println("\t0. Huy");
				System.out.println("--> Nhap lua chon: ");
				choice1 = in.nextInt();
				in.nextLine();
				switch (choice1) {
				case 1:
					KhachHangNN a = new KhachHangNN();
					a.nhap();
					if (isIDExisted(a.getMaKH())) {
						System.out.println("MA KHACH HANG DA TON TAI, THEM KHONG THANH CONG!");
					} else {
						list.add(a);
						System.out.println("THEM THANH CONG 1 HOA DON!");
					}
					break;
				case 2:
					KhachHangVN b = new KhachHangVN();
					b.nhap();
					if (isIDExisted(b.getMaKH())) {
						System.out.println("MA KHACH HANG DA TON TAI, THEM KHONG THANH CONG!");
					} else {
						list.add(b);
						System.out.println("THEM THANH CONG 1 HOA DON!");
					}
					break;
				case 3:
					break;
				}
			} while (choice1 != 0);

			System.out.println("--> Tiep tuc nhap?(Y/N): ");
			choice2 = in.nextLine();
		} while (choice2.equalsIgnoreCase("y"));
	}

	public static boolean isIDExisted(String id) {
		for (KhachHang khachHang : list) {
			if (khachHang.getMaKH().equalsIgnoreCase(id)) {
				return true;
			}
		}
		return false;
	}

	public static void tinhSoLuongKH() {
		int vn = 0, nn = 0;
		for (KhachHang khachHang : list) {
			if (khachHang instanceof KhachHangVN) {
				vn++;
			} else if (khachHang instanceof KhachHangNN) {
				nn++;
			}
		}
		System.out.println("So luong khach hang Viet Nam: " + vn);
		System.out.println("So luong khach hang nuoc ngoai: " + nn);
	}
	
	public static void inTieuDe() {
		System.out.printf("%10s %20s %10s %15s %15s %10s\n", "MaKH", "TenKH", "So luong", "Don gia", "Doi tuong", "Tong tien");
	}

	public static void xuatHoaDon() {
		inTieuDe();
		for (KhachHang khachHang : list) {
			System.out.println(khachHang.toString());
		}
	}

	public static double tinhTrungBinh() {
		double sum = 0;
		int cnt = 0;
		for (KhachHang khachHang : list) {
			if (khachHang instanceof KhachHangNN) {
				sum += ((KhachHangNN) khachHang).thanhTien();
				cnt++;
			}
		}
		if (cnt != 0)
			return sum / cnt;
		return -1;
	}
	
	public static void xuatHoaDon2013() {
		inTieuDe();
		for (KhachHang khachHang : list) {
			if(khachHang.getNgayRaHD().getThang() == 9 && khachHang.getNgayRaHD().getNam() == 2013) {
				System.out.println(khachHang.toString());
			}
		}
	}
}
