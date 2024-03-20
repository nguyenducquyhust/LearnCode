package exercise6;

public class SachGiaoKhoa extends Sach {
    protected String tinhTrang;
    protected double thanhTien;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String tinhTrang, double thanhTien) {
        super();
        this.tinhTrang = tinhTrang;
        this.thanhTien = thanhTien;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }



    @Override
    public String toString() {
        return "SachGiaoKhoa{" +
                "tinhTrang='" + tinhTrang + '\'' +
                ", thanhTien=" + thanhTien +
                ", maSach='" + maSach + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }


    /**
     * ham nhap
     */
    public void nhapSach() {
        super.nhapSach();
        do {
            System.out.print("Nhap tinh trang (moi / cu) : ");
            this.tinhTrang = scanner.nextLine();
        } while (!tinhTrang.equals("moi") && !tinhTrang.equals("cu"));
    }

    /**
     * ham tinh tien
     * @param tinhTrang
     * @param sachGiaoKhoa
     * @return
     */
    public double thanhTien(String tinhTrang, SachGiaoKhoa sachGiaoKhoa) {
        if (tinhTrang.equals("moi")) {
            return sachGiaoKhoa.getSoLuong() * sachGiaoKhoa.getDonGia();
        } else {
            return sachGiaoKhoa.getSoLuong() * sachGiaoKhoa.getDonGia() / 2;
        }
    }
}
