import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // khai báo số dòng và số cột của ma trận
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        // khai báo ma trận arr có m dòng, n cột
        int arr[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        // Tính tổng từng hàng
        int[] tongHang = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tongHang[i] += arr[i][j];
            }
        }

        // Tính tổng từng cột
        int[] tongCot = new int[arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                tongCot[i] += arr[j][i];
            }
        }

        // In kết quả
        System.out.println("Tổng từng hàng:");
        for (int i = 0; i < tongHang.length; i++) {
            System.out.println("Hàng " + (i + 1) + ": " + tongHang[i]);
        }

        System.out.println("Tổng từng cột:");
        for (int i = 0; i < tongCot.length; i++) {
            System.out.println("Cột " + (i + 1) + ": " + tongCot[i]);
        }
    }
}
