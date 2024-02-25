import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // khai báo số dòng và số cột cho mảng
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        n = scanner.nextInt();

        // khai báo mảng
        int[][] A = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
