package day2;//Nhập vào N số, sau đó in ra số đầu tiên và gần cuối cùng

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so n: ");
            n = console.nextInt();
        } while (n <= 0);
        int[] array = new int[n]; //thiet lap mang

        for (int i = 0; i < n; i++) {
            int a = i + 1;
            System.out.print("Nhap so thu" + " " + a + ": ");
            array[i] = console.nextInt();  //nhap gia tri cac phan tu
        }

        System.out.println("So dau tien la: " + array[0]);
        System.out.println("So gan cuoi cung la: " + array[n - 2]);
    }
}
