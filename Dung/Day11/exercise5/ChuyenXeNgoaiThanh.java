package day11.exercise5;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public ChuyenXeNgoaiThanh() {
        super();
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap noi den: ");
        this.noiDen = scanner.nextLine();
        System.out.print("Nhap so ngay di duoc: ");
        this.soNgayDiDuoc = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "ChuyenXeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                '}';
    }
}
