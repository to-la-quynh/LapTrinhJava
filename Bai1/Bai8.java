package Bai1;

public class Bai8 {
	static final java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			System.out.println("--> Nhap so luong phan tu mang: ");
			n = in.nextInt();
		} while (n <= 0);
		int[] a = enterArray(n);
		printArray(a);
		a = quickSort(a, 0, n - 1);
		printArray(a);
		a = fillNum(a, 4);
		System.out.println("RES");
		printArray(a);
	}

	static int[] generateArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 100);
		}

		return a;
	}

	static int[] enterArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = in.nextInt();
		}
		in.nextLine();
		return a;
	}

	static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

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

	static int[] fillNum(int[] a, int val) {
		int n = a.length;
		for(int i = 0; i < n; i++) {
			int j = i;
			while(j > -1 && a[j] > val) {
				a[j + 1] = a[j];
				j--;
			}
			a[j +1] = val;
		}
		return a;
	}

}
