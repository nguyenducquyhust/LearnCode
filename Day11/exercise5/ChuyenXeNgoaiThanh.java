package Day12.exercise5;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    public String getNoiDen() {
        return noiDen;
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, long doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
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
    public ChuyenXeNgoaiThanh () {
        super();
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                '}';
    }

    public void nhapThongTin ()  {
        super.nhapThongTin();

        System.out.println(" Nhap noi den : ");
        noiDen = scanner.nextLine();

        System.out.println(" Nhap so ngay di duoc : ");
        soNgayDiDuoc = scanner.nextInt();
        scanner.nextLine();

    }
}
