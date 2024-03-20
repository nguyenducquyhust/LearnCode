package Bai5;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
    Scanner scanner = new Scanner(System.in);

    protected String soTuyen;
    protected double soKmDiDuoc;

    public ChuyenXeNoiThanh() {
        super();
    }

    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" +
                "soTuyen='" + soTuyen + '\'' +
                ", soKmDiDuoc=" + soKmDiDuoc +
                ", maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTaiXe='" + hoTenTaiXe + '\'' +
                ", soXe=" + soXe +
                ", doanhThu=" + doanhThu +
                '}';
    }

    /**
     * ham nhap thong tin
     */
    public void nhapThongTinChuyenXe() {

        // gọi hàm nhapThongTinChuyenXe() của lớp exercise5.ChuyenXe
        super.nhapThongTinChuyenXe();

        System.out.print("Nhap so tuyen: ");
        this.soTuyen = scanner.nextLine();

        System.out.print("Nhap so km di duoc : ");
        this.soKmDiDuoc = scanner.nextDouble();
    }
}
