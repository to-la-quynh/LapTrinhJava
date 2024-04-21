package Bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Bai1 {
	static java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list = new ArrayList<>();
//		add(list);
//		print(list);
		Set<Integer> list1 = new LinkedHashSet<>();
		add(list1);
		print(list1);

		System.out.println("--> nhap so can xoa: ");
		int x = in.nextInt();
		in.nextLine();
		if (remove(list1, x)) {
			System.out.println("XOA THANH CONG!");
			print(list1);
		} else {
			System.out.println("PHAN TU KHONG TON TAI!");
		}

		if (list1.isEmpty()) {
			System.out.println("DANH SACH RONG!");
		} else {
			int min = Collections.min(list1);
			System.out.println("Phan tu nho nhat: " + min);

			int max = Collections.max(list1);
			System.out.println("Phan tu lon nhat: " + max);

//			String choice = "";
			System.out.println("Sap xep tang/giam: ");
			String choice = in.nextLine();
			list1 = list1.parallelStream().sorted((a, b) -> choice.equalsIgnoreCase("tang") ? a - b : b - a)
					.collect(Collectors.toSet());
			print(list1);
		}
	}

	static void add(ArrayList<Integer> list) {
		int n;
		String choice = "Y";
		while (choice.equalsIgnoreCase("Y")) {
			System.out.println("--> Nhap n: ");
			n = in.nextInt();
			in.nextLine();
			if (list.contains(n)) {
				System.out.println("PHAN TU DA TON TAI!");
			} else {
				list.add(n);
				System.out.println("OK");
			}
//			System.out.println("Tiep tuc nhap? Y/N: ");
//			choice = in.nextLine();
//			in.nextLine();
		}
	}

	static void add(Set<Integer> list) {
		int n;
		String choice = "Y";
		while (choice.equalsIgnoreCase("Y")) {
			System.out.println("--> Nhap n: ");
			n = in.nextInt();
			in.nextLine();
			if (list.add(n)) {
				System.out.println("THEM THANH CONG!");
			} else {
				System.out.println("PHAN TU NAY DA TON!");
			}
			System.out.println("Tiep tuc nhap? Y/N: ");
			choice = in.nextLine();
		}
	}

	static void print(ArrayList<Integer> list) {
		for (Integer i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	static void print(Set<Integer> list) {
		for (Integer i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	static boolean remove(Set<Integer> list, int val) {
		if (list.contains(val)) {
			return list.remove(val);
		}
		return false;
	}

}
