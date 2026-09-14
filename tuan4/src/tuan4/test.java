package tuan4;

import java.util.Scanner;
public class test {

    
    public static void menu() {
        System.out.println("\n========= MENU QUAN LY CD =========");
        System.out.println("1. Nhap CD tu ban phim");
        System.out.println("2. Xoa CD theo ma");
        System.out.println("3. Cap nhat gia CD theo ma");
        System.out.println("4. In danh sach CD");
        System.out.println("5. Tinh tong thanh tien");
        System.out.println("0. Thoat");
        System.out.println("===================================");
        System.out.print("Chon chuc nang: ");
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Nhap so luong CD toi da ban dau: ");
        int n = Integer.parseInt(sc.nextLine());
        listCD ds = new listCD(n);

        int chon;
        do {
            menu();
            try {
                chon = sc.nextInt();
                sc.nextLine();
            } catch (NumberFormatException e) {
                chon = -1; 
            }

            switch (chon) {
                case 1:
                	
                    ds.nhapCD(sc);
                    break;
                case 2:
                	int maXoa = sc.nextInt();
                	sc.nextLine();
                    ds.xoa(maXoa);
                    break;
                case 3:
                	int ma = sc.nextInt();
                	sc.nextLine();
                	double gia = sc.nextDouble();
                	sc.nextLine();
                    ds.capnhat(ma, gia);
                    break;
                case 4:
                    System.out.println(ds);
                    break;
                case 5:
                    System.out.printf("Tong thanh tien: %.2f%n",
                                        ds.tongGiaCD());
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Chuc nang khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}