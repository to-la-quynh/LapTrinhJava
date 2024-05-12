package Bai5;

public class Bai3 {
	// a. Ném ra ngoại lệ nhưng không xử lý
	public static void unhandled(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome");
	}

	public static void handled(int age) {
		try {
			if (age < 18)
				throw new ArithmeticException("not valid");
			else
				System.out.println("welcome");
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args) {
//        unhandled(13);
//        System.out.println("rest of the code...");

		handled(13);
		System.out.println("rest of the code...");

	}
}
