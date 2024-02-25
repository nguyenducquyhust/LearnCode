package day7;            // Tính tổng từng hàng, từng cột của mảng 2 chiều

import java.util.Scanner;

public class Exercise3 {
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

        int[] sumOfRows = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumOfRows[i] += arr[i][j];
            }
        }

        int[] sumOfColumns = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                sumOfColumns[i] += arr[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("- Tong hang " + (i + 1) + ": " + sumOfRows[i]);
        }

        System.out.println("\n");

        for (int i = 0; i < m; i++) {
            System.out.println("- Tong cot " + (i + 1) + ": " + sumOfColumns[i]);
        }

    }
}
