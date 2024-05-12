package Bai5;

public class Bai1a4 {

	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("common task completed");
		}
		// 2 khối catch này là vô nghĩa vì đã có Exception e
//		catch (ArithmeticException e) {
//			System.out.println("task 1 is completed");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("task 2 is completed");
//		}
		System.out.println("rest of the code...");
	}
}
