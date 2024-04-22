package Bai8.Bai1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TapSoNguyen {
	static java.util.Scanner in = new java.util.Scanner(System.in);
	static Set<Integer> numSet = new LinkedHashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;

		do {
			System.out.println("-------------------------MENU------------------------");
			System.out.println("\t1. Nhập danh sách số nguyên bất kì.");
			System.out.println("\t2. Xuất danh sách số nguyên vừa nhập");
			System.out.println("\t3. Tìm kiếm một giá trị bất kì trong danh sách.");
			System.out.println("\t4. Xuất tất cả các số nguyên tố trong danh sách vừa nhập.");
			System.out.println("\t5. Sắp xếp danh sách.");
			System.out.println("\t6. Xoá một giá trị bất kì.");
			System.out.println("\t0. Thoát.");

			System.out.println("--> Nhập lựa chọn: ");
			choice = in.nextInt();
			in.nextLine();

			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				System.out.println("Danh sách số nguyên vừa nhập: ");
				print();
				break;
			case 3:
				System.out.println("--> Nhập số nguyên cần tìm: ");
				int x = in.nextInt();
				in.nextLine();
				if (search(x)) {
					System.out.println("GIÁ TRỊ " + x + " CÓ TỒN TẠI TRONG DANH SÁCH!");
				} else {
					System.out.println("KHÔNG TỒN TẠI GIÁ TRỊ " + x + " TRONG DANH SÁCH!");
				}
				break;
			case 4:
				System.out.println("DANH SÁCH CÁC SỐ NGUYÊN TỐ:");
				int cnt = 0;
				for (Integer i : numSet) {
					if (isPrime(i)) {
						System.out.print(i + "\t");
						cnt++;
					}
				}
				if (cnt == 0) {
					System.out.print("KHÔNG CÓ SỐ NGUYÊN TỐ TRONG DANH SÁCH!");
				}
				System.out.println();
				break;
			case 5:
//				System.out.println("Sap xep tang/giam: ");
//				String choice1 = in.nextLine();
//				numSet = numSet.parallelStream().sorted((a, b) -> choice1.equalsIgnoreCase("tang") ? (a - b) : (b - a))
//						.collect(Collectors.toSet());
				numSet = numSet.parallelStream().sorted((a, b) -> a - b).collect(Collectors.toSet());
				System.out.println("DANH SÁCH SAU KHI ĐÃ SẮP XẾP:");
				System.out.println(numSet.toString());
				break;
			case 6:
				System.out.println("--> Nhập giá trị cần xoá: ");
				int a = in.nextInt();
				in.nextLine();
				if (numSet.remove(a)) {
					System.out.println("XOÁ THÀNH CÔNG GIÁ TRỊ " + a);

					System.out.println("DANH SÁCH SAU KHI XOÁ:");
					System.out.println(numSet.toString());
				} else {
					System.out.println("KHÔNG TỒN TẠI GIÁ TRỊ " + a);
				}
				break;
			case 0:
				System.out.println("KẾT THÚC CHƯƠNG TRÌNH!");
				in.close();
				System.gc();
			}
		} while (choice != 0);
	}

	static void add() {
		String choice = "";
		do {
			System.out.println("--> Nhập vào một số nguyên bất kì: ");
			int a = in.nextInt();
			in.nextLine();
			if (search(a)) {
				System.out.println("GIÁ TRỊ " + a + " ĐÃ TỒN TẠI!");
			} else {
				numSet.add(a);
			}

			System.out.println("Tiếp tục nhập? (Y/N): ");
			choice = in.nextLine();
		} while (choice.equalsIgnoreCase("Y"));
	}

	static void print() {
		System.out.println(numSet.toString());
	}

	static boolean search(int x) {
		if (numSet.contains(x)) {
			return true;
		}
		return false;
	}

	static boolean isPrime(int x) {
		if (x < 2) {
			return false;
		} else {
			for (int i = 2; i < (int) (Math.sqrt(x)); i++) {
				if (x % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
