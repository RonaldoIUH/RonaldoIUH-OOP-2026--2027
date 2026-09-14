package tuan4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class listCD {
	private CD[] polyCD;
	private int count;
	
	public listCD(int n) {
		this.polyCD = new CD[n]; 
	}
	
	public void tangKT()
	{
		if(polyCD.length == count)
		{
			CD[] temp = new CD[polyCD.length * 2];
			System.arraycopy(polyCD, 0, temp, 0, count);
			polyCD = temp;
		}
	}
	public boolean xoa(int maXoa)
	{
		for(int i = 0; i < count; i++)
		{
			if(maXoa == polyCD[i].getMaCD())
			{
				for(int j = i; j < count - 1; j++)
				{
					polyCD[j] = polyCD[j + 1];
				}
				polyCD[count] = null;
				count--;
				return true;
			}
		}
		return false;
	}
	
	public boolean capnhat(int maCD, double cost)
	{
		for(int i = 0; i < count; i++)
		{
			if(maCD == polyCD[i].getMaCD())
			{
				polyCD[i].setGiaThanh(cost);
				return true;
			}
		}
		return false;
	}
	public boolean containMa(CD ss)
	{
		for(int i = 0; i < this.count; i++)
		{
			if(ss.getMaCD() == this.polyCD[i].getMaCD()) return true;
		}
		return false;
	}
	public boolean add_CD(CD add)
	{
		if(count < polyCD.length )
		{
			if(!containMa(add))
			{
				tangKT();
				polyCD[count] = add;
				count++;
				return true;
			}
			else throw new IllegalArgumentException("maCD bi trung");
		}
		else 
		{
			throw new IllegalArgumentException("Mang da day, khong the luu them");
		}
	}
	
	public int soLuongCD()
	{
		return count;
	}
	
	public double tongGiaCD()
	{
		double sum = 0;
		for(int i = 0; i < this.count; i++) sum += this.polyCD[i].getGiaThanh();
		return sum;
	}
	
	public void nhapCD(Scanner sc)
	{
		try {
            System.out.print("Nhap ma CD: ");
            int maCD = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Nhap tua CD: ");
            String tuaCD = sc.nextLine();

            System.out.print("Nhap so bai hat: ");
            int soBai = sc.nextInt();
            sc.nextLine();
            		
            System.out.print("Nhap don gia: ");
            double gia = sc.nextDouble();
            sc.nextLine();

            CD cd = new CD(maCD, tuaCD, soBai, gia);
            if (add_CD(cd) == true) {
                System.out.println("=> Them CD thanh cong!");
            } else {
                System.out.println("=> Ma CD da ton tai, them that bai!");
            }
        } catch (Exception e) {
            System.out.println("=> Loi nhap lieu: " + e.getMessage());
        }
	}

	public String toString() {
		String res = "";
		for(int i = 0; i < this.count ; i++)
		{
			res += polyCD[i];
		}
		return  res;
	}

	public void sort_giaThanh()
	{
		Arrays.sort(polyCD, 0, count, new Comparator<CD>() {
			@Override
		    public int compare(CD cd1, CD cd2) {
		        return Double.compare(cd2.getGiaThanh(), cd1.getGiaThanh());
		    }
		});
	}
	
	public void sort_tuaCD()
	{
		Arrays.sort(this.polyCD, 0, this.count, new Comparator<CD>()
		{
			public int compare(CD cd1, CD cd2)
			{
				return cd1.getTuaCD().compareTo(cd2.getTuaCD());
			}
		});
	}
}