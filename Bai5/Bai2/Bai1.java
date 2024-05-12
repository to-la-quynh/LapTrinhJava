package Bai5.Bai2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bai1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\TestJava\\testout.txt");
			String s = "Welcome to javaTpoint";
			byte b[] = s.getBytes(); // converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
