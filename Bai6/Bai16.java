package Bai6;
import java.io.Console;

public class Bai16 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        System.out.println("Welcome " + n);
    }
}
