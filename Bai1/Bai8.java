package Bai1;

import java.util.Arrays;

/**
 * Cho một mảng đã được sắp xếp, viết chương trình bổ sung một giá trị mới vào
 * mảng theo đúng thứ tự
 * 
 * @author CaoQuynh
 *
 */
public class Bai8 {
	static final java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			System.out.println("--> Nhap so luong phan tu mang: ");
			n = in.nextInt();
		} while (n <= 0);

		int[] a = new int[n];
//		a = enterArray(n);
		a = generateArray(n);
		printArray(a);

		a = quickSort(a, 0, n - 1);
		printArray(a);

		System.out.println("--> Nhap so can chen: ");
		int x = in.nextInt();

		a = fillNum(a, x);
		System.out.println("RES");
		printArray(a);
	}

	/**
	 * Sinh mảng gồm n số nguyên
	 * 
	 * @param n - số lượng phần tử mảng
	 * @return
	 */
	static int[] generateArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 100);
		}

		return a;
	}

	/**
	 * Nhập mảng gồm n số nguyên
	 * 
	 * @param n - số lượng phần tử mảng
	 * @return
	 */
	static int[] enterArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = in.nextInt();
		}
		in.nextLine();
		return a;
	}

	/**
	 * In mảng
	 * 
	 * @param a
	 */
	static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	/**
	 * Sắp xếp mảng tăng dần với thuật toán quick sort
	 * 
	 * @param a
	 * @param left
	 * @param right
	 * @return
	 */
	static int[] quickSort(int[] a, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			int t = a[mid];
			int i = left, j = right;
			do {
				while (a[i] < t)
					i++;
				while (a[j] > t)
					j--;
				if (i <= j) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					i++;
					j--;
				}
			} while (i <= j);
			quickSort(a, left, j);
			quickSort(a, i, right);
		}

		return a;
	}

	/**
	 * Chèn số bất kì vào mảng sao cho trật tự mảng không đổi
	 * 
	 * @param a
	 * @param val - giá trị cần chèn
	 * @return
	 */
	static int[] fillNum(int[] a, int val) {
		int n = a.length;
		int[] tmp = new int[n + 1];
		tmp = Arrays.copyOf(a, n + 1);
		int i = 0;
		while (i < n && tmp[i] < val) {
			i++;
		}
		int j = 0;
		for (j = n - 1; j >= i; j--) {
			tmp[j + 1] = tmp[j];
		}
		tmp[j + 1] = val;

		return tmp;
	}

}
