package Bai5;

public class Bai1a1 {

	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0; // Task 1 is completed
		} catch (ArithmeticException e) {
			System.out.println("Task 1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Task 2 is completed");
		} catch (Exception e) {
			System.out.println("Common task completed");
		}

		System.out.println("Rest of the code");
	}

}
