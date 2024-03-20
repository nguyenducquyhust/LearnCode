package exercise8;


import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang {
    Scanner scanner = new Scanner(System.in);
    protected String quocTich;

    public KhachHangNuocNgoai() {
        super();
    }

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoasDon, Integer soLuong, Float donGia, String quocTich) {
        super(maKhachHang, hoTen, ngayRaHoasDon, soLuong, donGia);
        this.quocTich = quocTich;
    }


    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }


    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +
                super.toString() +
                "quocTich='" + quocTich + '\'' +
                '}';
    }

    public void nhapThongTinKhachHang() {
        super.nhapThongTinKhachHang();
        System.out.println(" Quoc tich: ");
        quocTich = scanner.nextLine();
    }

    public void hienThiThongTinKhachHang() {
        super.hienThiThongTinKhachHang();
        System.out.println(" Quoc tich: " + quocTich);

    }
}


