package day4; //Tim gia tri duong dau tien trong mang

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        for (; ; ) {
            System.out.print("Nhap vao so phan tu trong mang: ");
            n = scanner.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.print("So phan tu khong hop le. Moi nhap lai. ");
            }
        }

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int a = i + 1;
            System.out.print("Nhap phan tu thu " + a + " trong mang: ");
            array[i] = scanner.nextInt();
        }

        boolean foundPositiveValue = true;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                foundPositiveValue = false;
                System.out.println("Gia tri duong dau tien trong mang la: " + array[i]);
                break;
            }
        }

        if (foundPositiveValue) {
            System.out.println("Khong co gia tri duong trong mang");
        }
    }
}