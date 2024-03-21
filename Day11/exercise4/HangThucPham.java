package Day12.exercise4;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    // Constructor đầy đủ tham số
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        this.maHang = maHang;
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    // Constructor có tham số mã hàng
    public HangThucPham(String maHang) {
        this.maHang = maHang;
    }

    // Getter cho mã hàng
    public String getMaHang() {
        return maHang;
    }

    // Getter và setter cho tên hàng
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang != null && !tenHang.trim().isEmpty()) {
            this.tenHang = tenHang.trim();
        } else {
            this.tenHang = "Unknown";
        }
    }

    // Getter và setter cho đơn giá
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0;
        }
    }

    // Getter và setter cho ngày sản xuất
    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        if (ngaySanXuat != null) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = new Date();
        }
    }

    // Getter và setter cho ngày hết hạn
    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan != null && ngayHetHan.after(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            // Mặc định ngày hết hạn là 1 tháng sau ngày sản xuất
            this.ngayHetHan = new Date(this.ngaySanXuat.getTime() + 30 * 24 * 60 * 60 * 1000L);
        }
    }

    // Phương thức kiểm tra xem hàng thực phẩm đã hết hạn chưa
    public boolean daHetHan() {
        Date ngayHienTai = new Date();
        return ngayHienTai.after(ngayHetHan);
    }

    // Phương thức toString
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());

        return "Ma hang: " + maHang + ", Ten hang: " + tenHang + ", Don gia: " + currencyFormat.format(donGia)
                + ", Ngay san xuat: " + dateFormat.format(ngaySanXuat) + ", Ngay het han: "
                + dateFormat.format(ngayHetHan);
    }
}

