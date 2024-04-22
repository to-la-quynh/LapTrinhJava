package Bai3.Bai4;

import java.lang.reflect.Array;

public class QuanLyXeDangKyDemo {
	static java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Xe[] list = null;

		do {
			System.out.println("=============================MENU=============================");
			System.out.println("\t1. Nhập thông tin và tạo danh sách xe.");
			System.out.println("\t2. In thông tin danh sách xe đã nhập.");
			System.out.println("\t3. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("\t4. Sắp xếp danh sách xe theo tên chủ xe.");
			System.out.println("\t5. Đưa ra xe phải nộp thuế lớn nhất.");
			System.out.println("\t0. Thoát.");
			System.out.println("--> Nhập lựa chọn: ");
			choice = in.nextInt();
			in.nextLine();

			switch (choice) {
			case 1:
				int n;
				do {
					System.out.println("--> Nhập số lượng xe (số lượng xe > 0): ");
					n = in.nextInt();
				} while (n <= 0);
				in.nextLine();
				list = new Xe[n];
				list = nhapDSXe(list);
				break;
			case 2:
				xuatDSXe(list);
				break;
			case 3:
				System.out.printf("%20s %15s %15s %15s \n", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
				System.out.println("-------------------------------------------------------------------------------");
				xuatThue(list);
				break;
			case 4:
				list = sapXepTheoTen(list);
				break;
			case 5:
				Xe max = timThueLonNhat(list);
				System.out.println(max.toString());
				break;
			case 0:
				System.out.println("KẾT THỨC CHƯƠNG TRÌNH!");
				in.close();
				System.gc();
			}

		} while (choice != 0);
	}

	static Xe[] nhapDSXe(Xe[] list) {
		int n = list.length;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin hồ sơ xe thứ " + (i + 1));
			list[i] = new Xe();
			list[i].nhapXe();
			if (list[i].getLoaiXe().equalsIgnoreCase("")) {
				break;
			}
		}
		System.out.println("DỪNG NHẬP!");
		return list;
	}

	static void xuatDSXe(Xe[] list) {
		if (list == null || list.length == 0) {
			System.out.println("DANH SÁCH RỖNG, IN KHÔNG THÀNH CÔNG!");
		} else {
			Xe.inTieuDe();
			for (Xe a : list) {
				System.out.println(a.toString());
			}
		}

	}

	static void xuatThue(Xe[] list) {
		for (Xe a : list) {
			a.xuatThue();
		}
	}

	static Xe[] sapXepTheoTen(Xe[] list) {
		int n = list.length;
		Xe tmp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n - i - 1; j++) {
				if (list[i].getTenChuXe().compareTo(list[j].getTenChuXe()) > 0) {
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
		}
		return list;
	}

	static Xe timThueLonNhat(Xe[] list) {
		Xe max = list[0];
		int n = list.length;
		for (int i = 1; i < n; i++) {
			if (list[i].tinhThue() > max.tinhThue())
				max = list[i];
		}
		return max;
	}

}
