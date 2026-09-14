package tuan1.hinhtron;

public class Toado {
	private String ten;
	private double x, y;
	
	//get and set
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	//khoi tao
	public Toado(String ten, double x, double y) {
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Toado [ten=" + ten + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
}
