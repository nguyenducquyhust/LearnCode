import java.util.Scanner;

public class Ex1D7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        int m = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        int n = scanner.nextInt();

        // Khởi tạo và nhập mảng
        int[][] A = inputArray(scanner, m, n);

        // In mảng
        printArray(A);
    }

    // Phương thức nhập mảng
    public static int[][] inputArray(Scanner scanner, int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    // Phương thức in mảng
    public static void printArray(int[][] array) {
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
