package day4;  //Tinh tong cac phan tu chia het cho 5 trong mang

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        for (; ; ) {
            System.out.print("Nhap vao so phan tu trong mang: ");
            n = scanner.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.print("So phan tu khong hop le.   Moi nhap lai. ");
            }
        }

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int a = i + 1;
            System.out.print("Nhap phan tu thu " + a + " trong mang: ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 5 == 0) {
                sum += array[i];
            }
        }

        System.out.println("Tong cac phan tu chia het cho 5 trong mang la: " + sum);
    }
}
