package exercise6;

public class SachThamKhao extends Sach {
    private double thanhTien;
    private double thue;

    public SachThamKhao() {
        super();
    }

    public SachThamKhao(double thanhTien, double thue) {
        super();
        this.thanhTien = thanhTien;
        this.thue = thue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public String toString() {
        return super.toString() + "SachThamKhao{" +
                "thanhTien=" + thanhTien +
                ", thue=" + thue +
                '}';
    }

    /**
     * ham nhap
     */
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap thue: ");
        thue = scanner.nextDouble();
    }

    public double thanhTien(double thue, SachThamKhao sachThamKhao) {
        return sachThamKhao.getSoLuong() * sachThamKhao.getDonGia() + this.thue;
    }
}
