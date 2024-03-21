//package Day12.exercise5;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main1 {
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int chon = 0;
//
//        // 1. Nhập số lượng khách hàng
//        int n = nhapSoLuongChuyenXe();
//
//        ArrayList<ChuyenXeNoiThanh> danhSachChuyenXeNoiThanh = ChuyenXeService.chuyenXeNoiThanh;
//        ArrayList<ChuyenXeNgoaiThanh> danhSachChuyenXeNgoaiThanh = ChuyenXeService.chuyenXeNgoaiThanh;
//
//        // Hiển thị menu và thực hiện chức năng tương ứng với lựa chọn của người dùng
//        while (chon != 7) {
//            System.out.println("---------------------------Menu------------------------");
//            System.out.println("| chon 1 : Nhập danh sách chuyến xe nội thành        |");
//            System.out.println("| chon 2 : Nhập danh sách chuyến xe ngoại thành      |");
//            System.out.println("| chon 3 : Xuất thông tin danh sách chuyến xe nội thành     |");
//            System.out.println("| chon 4 : Xuất thông tin danh sách chuyến xe ngoại thành   |");
//            System.out.println("| chon 5 : Tính doanh thu danh sách chuyến xe nội thành     |");
//            System.out.println("| chon 6 : Tính doanh thu danh sách chuyến xe ngoại thành   |");
//            System.out.println("| chon 7 : Thoát chương trình                        |");
//            System.out.println("<<--------------------------------------------------->>");
//
//            System.out.print("Nhập lựa chọn của bạn: ");
//            chon = scanner.nextInt();
//
//            switch (chon) {
//                case 1:
//                    danhSachChuyenXeNoiThanh = ChuyenXeService.nhapDSKH(n);
//                    break;
//                case 2:
//                    danhSachChuyenXeNgoaiThanh = ChuyenXeService.nhapDSKH1(n);
//                    break;
//                case 3:
//                    ChuyenXeService.hienThiDanhSachChuyenXeNoiThanh(danhSachChuyenXeNoiThanh);
//                    break;
//                case 4:
//                    ChuyenXeService.hienThiDanhSachChuyenXeNgoaiThanh(danhSachChuyenXeNgoaiThanh);
//                    break;
//                case 5:
//                    ChuyenXeService.tongDoanhThuCHuyenXeNoiThanh(danhSachChuyenXeNoiThanh);
//                    break;
//                case 6:
//                    ChuyenXeService.tongDoanhThuChuyenXeNgoaiThanh(danhSachChuyenXeNgoaiThanh);
//                    break;
//                case 7:
//                    System.out.println("Kết thúc chương trình.");
//                    break;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ.");
//            }
//        }
//    }
//
//}
