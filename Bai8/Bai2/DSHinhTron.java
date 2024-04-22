package Bai8.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DSHinhTron {
	private List<HinhTron> list;

	public DSHinhTron() {
		this.list = new ArrayList<HinhTron>();
	}

	public DSHinhTron(List<HinhTron> list) {
		super();
		this.list = list;
	}

	public List<HinhTron> getList() {
		return list;
	}

	public void setList(List<HinhTron> list) {
		this.list = list;
	}

	public void themHinhTron() {
		list.add(new HinhTron(0 + Math.random()*50));
		System.out.println("THÊM THÀNH CÔNG 1 HÌNH TRÒN!");
	}

	public int layKichThuoc() {
		return list.size();
	}

	public HinhTron layHinhTron(int index) {
		if (index >= list.size() || index < 0) {
			throw new IndexOutOfBoundsException("Index phai nam trong khoang: [0, " + list.size() + ")");
		} else {
			return list.get(index);
		}
	}

	public void ganHinhTron(HinhTron value, int index) {
		if (index >= list.size() || index < 0) {
			throw new IndexOutOfBoundsException("Index phai nam trong khoang: [0, " + list.size() + ")");
		} else {
			list.set(index, value);
		}
	}

	public double tinhTongDienTich() {
		double sum = 0;
		for (HinhTron hinhTron : list) {
			sum += hinhTron.tinhDienTich();
		}

		return sum;
	}

	public HinhTron layHinhTronDienTichLonNhat() {
		return Collections.max(list, (ht1, ht2) -> Double.compare(ht1.tinhDienTich(), ht2.tinhDienTich()));
	}

	public HinhTron layHinhTronDienTichNhoNhat() {
		return Collections.min(list, (ht1, ht2) -> Double.compare(ht1.tinhDienTich(), ht2.tinhDienTich()));
	}

}
