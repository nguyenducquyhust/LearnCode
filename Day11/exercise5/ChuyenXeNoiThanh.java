package Day12.exercise5;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soChuyen;
    private int soKmDiDuoc;

    public ChuyenXeNoiThanh() {
        super();
    }
    public ChuyenXeNoiThanh(int soChuyen, int soKmDiDuoc) {
        this.soChuyen = soChuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, long doanhThu, int soChuyen,int soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soChuyen = soChuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }


    public int getSoChuyen() {
        return soChuyen;
    }

    public void setSoChuyen(int soChuyen) {
        this.soChuyen = soChuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" +
                "soChuyen=" + soChuyen +
                ", soKmDiDuoc='" + soKmDiDuoc + '\'' +
                '}';
    }

    public void nhapThongTin() {
        super.nhapThongTin(); // Gọi phương thức nhập thông tin từ lớp cha

        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner

        System.out.println("Nhập số chuyến: ");
        this.soChuyen = scanner.nextInt();

        System.out.println("Nhập số km đi được: ");
        this.soKmDiDuoc = scanner.nextInt();
    }
}
