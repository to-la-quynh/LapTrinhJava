package Bai6;

import java.io.FileOutputStream;

public class Bai01 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s = "Welcome to javaTpoint.";
            byte[] b = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {System.out.println(e);}
    }
}
