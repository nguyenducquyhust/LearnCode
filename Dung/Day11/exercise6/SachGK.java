package day11.exercise6;

public class SachGK extends Sach {
    protected String tinhTrang;

    public SachGK() {
        super();
    }


    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        do {
            System.out.print("Nhap tinh trang (moi / cu) : ");
            this.tinhTrang = scanner.nextLine();
        } while (!tinhTrang.equals("moi") && !tinhTrang.equals("cu"));
    }

    public long thanhTien(String tinhTrang, SachGK sachGK) {
        if (tinhTrang.equals("moi")) {
            return sachGK.getSoLuong() * sachGK.getDonGia();
        } else {
            return sachGK.getSoLuong() * sachGK.getDonGia() / 2;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }
}
