package Bai8.Bai2;

public class HinhTronDemo {
	static java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		DSHinhTron list = new DSHinhTron();
		int choice;

		do {
			System.out.println("===============================MENU===========================");
			System.out.println("\t1. Nhập/xuất thông tin các hình tròn đã nhập.");
			System.out.println("\t2. Xuất tổng diện tích các hình tròn.");
			System.out.println("\t3. Xuất hình tròn có diện tích lớn nhất.");
			System.out.println("\t4. Xuất hình tròn có diện tích nhỏ nhất.");
			System.out.println("\t0. Thoát");

			System.out.println("--> Nhập lựa chọn: ");
			choice = in.nextInt();
			in.nextLine();

			switch (choice) {
			case 1:
				nhapDSHinhTron(list);
				System.out.println("DANH SÁCH HÌNH TRÒN VỪA NHẬP:");
				System.out.printf("%10s %10s \n", "Bán kính", "Diện tích");
				xuatDSHinhTron(list);
				break;
			case 2:
				System.out.print("Tổng diện tích các hình tròn: ");
				System.out.printf("%10.2f \n", list.tinhTongDienTich());
				break;
			case 3:
				System.out.println("Hình tròn có diện tích lớn nhất: ");
				System.out.println(list.layHinhTronDienTichLonNhat().toString());
				break;
			case 4:
				System.out.println("Hình tròn có diện tích nhỏ nhất: ");
				System.out.println(list.layHinhTronDienTichNhoNhat().toString());
				break;
			case 0:
				System.out.println("KẾT THÚC CHƯƠNG TRÌNH!");
				in.close();
				System.gc();
			}

		} while (choice != 0);
	}
	
	static void nhapDSHinhTron(DSHinhTron list) {
		String choice = "";
		do {
			list.themHinhTron();
			System.out.println("--> Tiếp tục thêm (Y/N)? ");
			choice = in.nextLine();
//			in.nextLine();
		}while(choice.equalsIgnoreCase("Y"));
	}
	
	static void xuatDSHinhTron(DSHinhTron list) {
		for(int i = 0; i < list.layKichThuoc(); i++) {
			System.out.println(list.layHinhTron(i).toString());
		}
	}

}
