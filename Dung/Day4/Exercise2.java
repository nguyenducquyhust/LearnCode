package day4;    //Nhập vào 1 chuỗi và cắt những ký tự trắng ( space ) ở cuối chuỗi

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String string = scanner.nextLine();

        char[] charArray = string.toCharArray();
        for (int i = string.length() - 1; i >= 0; i--) {
            if (charArray[i] != 32) {
                break;
            } else {
                string = string.substring(0, string.length() - 1);
            }
        }

        System.out.println("Chuoi sau khi xoa nhung ky tu space o cuoi chuoi la: " + string);
    }
}
