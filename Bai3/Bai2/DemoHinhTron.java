package Bai3.Bai2;

import java.util.ArrayList;
import java.util.List;

public class DemoHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n;
		System.out.println("--> Nhap so luong hinh tron: ");
		n = in.nextInt();
		HinhTron []a = new HinhTron[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = new HinhTron();
			a[i].nhap();
		}
		
		HinhTron.inTieuDe();
		for(int i = 0; i < a.length; i++) {
			a[i].in();
		}
	}
}
