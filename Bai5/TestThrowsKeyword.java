package Bai5;
import java.io.IOException;

public class TestThrowsKeyword {

    void m() throws Exception {
        throw new Exception("Loi thiet bi");// checked exception
    }
    void n() throws Exception {
        m();
    }
    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }

    public static void main(String[] args) {
        TestThrowsKeyword obj = new TestThrowsKeyword();
        obj.p();
        System.out.println("luong binh thuong...");
    }
}