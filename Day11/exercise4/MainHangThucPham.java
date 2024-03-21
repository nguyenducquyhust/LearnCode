package Day12.exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainHangThucPham {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangThucPham hangThucPham = null;

        while (true) {
            System.out.println("---------------------------Menu------------------------");
            System.out.println("| chon 1 : Nhap thong tin hang thuc pham               |");
            System.out.println("| chon 2 : Xuat thong tin hang thuc pham               |");
            System.out.println("| chon 3 : Kiem tra hang da het han chua               |");
            System.out.println("| chon 4 : Thoat chuong trinh                           |");
            System.out.println("<<--------------------------------------------------->>");

            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hangThucPham = HangThucPhamSevice.nhapThongTinHang();
                    break;
                case 2:
                    if (hangThucPham != null) {
                        HangThucPhamSevice.xuatThongTinHang(hangThucPham);
                    } else {
                        System.out.println("Chua nhap thong tin hang.");
                    }
                    break;
                case 3:
                    if (hangThucPham != null) {
                        HangThucPhamSevice.kiemTraHetHan(hangThucPham);
                    } else {
                        System.out.println("Chua nhap thong tin hang.");
                    }
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}


