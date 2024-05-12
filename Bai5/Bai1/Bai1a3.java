package Bai5.Bai1;

public class Bai1a3 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length()); // Parent Exception occurs
		} catch (ArithmeticException e) {
			System.out.println("Arthmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code");
	}
}
