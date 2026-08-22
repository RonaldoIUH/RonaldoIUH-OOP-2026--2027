package tuan1.hinhtron;

public class HinhTron {
	private double r;
	private Toado tam;
	private final double PI = 3.14;
	//set and get
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Toado getTam() {
		return tam;
	}
	public void setTam(Toado tam) {
		this.tam = tam;
	}
	
	//khoi tao
	public HinhTron(double r, Toado tam) {
		this.r = r;
		this.tam = tam;
	}
	
	@Override
	public String toString() {
		return "HinhTron [r=" + r + ", tam=" + tam + "]";
	}
	
	//Tinh dien tich 
	public double Tinhdientich() {
		return this.r*this.r*PI;
	}
	public static void main(String[] args) {
		HinhTron h2 = new HinhTron(3, new Toado("O", 0, 0));
		System.out.println(h2);
		System.out.println("Dien tich hinh tron = " + h2.Tinhdientich());
	}
	
}
