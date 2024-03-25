package Bai4.Bai4;

import java.util.ArrayList;

public class XeDemo {
	public static void main(String[] args) {
		ArrayList<Xe> list = new ArrayList<Xe>();
		int choice;
		java.util.Scanner in = new java.util.Scanner(System.in);
		do {
			System.out.println("===============CHON================");
			System.out.println("1. Nhap thong tin danh sach cac xe.");
			System.out.println("2. Xuat bang ke khai tien thue truoc ban cua cac xe.");
			System.out.println("3. Thoat");
			System.out.println("--> Nhap lua chon cua ban: ");
			choice = in.nextInt();

			switch (choice) {
			case 1:
				nhapDs(list);
				break;
			case 2:
				xuatDs(list);
				break;
			case 3:
				System.out.println("KET THUC CHUONG TRINH!");
				break;
			}

		} while (choice != 3);
	}

	static void nhapDs(ArrayList<Xe> list) {
		Xe tmp = new Xe();
		java.util.Scanner in = new java.util.Scanner(System.in);
		String choice = "";
		do {
			System.out.println("Nhap thong tin xe");
			tmp.input();
			list.add(tmp);
			System.out.println("Ban co muon tiep tuc nhap?(Y/N): ");
			choice = in.nextLine();
		} while (choice.equalsIgnoreCase("Y"));
	}

	static void xuatDs(ArrayList<Xe> list) {
		Xe.printHeader();
		for (Xe xe : list) {
			xe.print();
		}
	}
}
