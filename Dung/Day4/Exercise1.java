package day4;  //Nhap 1 chuoi va kiem tra chuoi do co chua ky tu so khong

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String string = scanner.nextLine();

        boolean foundNumber = false;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                foundNumber = true;
                break;
            }
        }

        if (foundNumber) {
            System.out.println("Chuoi co chua ky tu so");
        } else {
            System.out.println("Chuoi khong chua ky tu so");
        }
    }
}
