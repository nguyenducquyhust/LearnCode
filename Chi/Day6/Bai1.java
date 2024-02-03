package Day_6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int soTu = 0;
        boolean timKhoangTrang = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' && string.charAt(i) != '\t' && string.charAt(i) != '\n') {
                if (timKhoangTrang) {
                    soTu++;
                    timKhoangTrang = false;
                }
            } else {
                timKhoangTrang = true;
            }
        }

        System.out.println("So tu trong chuoi vua nhap la: " + soTu);
    }
}

