package day1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner console = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen duong n: ");
            n = console.nextInt();
        } while (n <= 0);

        if (n % 2 == 0) {
            for (int i = 0; i <= n; i += 2) {
                sum += i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        }
        System.out.printf("Tong bang %d", sum);
    }
}
