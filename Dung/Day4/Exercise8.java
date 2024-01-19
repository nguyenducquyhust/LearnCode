package day4;  //Tim so chan cuoi cung trong mang

import java.util.Scanner;

public class Exercise8 {
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

        boolean foundEvenValue = true;
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                foundEvenValue = false;
                System.out.println("So chan cuoi cung trong mang la: " + array[i]);
                break;
            }
        }

        if (foundEvenValue) {
            System.out.println("Khong co so chan trong mang");
        }
    }
}
