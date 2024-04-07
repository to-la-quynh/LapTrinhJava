package Bai1;

public class Bai6 {

	public static int[] generateArray(int n) {
		int arrInt[] = new int[n];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (Math.random() * 100);
		}
		return arrInt;
	}
	
	public static void printArr(int []arrInt) {
		for (int i : arrInt) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt = generateArray(10);
		System.out.print("Mảng: ");
		printArr(arrInt);
		System.out.println("Các số nguyên tố trong mảng:");
		Bai1 a = new Bai1();
		for (int i : arrInt) {
			if(a.isPrime(i)) {
				System.out.print(i + "\t");
			}
		}
	}

}
