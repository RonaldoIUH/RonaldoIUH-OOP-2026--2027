package tuan1.hcn;

public class hcn {
	private double chieudai;
	private double chieurong;
	public double getChieudai() {
		return chieudai;
	}
	public void setChieudai(double chieudai) throws Exception{
		if(chieudai > 0) 
		{
			this.chieudai = chieudai;
		}
		else 
		{
			throw new Exception("chieu dai phai lon hon 0");
		}
	}
	public double getChieurong() {
		return chieurong;
	}
	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	public hcn(double chieudai, double chieurong) throws Exception {
		if(chieudai > 0) 
		{
			this.chieudai = chieudai;
		}
		else
		{
			throw new Exception("chieu rong phai lon hon 0");
		}
		
	}
	public hcn() {
		
	}
	public double getDT()
	{
		return (this.chieudai + this.chieurong) * 2;
	}
	public static void main(String[] args) throws Exception
	{
		hcn h1 = new hcn(3, 6);
		System.out.println("chieu dai hinh chu nhat la:" + h1.getChieudai());
		System.out.println("chieu rong hinh chu nhat la:" + h1.getChieurong());
	}
}