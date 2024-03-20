package exercise5;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    Scanner scanner = new Scanner(System.in);

    protected String noiDen;
    protected int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh() {
        super();
    }

    public ChuyenXeNgoaiThanh(Scanner scanner, String noiDen, int soNgayDiDuoc) {
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

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

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
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

        System.out.print("Nhap noi den: ");
        this.noiDen = scanner.nextLine();

        System.out.print("Nhap so ngay di duoc: ");
        this.soNgayDiDuoc = scanner.nextInt();
    }
}
