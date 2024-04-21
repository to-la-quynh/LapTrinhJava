package Bai3.Bai2;

import java.util.ArrayList;
import java.util.List;

public class DemoHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n;
		do {
			System.out.println("--> Nhập số lượng hình tròn: ");
			n = in.nextInt();
		}while(n <= 0);
		
		HinhTron []list = new HinhTron[n];
		for(int i = 0; i < n; i++) {
			System.out.println("NHẬP THÔNG TIN HÌNH TRÒN THỨ " + (i + 1));
			list[i] = new HinhTron();
			list[i].nhapThongTin();
		}
		
		HinhTron.inTieuDe();
		for (HinhTron hinhTron : list) {
			System.out.println(hinhTron.toString());
		}
		
	}
}
