import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // number of string in array
        System.out.println("nhập số chuỗi trong mảng: ");
        int n = sc.nextInt();
        String[] array = new String[n]; // Khai báo mảng chuỗi

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập chuỗi thứ " + (i + 1) + ": ");
            array[i] = sc.nextLine(); // Đọc và lưu trữ chuỗi vào mảng
        }

        // In ra các phần tử của mảng
        for (String str : array) {
            System.out.println(str);
        }
    }
}
