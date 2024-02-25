package day7;       // Tìm phần tử nhỏ nhất, lớn nhất trong mảng 2 chiều

import java.util.Scanner;

public class Exercise2 {
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

        int max = arr[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        int min = arr[0][0];
        int minRow = 0;
        int minColumn = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxRow = i;
                    maxColumn = j;
                }

                if (min > arr[i][j]) {
                    min = arr[i][j];
                    minRow = i;
                    minColumn = j;
                }
            }
        }

        System.out.println("Vi tri phan tu lon nhat trong mang la: arr[" + maxRow + "][" + maxColumn + "]");
        System.out.println("Vi tri phan tu nho nhat trong mang la: arr[" + minRow + "][" + minColumn + "]");
    }
}
