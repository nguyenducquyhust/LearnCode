package Day12.exercise5;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chon = 0;

        System.out.println("---------------------------Menu------------------------");
        System.out.println("| chon 1 :Nhap danh sach chuyen xe noi thanh        |");
        System.out.println("| chon 2 :Nhap danh sach chuyen xe ngoai thanh      |");
        System.out.println("| chon 3 :Xuat thong tin danh sach xe Noi Thanh     |");
        System.out.println("| chon 4 :Xuat thong tin danh sach xe Ngoai Thanh  |");
        System.out.println("| chon 5 :Doanh thu danh sach chuyen xe Noi Thanh   |");
        System.out.println("| chon 6 :Doanh thu danh sach chuyen xe Ngoai thanh |");
        System.out.println("| chon 7 :Thoat chuong trinh                        |");
        System.out.println("<<--------------------------------------------------->>");

        int n = nhapSoLuongChuyenXe();

        ArrayList<ChuyenXeNoiThanh> danhSachChuyenXeNoiThanh = ChuyenXeService.chuyenXeNoiThanh;

        ArrayList<ChuyenXeNgoaiThanh> danhSachChuyenXeNgoaiThanh = ChuyenXeService.chuyenXeNgoaiThanh;


        while (chon != 7) {

            System.out.println("Nhap so tu 1 -> 7 de chon chuong trinh:");
            chon = scanner.nextInt();
            System.out.println("---------------------------------------");
           // int n = ChuyenXeService.nhapSoLuongKH();

            switch (chon) {
                case 1:
                    danhSachChuyenXeNoiThanh = ChuyenXeService.nhapDSKH(n);
                    break;
                case 2:
                    danhSachChuyenXeNgoaiThanh = ChuyenXeService.nhapDSKH1(n);
                    break;
                case 3:
                    ChuyenXeService.hienThiDanhSachChuyenXeNoiThanh(danhSachChuyenXeNoiThanh);
                    break;
                case 4:
                    ChuyenXeService.hienThiDanhSachChuyenXeNgoaiThanh(danhSachChuyenXeNgoaiThanh);
                    break;
                case 5:
                    ChuyenXeService.tongDoanhThuCHuyenXeNoiThanh(danhSachChuyenXeNoiThanh);
                    break;
                case 6:
                    ChuyenXeService.tongDoanhThuChuyenXeNgoaiThanh(danhSachChuyenXeNgoaiThanh);
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
    static int nhapSoLuongChuyenXe() {
        System.out.println("Nhap so luong Chuyen Xe");
        int n = scanner.nextInt();
        scanner.nextLine();

        //kiem tra số lượng > 0 thì hợp lệ
        if(n > 0) {
            return n;
        } else {
            System.out.println("So luong ko hop le");
        }
        return n;
    }
}
