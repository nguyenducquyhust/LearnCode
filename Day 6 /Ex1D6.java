import java.util.Scanner;

public class Ex1D6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhap Chuoi ");
        String chuoi = scanner.nextLine();

        int soTu = demSoTu(chuoi);
        System.out.println(" chuoi " + chuoi + " co : " + soTu + " tu " );

    }

    public static int demSoTu(String chuoi) {
        if (chuoi == null) {
            return 0;
        }
        int soTu = 0;
        boolean kiemTrakhoangTrang = false;

        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);

            if (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
                kiemTrakhoangTrang = false;
            } else if (!kiemTrakhoangTrang) {
                soTu++;
                kiemTrakhoangTrang = true;
            }

        }
        return soTu;
    }
}
