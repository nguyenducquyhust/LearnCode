package thucPham;

import java.time.LocalDate;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để rỗng");
        }
        if (tenHang == null || tenHang.isEmpty()) {
            throw new IllegalArgumentException("Tên hàng không được để rỗng");
        }
        if (donGia <= 0) {
            throw new IllegalArgumentException("Đơn giá phải > 0");
        }
        if (ngaySanXuat == null) {
            throw new IllegalArgumentException("Ngày sản xuất không được để rỗng");
        }
        if (ngayHetHan == null) {
            throw new IllegalArgumentException("Ngày hết hạn không được để rỗng");
        }
        if (ngayHetHan.isBefore(ngaySanXuat)) {
            throw new IllegalArgumentException("Ngày hết hạn phải sau ngày sản xuất");
        }
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public HangThucPham(String maHang) {
        this(maHang, "", 0, LocalDate.now(), LocalDate.now());
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để rỗng");
        }
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.isEmpty()) {
            throw new IllegalArgumentException("Tên hàng không được để rỗng");
        }
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia <= 0) {
            throw new IllegalArgumentException("Đơn giá phải > 0");
        }
        this.donGia = donGia;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat == null) {
            throw new IllegalArgumentException("Ngày sản xuất không được để rỗng");
        }
        this
    }
}
