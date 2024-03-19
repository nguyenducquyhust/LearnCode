package day11.exercise7;

public class Vang extends GiaoDich {
    protected String loaiVang;

    public Vang() {
        super();
    }

    public String getLoaiVang() {
        return loaiVang;
    }


    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap loai vang: ");
        this.loaiVang = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", loaiVang='" + loaiVang + '\'' +
                '}';
    }

    public long thanhTien(Vang vang) {
        return vang.getSoLuong() * vang.getDonGia();
    }
}
