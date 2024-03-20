
package exercise6;

import java.util.Scanner;

public class Sach {
        Scanner scanner = new Scanner(System.in);
        protected String maSach;
        protected String nhaXuatBan;
        protected double donGia;
        protected int soLuong;
        protected String ngayNhap;

        public Sach() {
        }

        public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong, String ngayNhap) {
                this.maSach = maSach;
                this.nhaXuatBan = nhaXuatBan;
                this.donGia = donGia;
                this.soLuong = soLuong;
                this.ngayNhap = ngayNhap;
        }

        public String getMaSach() {
                return maSach;
        }

        public void setMaSach(String maSach) {
                this.maSach = maSach;
        }

        public String getNhaXuatBan() {
                return nhaXuatBan;
        }

        public void setNhaXuatBan(String nhaXuatBan) {
                this.nhaXuatBan = nhaXuatBan;
        }

        public double getDonGia() {
                return donGia;
        }

        public void setDonGia(double donGia) {
                this.donGia = donGia;
        }

        public int getSoLuong() {
                return soLuong;
        }

        public void setSoLuong(int soLuong) {
                this.soLuong = soLuong;
        }

        public String getNgayNHap() {
                return ngayNhap;
        }

        public void setNgayNHap(String ngayNHap) {
                this.ngayNhap = ngayNHap;
        }

        @Override
        public String toString() {
                return "Sach{" +
                        "maSach='" + maSach + '\'' +
                        ", nhaXuatBan='" + nhaXuatBan + '\'' +
                        ", donGia=" + donGia +
                        ", soLuong=" + soLuong +
                        ", ngayNHap='" + ngayNhap + '\'' +
                        '}';
        }

    /**
     * ham nhap
         */
        public void nhapSach() {
                System.out.print("Nhap ma sach: ");
                maSach = scanner.nextLine();

                System.out.print("Nhap ten nha xuat ban: ");
                nhaXuatBan = scanner.nextLine();

                System.out.print("Nhap don Gia: ");
                donGia = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(" Nhap ngay nhap: ");
                ngayNhap = scanner.nextLine();

                System.out.print("Nhap so luong: ");
                soLuong = scanner.nextInt();
        }
}
