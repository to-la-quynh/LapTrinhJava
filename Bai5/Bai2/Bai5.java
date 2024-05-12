package Bai5.Bai2;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Bai5 {
	public static void main(String args[]) throws Exception {
		FileInputStream input1 = new FileInputStream("D:\\TestJava\\testin.txt");
		FileInputStream input2 = new FileInputStream("D:\\TestJava\\testout.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}
}
