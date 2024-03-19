package day11.exercise6;

public class SachTK extends Sach {
    protected int thue;

    public SachTK() {
        super();
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap thue: ");
        this.thue = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", thue=" + thue +
                '}';
    }

    public long thanhTien(int thue, SachTK sachTK) {
        return sachTK.getSoLuong() * sachTK.getDonGia() + this.thue;
    }
}
