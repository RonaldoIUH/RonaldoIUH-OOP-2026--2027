package SinhVien;

import java.util.Scanner;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT, diemTH;
	
	public SinhVien() {
		this.maSV = 1;
		this.hoTen = "chua co thong tin";
		this.diemLT = 0.0;
		this.diemTH = 0.0;
	}
	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	

	/**
	 * @return the maSV
	 */
	public int getMaSV() {
		return maSV;
	}
	/**
	 * @param maSV the maSV to set
	 */
	public void setMaSV(int maSV) {
		if(maSV > 0)
		{
			this.maSV = maSV;
		}
		else 
		{
			this.maSV = 1;
		}
	}
	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		if(hoTen != null && !hoTen.isBlank())
		{
			this.hoTen = hoTen;
		}
		else
		{
			this.hoTen = "chua co thong tin";
		}
		
	}
	/**
	 * @return the diemLT
	 */
	public double getDiemLT() {
		return diemLT;
	}
	/**
	 * @param diemLT the diemLT to set
	 */
	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}
	/**
	 * @return the diemTH
	 */
	public double getDiemTH() {
		return diemTH;
	}
	/**
	 * @param diemTH the diemTH to set
	 */
	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}
	
	public double diemTB()
	{
		return (getDiemLT() + getDiemTH()) / 2;
	}
	public static SinhVien nhapTT()
	{
		Scanner sc = new Scanner(System.in);
		int maSV;
		String hoTen;
		double diemLT, diemTH;
		maSV = sc.nextInt();
		sc.nextLine();
		hoTen = sc.nextLine();
		diemLT = sc.nextDouble();
		diemTH = sc.nextDouble();
		SinhVien sv = new SinhVien(maSV, hoTen, diemLT, diemTH);
		return sv;
	}
	public String toString() {
		String s = String.format("|%-30d|%-30s|%-30f|%-30f|%-30f|", getMaSV(), getHoTen(), getDiemLT(), getDiemTH(), diemTB());
		return s;
	}
	public static void main(String[] args) {
		System.out.println();
		SinhVien sv1 = nhapTT();
		SinhVien sv2 = nhapTT();
		SinhVien sv3 = nhapTT();
		for(int i = 1; i <= 156; i++)
		{
			System.out.print('_');
		}
		System.out.printf("|%-30s|%-30s|%-30s|%-30s|%-30s|\n", "MaSV", "HoTen", "DiemLT", "DiemTH", "DiemTB");
		for(int i = 1; i <= 70; i++)
		{
			System.out.print('_');
		}
		System.out.println();
		System.out.print(sv1);
		for(int i = 1; i <= 156; i++)
		{
			System.out.print('_');
		}
		System.out.println();
		System.out.print(sv2);
		for(int i = 1; i <= 156; i++)
		{
			System.out.print('_');
		}
		System.out.println();
		System.out.print(sv3);
		for(int i = 1; i <= 156; i++)
		{
			System.out.print('_');
		}
	}

}
