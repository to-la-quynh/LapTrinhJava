package Bai1;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

/**
 * Chương trình tìm kiếm một giá trị (theo thuật toán tìm kiếm nhị phân) trong
 * mảng một chiều
 * 
 * @author CaoQuynh
 *
 */
public class Bai7 {
	static final java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		do {
			System.out.println("--> Nhap so luong phan tu mang: ");
			n = in.nextInt();
		} while (n <= 0);
//		int[] a = generateArray(n);
		int[]a = nhapMang(n);
		xuatMang(a, n);
		a = quickSort(a, 0, n-1);
		xuatMang(a, n);
		System.out.println("--> Nhap so can tim: ");
		int target = in.nextInt();
		if(binarySearch(a, target, 0, n - 1) != 0) {
			System.out.println("Tim duoc");
		}else {
			System.out.println("None");
		}
	}

	/**
	 * Phương thức sinh ngẫu nhiên một mảng số nguyên
	 * 
	 * @param n - số lượng phần tử
	 * @return - mảng số nguyên n phần tử
	 */
	static int[] generateArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		return a;
	}

	/**
	 * Phương thức nhập vào một mảng n số nguyên
	 * @param n - số lượng phần tử mảng
	 * @return
	 */
	static int[] nhapMang(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
//			in.nextLine();
		}
		return a;
	}

	/**
	 * Phương thức in mảng ra màn hình
	 * @param a
	 * @param n
	 */
	static void xuatMang(int[] a, int n) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
	/**
	 * Phương thức sắp xếp mảng tăng sử dụng thuật toán Quick Sort
	 * @param a
	 * @param left
	 * @param right
	 * @return
	 */
	static int [] quickSort(int []a, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			int t = a[mid];
			int i = left, j = right;
			do {
				while(a[i] < t) i++;
				while(a[j] > t) j--;
				if(i<=j) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					i++;j--;
				}
			}while(i <= j);
			quickSort(a, left, j);
			quickSort(a, i, right);
		}
		
		return a;
	}
	
	static int binarySearch(int []a, int target, int left , int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			if(a[mid] < target) {
				return binarySearch(a, target, mid + 1, right);
			}else {
				return binarySearch(a, target, left, mid);
			}
		}
		return a[left] == target ? 1 : 0;
	}

}
