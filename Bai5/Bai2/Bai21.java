package Bai5.Bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bai21 {
	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("D:\\TestJava\\testout.txt");

			int i = fin.read();
			System.out.print((char) i);

			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
