import java.util.Scanner;

public class CheckChaOnString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap  chuoi 1 : ");

        String chuoi1 = scanner.nextLine();

        System.out.println("Nhap ky tu 1 : ");
        char kyTu1 = scanner.next().charAt(0);

        char kyTuTrongChuoi;
        boolean coChuaKyTu = false;

        for (int i = 0; i <= chuoi1.length(); i++) {
            kyTuTrongChuoi = chuoi1.charAt(i);
            if (kyTuTrongChuoi == kyTu1) {
                coChuaKyTu = true;
                break;
            }
        }
        if (coChuaKyTu) {
            System.out.println("Chuoi chua ky tu : " + kyTu1);
        }else {
            System.out.println("chuoi khong chua ki tu " + kyTu1);
        }
    }
}
