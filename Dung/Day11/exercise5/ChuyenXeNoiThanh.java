package day11.exercise5;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private int soKmDiDuoc;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public ChuyenXeNoiThanh() {
        super();
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap so tuyen: ");
        this.soTuyen = scanner.nextInt();
        System.out.print("Nhap so km di duoc: ");
        this.soKmDiDuoc = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "ChuyenXeNoiThanh{" +
                "soTuyen=" + soTuyen +
                ", soKmDiDuoc=" + soKmDiDuoc +
                '}';
    }
}
