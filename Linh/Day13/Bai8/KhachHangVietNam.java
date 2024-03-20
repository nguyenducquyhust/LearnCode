package Bai8;

import java.time.LocalDate;

public class KhachHangVietNam {
    // tat ca thuoc tinh cua cha co thi con se co.
// con co thi cha ko co
    public class KhachHangVietNam extends KhachHang {
        private Integer dinhMuc;

        public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngayRaHoaDon, Integer soLuong, Float donGia, Integer dinhMuc) {
            super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        }

        public KhachHangVietNam(Integer dinhMuc) {
            super();
//        this.dinhMuc = dinhMuc;
        }

        public Integer getDinhMuc() {
            return dinhMuc;
        }

        public void setDinhMuc(Integer dinhMuc) {
            this.dinhMuc = dinhMuc;
        }

        @Override
        public String toString() {
            return "khachHangVietNam{" +
                    super.toString() +
                    "dinhMuc=" + dinhMuc +
                    '}';
        }

        //* Ham tinh thanh tien
        public double thanhTien(KhachHangVietNam khachHangVietNam) {
            if (soLuong > dinhMuc) {
                return super.thanhTien() * 2.5;
            } else {
                return super.thanhTien() * dinhMuc + ((soLuong - dinhMuc) * donGia * 2.5);
            }
        }

        public void nhapThongTinKhachHang{
            super.thongTinKhachHang();
            System.out.println(" Nhap dinh muc:");
            dinhMuc = scanner.nextInt();
            int luaChon;


            do {
                System.out.println("Nhap doi tuong khach hang/ 1-sinh hoat, 1- kinh doanh, 3-san xuat");
                luaChon = scanner.nextInt();
            } while ( luaChon < 1 || luaChon > 3 );


        }
    }
}
