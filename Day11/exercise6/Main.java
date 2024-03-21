package Day12.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();

        ArrayList<SachThamKhao> arrSachThamKhao = new ArrayList<>();

        int soSachGiaoKhoa, soSachThamKhao;
        int choice;

        do {
            System.out.println("Chọn một tùy chọn:");
            System.out.println("1. Nhap Thong tin sach giao khoa ");
            System.out.println("2. Nhap thong tin sach tham khao ");
            System.out.println("3. Tính tổng tiền sách giáo khoa");
            System.out.println("4. Tính tổng tiền sách tham khảo");
            System.out.println("5. Hiển thị thông tin sách giáo khoa");
            System.out.println("6. Hiển thị thông tin sách tham khảo");
            System.out.println("7. Tính trung bình cộng đơn giá sách tham khảo");
            System.out.println("8. Hiển thị các sách giáo khoa của nhà xuất bản X");
            System.out.println("9. Thoát chương trình");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số sách giáo khoa: ");
                    soSachGiaoKhoa = scanner.nextInt();
                    arrSachGiaoKhoa = nhapDSKH(soSachGiaoKhoa);
                    break;

                case 2:
                    System.out.print("Nhập số sách tham khảo: ");
                    soSachThamKhao = scanner.nextInt();
                    arrSachThamKhao = nhapDSKH(soSachThamKhao, "ThamKhao");
                    break;

                case 3:
                    tinhTongTienSachGiaoKhoa(arrSachGiaoKhoa);
                    break;

                case 4:
                    tinhTongTienSachThamKhao(arrSachThamKhao);
                    break;

                case 5:
                    hienThiThongTinSach(arrSachGiaoKhoa);
                    break;

                case 6:
                    hienThiThongTinSach(arrSachThamKhao);
                    break;

                case 7:
                    tinhTrungBinhCongDonGiaSachThamKhao(arrSachThamKhao);
                    break;

                case 8:
                    hienThiSachGiaoKhoaCuaNhaXuatBanX(arrSachGiaoKhoa);
                    break;

                case 9:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 9);
    }

    public static ArrayList<SachGiaoKhoa> nhapDSKH(int n) {
        ArrayList<SachGiaoKhoa> danhSachGiaoKhoa = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin sách giáo khoa thứ " + i + ":");
            scanner.nextLine();

            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            danhSachGiaoKhoa.add(sachGiaoKhoa);
        }
        return danhSachGiaoKhoa;
    }

    public static ArrayList<SachThamKhao> nhapDSKH(int n, String loaiSach) {
        ArrayList<SachThamKhao> danhSachThamKhao = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin sách tham khảo thứ " + i + ":");
            scanner.nextLine();

            SachThamKhao sachThamKhao = new SachThamKhao();
            sachThamKhao.nhapSach();
            danhSachThamKhao.add(sachThamKhao);
        }
        return danhSachThamKhao;
    }


    public static void tinhTongTienSachGiaoKhoa(ArrayList<SachGiaoKhoa> arrSachGiaoKhoa) {
        double tongTienSachGiaoKhoa = 0;
        for (SachGiaoKhoa sach : arrSachGiaoKhoa) {
            if (sach.getNumber() == 0) {
                tongTienSachGiaoKhoa += sach.getSoLuong() * sach.getDonGia() * 50 / 100;
            } else if (sach.getNumber() == 1) {
                tongTienSachGiaoKhoa += sach.getSoLuong() * sach.getDonGia();
            }
        }
        System.out.println("Tổng tiền sách giáo khoa = " + tongTienSachGiaoKhoa);
    }

    public static void tinhTongTienSachThamKhao(ArrayList<SachThamKhao> arrSachThamKhao) {
        double tongTienSachThamKhao = 0;
        for (SachThamKhao sach : arrSachThamKhao) {
            tongTienSachThamKhao += sach.getSoLuong() * sach.getDonGia() + sach.getThue();
        }
        System.out.println("Tổng tiền sách tham khảo = " + tongTienSachThamKhao);
    }

    public static void hienThiThongTinSach(ArrayList<? extends Sach> arrSach) {
        System.out.println("-----Thông tin sách-----");
        for (Sach sach : arrSach) {
            System.out.println(sach.toString());
        }
    }

    public static void tinhTrungBinhCongDonGiaSachThamKhao(ArrayList<SachThamKhao> arrSachThamKhao) {
        double tongDonGiaSachThamKhao = 0;
        for (SachThamKhao sach : arrSachThamKhao) {
            tongDonGiaSachThamKhao += sach.getDonGia();
        }
        double trungBinhCongDonGia = tongDonGiaSachThamKhao / arrSachThamKhao.size();
        System.out.println("Trung bình cộng đơn giá các sách tham khảo = " + trungBinhCongDonGia);
    }

    public static void hienThiSachGiaoKhoaCuaNhaXuatBanX(ArrayList<SachGiaoKhoa> arrSachGiaoKhoa) {
        System.out.println("---Các sách giáo khoa của nhà xuất bản X---");
        for (SachGiaoKhoa sach : arrSachGiaoKhoa) {
            if (sach.getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(sach.toString());
            }
        }
    }
}
