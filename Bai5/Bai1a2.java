package Bai5;

public class Bai1a2 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println(a[10]); // ArrayIndexOutOfBounds Exception occurs
		} catch (ArithmeticException e) {
			System.out.println("Arthmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
