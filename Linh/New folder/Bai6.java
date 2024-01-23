package Day4;      //Tính tổng các phần tử chia hết cho 5 trong mảng

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu co trong mang:");
        int soPhanTu = scanner.nextInt();

        int[] array = new int[soPhanTu];

        for (int i = 0; i < soPhanTu; i++) {
            int j = i + 1;
            System.out.println("Nhap phan tu thu " + j +": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < soPhanTu; i++) {
            if (array[i] % 5 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Tong cac phan tu chia het cho 5: " + sum);
    }
}
