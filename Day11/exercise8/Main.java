package Day12.exercise8;

import Day12.exercise5.ChuyenXeService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chon = 0;

//        ArrayList<KhachHangNuocNgoai> dskhachHangNuocNgoai = KhachHangNuocNgoai.khachHangNuocNgoai;
//        //dskhachHangNuocNgoai = KhachHangNuocNgoai.nhapDSKHNN(KhachHang.nhapSoLuongKhachhang());
//
//
//        ArrayList<KhachHangVietNam> dsKhachhangVN = KhachHangVietNam.khachHangVietNam;
        //KhachHangVietNam.nhapDSKH(KhachHang.nhapSoLuongKhachhang());



        while (chon != 10) {
            System.out.println("---------------------------Menu------------------------");
            System.out.println("| chon 1 :Nhap danh sach Khach Hang Viet Nam       |");
            System.out.println("| chon 2 :Nhap danh sach Khach hang Nuoc Ngoai      |");
            System.out.println("| chon 3 :Xuat thong tin danh sach Khach hang Viet Nam  |");
            System.out.println("| chon 4 :Xuat thong tin danh sach Khach hang Nuoc Ngoai |");
            System.out.println("| chon 5 :Tong danh sach Viet Nam :    |");
            System.out.println("| chon 6 :Tong so danh sach Nuoc Ngoai:  |");
            System.out.println("| chon 7 :Tong trung binh danh sach nuoc ngoai :   |");
            System.out.println("| chon 8 :Xuat hoa don khach hang tu Thang 9- 2013 cua KH Viet Nam |");
            System.out.println("| chon 9 :Xuat hoa don khach hang tu Thang 9- 2013 cua KH Nuoc Ngoai  |");
            System.out.println("| chon 10 :Thoat chuong trinh                        |");
            System.out.println("<<--------------------------------------------------->>");

            System.out.println("Nhap so tu 1 -> 10 de chon chuong trinh:");
            chon = scanner.nextInt();
            System.out.println("---------------------------------------");



            switch (chon) {
                case 1:
                    int n = KhachHang.nhapSoLuongKhachhang();
                    dsKhachhangVN = KhachHangVietNam.nhapDSKH(n);
                    break;
                case 2:
                    int m = KhachHang.nhapSoLuongKhachhang();
                    dskhachHangNuocNgoai = KhachHangNuocNgoai.nhapDSKHNN(m);
                    break;
                case 3:
                    KhachHangVietNam.hienThiDSKH(dsKhachhangVN);
                    break;
                case 4:
                    KhachHangNuocNgoai.hienThiDSKHNN(dskhachHangNuocNgoai);
                    break;
                case 5:
                    KhachHangVietNam khachHangVietNam = new KhachHangVietNam();
                    khachHangVietNam.thanhTien();
                case 6:
                   KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai();
                   khachHangNuocNgoai.thanhTien();
                case 7:
                    KhachHangNuocNgoai.tinhTBTien(dskhachHangNuocNgoai);
                case 8:
                    KhachHangVietNam.xuatThongTinDsVNthangchin2013(dsKhachhangVN);
                case 9 :
                    KhachHangNuocNgoai.xuatThongTinDsNNthangchin2013(dskhachHangNuocNgoai);
                case 10:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }

        }
    }
 public static ArrayList<KhachHangNuocNgoai> dskhachHangNuocNgoai = KhachHangNuocNgoai.khachHangNuocNgoai;
    //dskhachHangNuocNgoai = KhachHangNuocNgoai.nhapDSKHNN(KhachHang.nhapSoLuongKhachhang());


public static  ArrayList<KhachHangVietNam> dsKhachhangVN = KhachHangVietNam.khachHangVietNam;

//    static int nhapSoLuongKhachhang() {
//        System.out.println("Nhap so luong Khach hang");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        //kiem tra số lượng > 0 thì hợp lệ
//        if(n > 0) {
//            return n;
//        } else {
//            System.out.println("So luong ko hop le");
//        }
//        return n;
//    }
}
