package tuan3;
import java.time.LocalDate;

public class main {
    private static void inDongGachNgang() {
        for (int i = 0; i < 88; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    	HangThucPham tp1, tp2, tp3;
        try {
        	tp1 = new HangThucPham("001", "Gạo", 100000.0, 
                    LocalDate.of(2018, 7, 10), 
                    LocalDate.of(2018, 7, 10));
        } catch (Exception e) {
        	tp1 = new HangThucPham("001");
        }
        try {
        	tp2 = new HangThucPham("002", "Mì", 5000.0, 
                    LocalDate.of(2018, 3, 1), 
                    LocalDate.of(2018, 9, 1));
        } catch (Exception e) {
        	tp2 = new HangThucPham("002");
        }
        try {
        	tp3 = new HangThucPham("003", "Nước", 10000.0, 
                    LocalDate.of(2017, 3, 1), 
                    LocalDate.of(2018, 3, 1));
        } catch (Exception e) {
        	tp3 = new HangThucPham("003");
        }
        System.out.printf("%-8s %-12s %17s   %-16s %-16s %s\n", 
                "Mã_Hàng", "Tên_Hàng", "Đơn_Giá", "Ngày_Sản_Xuất", "Ngày_Hết_Hạn", "Ghi_Chú");
        
        inDongGachNgang();

        System.out.println(tp1);
        System.out.println(tp2);
        System.out.println(tp3);
    }
}
