package Day12.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang {
    static Scanner scanner = new Scanner(System.in);
    protected String quocTich;


    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, Integer soLuong, Float donGia, String quocTich) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai() {

    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }


    public void nhapThongTinKHNN() {
        System.out.println("Nhap ma khach hang :");
        maKhachHang = scanner.nextLine();
        System.out.println("Nhap ho ten khach hang : ");
        hoTen = scanner.nextLine();
        System.out.println(" Nhap ngay ra hoa don ");
        ngayRaHoaDon = scanner.nextLine();
        System.out.println("Nhap quoc tich ");
        quocTich = scanner.nextLine();
        System.out.println(" nhap so luong : ");
        soLuong = scanner.nextInt();
        System.out.println("Nhap don gia ");
        donGia = scanner.nextFloat();
    }

//    public static int nhapSoLuongKH() {
//        System.out.print("Nhập số lượng khách hàng: ");
//        return scanner.nextInt();
//    }

    // Hàm nhập danh sách khách hàng nước ngoài

    static ArrayList<KhachHangNuocNgoai> khachHangNuocNgoai = nhapDSKHNN(KhachHang.nhapSoLuongKhachhang());

    public static ArrayList<KhachHangNuocNgoai> nhapDSKHNN(int n) {
        ArrayList<KhachHangNuocNgoai> danhSachKHNN = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Khách hàng thứ: " + i);
            scanner.nextLine();

            KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai();
            khachHangNuocNgoai.nhapThongTinKHNN();
            danhSachKHNN.add(khachHangNuocNgoai);
        }
        return danhSachKHNN;
    }

    // Hàm hiển thị danh sách khách hàng nước ngoài
    public static void hienThiDSKHNN(ArrayList<KhachHangNuocNgoai> danhSachKHNN) {
        System.out.println("Danh sách Khách hàng nước ngoài:");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", "Mã khách hàng", "Họ tên", "Ngày ra hóa đơn", "Quốc tịch", "Thành tiền");
        for (KhachHangNuocNgoai khachHang : danhSachKHNN) {
            System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", khachHang.getMaKhachHang(), khachHang.getHoTen(), khachHang.getNgayRaHoaDon(), khachHang.getQuocTich(), khachHang.thanhTien());
        }
    }

    public static double tinhTBTien(ArrayList<KhachHangNuocNgoai> khachHangNuocNgoai) {
        double trungBinh = 0;
        int count = 0;

        for (KhachHangNuocNgoai khachHangNuocNgoai1 : khachHangNuocNgoai) {
            trungBinh += khachHangNuocNgoai1.thanhTien();
            count++;
        }
        return trungBinh / count;
    }

    public static void xuatThongTinDsNNthangchin2013(ArrayList<KhachHangNuocNgoai> khachHangNuocNgoai) {
        System.out.println("Cac hoa don trong thang 9 nam 2013");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", "Mã khách hàng", "Họ tên", "Ngày ra hóa đơn", "Quốc tịch", "Thành tiền");
        for (KhachHangNuocNgoai khacHang : khachHangNuocNgoai) {
            if (khacHang.getNgayRaHoaDon().equals("9/2013")) {
                System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", khacHang.getMaKhachHang(), khacHang.getHoTen(), khacHang.getNgayRaHoaDon(), khacHang.getQuocTich(), khacHang.thanhTien());

            }
        }
    }
}
