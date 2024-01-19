package day4;   //Nhap 1 chuoi va 1 ky tu, kiem tra trong chuoi co ky tu do khong

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String string = scanner.nextLine();
        System.out.print("Nhap mot ky tu: ");
        char character = scanner.next().charAt(0);

        boolean scanChar = false;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (charArray[i] == character) {
                scanChar = true;
                break;
            }
        }

        if (scanChar) {
            System.out.println("Chuoi co ky tu vua nhap");
        } else {
            System.out.println("Chuoi khong co ky tu vua nhap");
        }
    }
}
