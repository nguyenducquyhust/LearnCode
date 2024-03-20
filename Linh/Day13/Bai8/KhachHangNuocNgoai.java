package Bai8;

import java.time.LocalDate;

public class KhachHangNuocNgoai {
    protected String quocTinh;
    public KhachHangNuocNgoai(){

    }

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayRaHoaDon, Integer soLuong, Float donGia, String quocTinh) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTinh = quocTinh;
    }

    public String getQuocTinh() {
        return quocTinh;
    }

    public void setQuocTinh(String quocTinh) {
        this.quocTinh = quocTinh;
    }

    @Override
    public String toString() {
        super.toString();
        return "khachHangNuocNgoai{" +
                "quocTinh='" + quocTinh + '\'' +
                '}';
    }

}

}
