package day4;  //Kiem tra chuoi vua nhap co ky tu in hoa khong

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String string = scanner.nextLine();

        boolean foundUpperCaseChar = false;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                foundUpperCaseChar = true;
                break;
            }
        }

        if (foundUpperCaseChar) {
            System.out.println("Chuoi co ky tu in hoa");
        } else {
            System.out.println("Chuoi khong co ky tu in hoa");
        }
    }
}
