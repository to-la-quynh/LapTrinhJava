package Bai4.Bai2;

import java.util.ArrayList;

public class DemoHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HinhTron> ds = new ArrayList<HinhTron>();
		nhapDSHT(ds);
		showDs(ds);
	}
	
	static void nhapDSHT(ArrayList<HinhTron> ds) {
		String choice = "";
		
		do {
			HinhTron tmp = new HinhTron();
			tmp.input();
			ds.add(tmp);
			System.out.println("Ban co muon nhap tiep?(Y/N): ");
			choice = (new java.util.Scanner(System.in)).nextLine();
		}while(choice.equalsIgnoreCase("Y"));
	}
	
	static void showDs(ArrayList<HinhTron> ds) {
		HinhTron.printHeader();
		for (HinhTron i : ds) {
			i.output();
		}
	}

}
