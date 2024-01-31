import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Nhap so thu nhat, so thu 2
        System.out.print("Nhap so thu nhat: ");
        float soThuNhat = nhapLieu();
        System.out.print("Nhap so thu hai: ");
        float soThu2 = nhapLieu();
        // Tim hieu 2 so
        System.out.println("Hieu cua hai so la: " + hieu(soThuNhat, soThu2));
        //Tinh thuong hai so
        System.out.println("Thuong cua hai so la: " + thuong(soThuNhat, soThu2));
        //Tinh UCLN hai so
        int kiemTraSoThuNhat = kiemTraso(soThuNhat);
        int kiemTraSoThu2 = kiemTraso(soThu2);
        if (kiemTraSoThuNhat == 1 && kiemTraSoThu2 == 1) {
            System.out.println("Uoc chung lon nhat cua hai so la: " + uocChungLonNhat(soThuNhat, soThu2));
        } else {
            System.out.println("Khong co uoc chung lon nhat");
        }
    }

    //Ham nhap lieu
    static float nhapLieu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    //Ham tinh hieu
    static float hieu(float a, float b) {
        return a - b;
    }

    //Ham tinh thuong
    static float thuong(float a, float b) {
        float thuong = 0;
        if (b != 0) {
            thuong = a / b;
        } else {
            System.out.println(" Loi so.Vui long nhap lai");
        }
        return thuong;
    }

    //Ham kiem tra xem cac so la so thuc hay so nguyen
    static int kiemTraso(float so) {
        int kiemTra = 1;
        if (Math.ceil(so) != Math.floor(so)) {    //kiemTra = 0 => so thuc
            kiemTra = 0;                          //kiemTra = 1 => so nguyen
        }
        return kiemTra;
    }

    //Ham tim UCLN
    static int uocChungLonNhat(float soThuNhat, float soThu2) {
        int UCLN = 1;
        if (soThuNhat == 0 || soThu2 == 0) {
            System.out.println("Khong co uoc chung lon nhat");
        } else {
            for (int i = 1; i <= Math.abs(soThuNhat) && i <= Math.abs(soThu2); i++) {
                if (soThuNhat % i == 0 && soThu2 % i == 0) {
                    UCLN = i;
                }
            }
        }
        return UCLN;
    }
}
