package day7;               //Sử dụng foreach để in các phần tử của mảng

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so hang cua mang: ");
            n = scanner.nextInt();
        } while (n < 1);

        int m;
        do {
            System.out.print("Nhap so cot cua mang: ");
            m = scanner.nextInt();
        } while (m < 1);

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap phan tu arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println("\n");
        }
    }
}
