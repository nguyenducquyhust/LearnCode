package day11.exercise7;

public class TienTe extends GiaoDich {
    protected float tiGia;
    protected String loaiTienTe;
    protected int num;

    public TienTe() {
        super();
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String loaiTien(int num) {
        switch (num) {
            case 1:
                loaiTienTe = "VN";
                break;
            case 2:
                loaiTienTe = "USD";
                break;
            case 3:
                loaiTienTe = "Euro";
                break;
            default:
                break;
        }

        return loaiTienTe;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap ti gia: ");
        this.tiGia = scanner.nextFloat();

        do {
            System.out.print("Nhap loai tien te (1 - VN / 2 - USD / 3 - Euro");
            this.num = scanner.nextInt();
        } while (num > 3 || num < 1);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", tiGia=" + tiGia +
                ", loaiTienTe='" + this.loaiTien(num) + '\'' +
                '}';
    }

    public double thanhTien(TienTe tienTe) {
        if (tienTe.getNum() == 1) {
            return (double) tienTe.getSoLuong() * tienTe.getDonGia();
        } else {
            return tienTe.getSoLuong() * tienTe.getDonGia() * tienTe.getTiGia();
        }
    }
}
