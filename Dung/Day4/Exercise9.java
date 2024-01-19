package day4;  //Tim vi tri phan tu duong nho nhat trong mang

import java.util.Scanner;

public class Exercise9 {
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

        int min = array[0];
        boolean foundPositiveValue = true;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                foundPositiveValue = false;
                min = array[i];
                break;
            }
        }

        if (foundPositiveValue) {
            System.out.println("Khong co phan tu duong trong mang");
        } else {
            for (int i = 0; i < n; i++) {
                if (min >= array[i] && array[i] > 0) {
                    min = array[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (array[i] == min) {
                    int b = i + 1;
                    System.out.println("Phan tu thu " + b + " mang gia tri duong nho nhat trong mang");
                }
            }
        }
    }
}
