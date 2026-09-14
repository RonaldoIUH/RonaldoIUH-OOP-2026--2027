package tuan4;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	public int getMaCD() {
		return maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	
	public void setMaCD(int maCD) {
		if(maCD > 0) this.maCD = maCD;
		else this.maCD = 999999;
	}
	public void setTuaCD(String tuaCD) {
		if(tuaCD != null && !tuaCD.trim().isEmpty()) this.tuaCD = tuaCD;
		else this.tuaCD = "chua xac dinh";
	}
	public void setSoBaiHat(int soBaiHat){
		if(soBaiHat > 0) this.soBaiHat = soBaiHat;
		else throw new IllegalArgumentException("so bai hat phai lon hon 0");
	}
	public void setGiaThanh(double giaThanh) {
		if(giaThanh > 0) this.giaThanh = giaThanh;
		else throw new IllegalArgumentException("gia thanh phai lon hon 0");
	}
	
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}
	public CD() {
		this.maCD = 999999;
		this.tuaCD = "chua xac dinh";
	}
	
	public String toString() {
		return String.format(
	            "|%10s|%10s|%10d|%10.2f|%10.2f|",
	            maCD, tuaCD, soBaiHat, giaThanh, giaThanh * soBaiHat);
	}
	
	
	
}