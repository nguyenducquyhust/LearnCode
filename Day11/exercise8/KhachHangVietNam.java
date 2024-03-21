package Day12.exercise8;

import Day12.exercise5.ChuyenXeNoiThanh;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHangVietNam extends KhachHang {
    static Scanner scanner = new Scanner(System.in);
    protected Integer dinhMuc;
    protected String loaiKhachHang;

    public KhachHangVietNam() {

    }

    public KhachHangVietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, Integer soLuong, Float donGia, String loaiKhachHang) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.loaiKhachHang = loaiKhachHang;
    }

    public Integer getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(Integer dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    /**
     * @return
     */
    @Override
    public double thanhTien() {
        if (soLuong <= dinhMuc) {
            return soLuong * donGia;
        } else {
            return (dinhMuc * donGia) + ((soLuong - dinhMuc) * donGia * 2.5);
        }
    }

    public void nhapThongTinKHVN() {
        System.out.println("Nhập thông tin khách hàng Việt Nam:");
        System.out.print("Nhập mã khách hàng: ");
        String maKhachHang = scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập ngày ra hóa đơn (dd-MM-yyyy): ");
        String ngayRaHoaDonStr = scanner.nextLine();

        System.out.println("Nhập đối tuơngj khách hàng (1. Sinh Hoat , 2. San Xuat , 3. Kinh Doanh) ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                loaiKhachHang = "Sinh Hoat";
                break;
            case 2:
                loaiKhachHang = " San Xuat ";
                break;
            case 3:
                loaiKhachHang = " Kinh Doanh";
                break;
        }

        System.out.print("Nhập số lượng: ");
        double soLuong = scanner.nextDouble();

        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhập định mức: ");
        double dinhMuc = scanner.nextDouble();

    }

//    public static int nhapSoLuongKH() {
//        System.out.print("Nhập số lượng khách hàng: ");
//        return scanner.nextInt();
//    }
//    // Nhap danh sach khach hang

    static ArrayList<KhachHangVietNam> khachHangVietNam = nhapDSKH(KhachHang.nhapSoLuongKhachhang());

    public static ArrayList<KhachHangVietNam> nhapDSKH(int n) {
        ArrayList<KhachHangVietNam> danhSachKHVN = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Khach hang thu : " + i);
            scanner.nextLine();

            KhachHangVietNam khachHangVietNam = new KhachHangVietNam();
            khachHangVietNam.nhapThongTinKHVN();
            danhSachKHVN.add(khachHangVietNam)
            ;
        }
        return danhSachKHVN;
    }

    // in ra thong tin khach hang

    public static void hienThiDSKH(ArrayList<KhachHangVietNam> danhSachKHVN) {
        System.out.println("Danh sách Khách hàng Việt Nam:");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", "Mã khách hàng", "Họ tên", "Ngày ra hóa đơn", "So luong", "Don gia ", "Loai khach hang ");
        for (KhachHangVietNam khachHang : danhSachKHVN) {
            System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", khachHang.getMaKhachHang(), khachHang.getHoTen(), khachHang.getNgayRaHoaDon(), khachHang.soLuong , khachHang.donGia, khachHang.loaiKhachHang);
        }

        int soLuongKhachHang = KhachHang.nhapSoLuongKhachhang();


        // Hiển thị thông tin danh sách khách hàng
        hienThiDSKH(danhSachKHVN);
    }

    public static void xuatThongTinDsVNthangchin2013(ArrayList<KhachHangVietNam> khachHangVietNam) {
        System.out.println("Cac hoa don trong thang 9 nam 2013");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", "Mã khách hàng", "Họ tên", "Ngày ra hóa đơn", "Đối tượng", "Số lượng", "Thành tiền");
        for (KhachHangVietNam khacHang : khachHangVietNam) {
            if (khacHang.getNgayRaHoaDon().equals("9/2013")) {
                System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", khacHang.getMaKhachHang(), khacHang.getHoTen(), khacHang.getNgayRaHoaDon(), khacHang.loaiKhachHang, khacHang.getSoLuong(), khacHang.thanhTien());

            }
        }
    }
}



