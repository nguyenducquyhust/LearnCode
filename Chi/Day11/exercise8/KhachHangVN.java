package exercise8;//package exercise8;
//
//import javax.print.DocFlavor;
//import java.time.LocalDate;
//import java.util.Scanner;
//
//     public class KhachHangVN extends KhachHang {
//     Scanner scanner = new Scanner(System.in);
//     protected String getDoiTuongKhachHang;
//     final  public Integer dinhMuc = 2500;
//
//    public KhachHangVN ( Integer dinhMuc){
//    super();
//    }
//    public void nhapThongTinKhachHang() {
//        super.nhapThongTinKhachHang();
//        System.out.println(" Dinh muc: ");
//    }
//
//    public void hienThiThongTinKhachhang() {
//        super.hienThiThongTinKhachHang();
//        System.out.println(" Dinh muc: " + dinhMuc);
//
//    }
//
//    @Override
//    public String toString() {
//        return "KhachHangVN{" +
//                super.toString() +
//                "dinhMuc=" + dinhMuc +
//                '}';
//    }
//    //    public double tinhTien(){
////        if(getSoLuong() <= getDinhMuc()) {
////            thanhTien = getSoLuong() * getDonGia();
////        }
////        else{
////            thanhTien = getSoLuong() * getDonGia() * getDinhMuc() +
////         //  thành tiền = số lượng * đơn giá * định mức + số lượng KW vượt định mức * Đơn giá * 2.5.
////        }
//
//    public KhachHangVN(String maKhachHang, String hoTen, String ngayRaHoasDon, Integer soLuong, Float donGia, Integer dinhMuc) {
//        super(maKhachHang, hoTen, ngayRaHoasDon, soLuong, donGia);
//    }
//
//    private  String doiTuongKhachHang;
//
//    /**
//     * Ham tinh thanh tien
//     * @param khachHangVN
//     * @return so tien
//     */
//
//    public double thanhTien( KhachHangVN khachHangVN){
//        if ( soLuong > dinhMuc) {
//            return  super.thanhTien() * dinhMuc + (( soLuong - dinhMuc ) *donGia * 2.5 );
//        } else {
//            return super.thanhTien();
//        }
//    }
//
//    public  String nhapDoiTuong( int luaChon){
//       switch ( luaChon );
//       case
//
//
//    }
//    public  void nhapThongtin(){
//        super.nhapThongTinKhachHang();
//        int luaChon;
//        System.out.println(" Nhap dinh muc: ");
//        do{
//            System.out.println(" Nhap doi tuong khach hang: ( 1- sinh hoat / 2- kinh doanh / 3- san xuat)");
//            luaChon = scanner.nextInt();
//        } while ( luaChon < 1 && luaChon > 3 );
//
//    }
//}
