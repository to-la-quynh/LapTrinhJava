package Bai3.Bai3;

public class DemoPTB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n;
		
		do {
			System.out.println("--> Nhập số lượng phương trình bậc 2: ");
			n = in.nextInt();
		}while(n <= 0);
		
		PTB2 []list = new PTB2[n];
		for(int i = 0; i < n; i++) {
			System.out.println("NHẬP THÔNG TIN PHƯƠNG TRÌNH THỨ " + (i + 1));
			list[i] = new PTB2();
			list[i].nhapPTB2();
		}
		PTB2.inTieuDe();
		for (PTB2 ptb2 : list) {
			System.out.println(ptb2.toString());
		}
	}

}
