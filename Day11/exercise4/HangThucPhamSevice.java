package Day12.exercise4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangThucPhamSevice {
    static Scanner scanner = new Scanner(System.in);
    public static HangThucPham nhapThongTinHang() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhap ma hang: ");
        String maHang = scanner.nextLine();
        System.out.print("Nhap ten hang: ");
        String tenHang = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng trống

        System.out.println("Nhap format date ");
        String formatDate = scanner.nextLine();

        System.out.print("Nhap ngay san xuat (dd/MM/yyyy): ");
        String ngaySanXuatString = scanner.nextLine();
        Date ngaySanXuat = DateUtil.chuyenTuStringSangDate(ngaySanXuatString, formatDate);

        System.out.print("Nhap ngay het han (dd/MM/yyyy): ");
        String ngayHetHanSting = scanner.nextLine();
        Date ngayHetHan = DateUtil.chuyenTuStringSangDate(ngayHetHanSting, formatDate);

        return new HangThucPham(maHang, tenHang, donGia, ngaySanXuat, ngayHetHan);
    }

    public static void xuatThongTinHang(HangThucPham hangThucPham) {
        System.out.println("Thong tin hang thuc pham:");
        System.out.println(hangThucPham);
    }

    public static void kiemTraHetHan(HangThucPham hangThucPham) {
        if (hangThucPham.daHetHan()) {
            System.out.println("Hang da het han su dung.");
        } else {
            System.out.println("Hang con han su dung.");
        }
    }
}
